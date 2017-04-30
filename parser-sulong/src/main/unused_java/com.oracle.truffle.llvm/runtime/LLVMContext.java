/*
 * Copyright (c) 2016, Oracle and/or its affiliates.
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this list of
 * conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of
 * conditions and the following disclaimer in the documentation and/or other materials provided
 * with the distribution.
 *
 * 3. Neither the name of the copyright holder nor the names of its contributors may be used to
 * endorse or promote products derived from this software without specific prior written
 * permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS
 * OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE
 * GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.oracle.truffle.llvm.runtime;

import com.oracle.truffle.api.CompilerDirectives.TruffleBoundary;
import com.oracle.truffle.api.ExecutionContext;
import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.TruffleLanguage.Env;
import com.oracle.truffle.api.interop.TruffleObject;
import com.oracle.truffle.api.source.Source;
import com.oracle.truffle.llvm.runtime.LLVMFunctionDescriptor.LLVMRuntimeType;
import com.oracle.truffle.llvm.runtime.memory.LLVMHeapFunctions;
import com.oracle.truffle.llvm.runtime.memory.LLVMStack;
import com.oracle.truffle.llvm.runtime.options.LLVMOptions;
import com.oracle.truffle.llvm.runtime.types.Type;

import java.util.*;

public class LLVMContext extends ExecutionContext {

    private final List<RootCallTarget> globalVarInits = new ArrayList<>();
    private final List<RootCallTarget> globalVarDeallocs = new ArrayList<>();
    private final List<RootCallTarget> constructorFunctions = new ArrayList<>();
    private final List<RootCallTarget> destructorFunctions = new ArrayList<>();
    private final Deque<RootCallTarget> atExitFunctions = new ArrayDeque<>();
    private final List<LLVMThread> runningThreads = new ArrayList<>();

    private final LLVMGlobalVariableRegistry globalVariableRegistry = new LLVMGlobalVariableRegistry();

    private final NativeLookup nativeLookup;

    private final LLVMHeapFunctions heapFunctions;

    private final LLVMStack stack = new LLVMStack();

    private Object[] mainArguments;

    private Source mainSourceFile;

    private boolean parseOnly;
    private boolean haveLoadedDynamicBitcodeLibraries;

    private int currentFunctionIndex = 0;
    private final List<LLVMFunctionDescriptor> functionDescriptors = new ArrayList<>();
    private final HashMap<String, LLVMFunctionDescriptor> functionIndex;

    public LLVMContext(Env env) {
        this.nativeLookup = LLVMOptions.ENGINE.disableNativeInterface() ? null : new NativeLookup(env);
        this.functionIndex = new HashMap<>();
        this.heapFunctions = new LLVMHeapFunctionsImpl(nativeLookup);
    }

    public LLVMHeapFunctions getHeapFunctions() {
        return heapFunctions;
    }

    public LLVMGlobalVariableRegistry getGlobalVariableRegistry() {
        return globalVariableRegistry;
    }

    public void addLibraryToNativeLookup(String library) {
        nativeLookup.addLibraryToNativeLookup(library);
    }

    public LLVMStack getStack() {
        return stack;
    }

    public void setMainArguments(Object[] mainArguments) {
        this.mainArguments = mainArguments;
    }

    public Object[] getMainArguments() {
        return mainArguments;
    }

    public void setMainSourceFile(Source mainSourceFile) {
        this.mainSourceFile = mainSourceFile;
    }

    public Source getMainSourceFile() {
        return mainSourceFile;
    }

    public void registerGlobalVarDealloc(RootCallTarget globalVarDealloc) {
        globalVarDeallocs.add(globalVarDealloc);
    }

    public void registerConstructorFunction(RootCallTarget constructorFunction) {
        constructorFunctions.add(constructorFunction);
    }

    public void registerDestructorFunction(RootCallTarget destructorFunction) {
        destructorFunctions.add(destructorFunction);
    }

    public void registerAtExitFunction(RootCallTarget atExitFunction) {
        atExitFunctions.push(atExitFunction);
    }

    public void registerGlobalVarInit(RootCallTarget globalVarInit) {
        globalVarInits.add(globalVarInit);
    }

    public synchronized void registerThread(LLVMThread thread) {
        assert !runningThreads.contains(thread);
        runningThreads.add(thread);
    }

    public synchronized void unregisterThread(LLVMThread thread) {
        runningThreads.remove(thread);
        assert !runningThreads.contains(thread);
    }

    @TruffleBoundary
    public synchronized void shutdownThreads() {
        // we need to iterate over a copy of the list, because stop() can modify the original list
        for (LLVMThread node : new ArrayList<>(runningThreads)) {
            node.stop();
        }
    }

    @TruffleBoundary
    public synchronized void awaitThreadTermination() {
        shutdownThreads();

        while (!runningThreads.isEmpty()) {
            LLVMThread node = runningThreads.get(0);
            node.awaitFinish();
            assert !runningThreads.contains(node); // should be unregistered by LLVMThreadNode
        }
    }

    public List<RootCallTarget> getGlobalVarDeallocs() {
        return globalVarDeallocs;
    }

    public List<RootCallTarget> getConstructorFunctions() {
        return constructorFunctions;
    }

    public List<RootCallTarget> getDestructorFunctions() {
        return destructorFunctions;
    }

    public Deque<RootCallTarget> getAtExitFunctions() {
        return atExitFunctions;
    }

    public List<RootCallTarget> getGlobalVarInits() {
        return globalVarInits;
    }

    public synchronized List<LLVMThread> getRunningThreads() {
        return Collections.unmodifiableList(runningThreads);
    }

    public void setParseOnly(boolean parseOnly) {
        this.parseOnly = parseOnly;
    }

    public boolean isParseOnly() {
        return parseOnly;
    }

    public boolean haveLoadedDynamicBitcodeLibraries() {
        return haveLoadedDynamicBitcodeLibraries;
    }

    public void setHaveLoadedDynamicBitcodeLibraries() {
        haveLoadedDynamicBitcodeLibraries = true;
    }

    public static String getNativeSignature(LLVMRuntimeType retType, Type[] args, int skipArguments) {
        return NativeLookup.prepareSignature(retType, args, skipArguments);
    }

    public TruffleObject resolveAsNativeFunction(LLVMFunctionDescriptor descriptor) {
        return nativeLookup.resolveAsNative(descriptor);
    }

    public TruffleObject getNativeData(String name) {
        return nativeLookup.getNativeDataObject(name);
    }

    public LLVMFunctionDescriptor lookup(LLVMFunction handle) {
        return functionDescriptors.get(handle.getFunctionIndex());
    }

    public List<LLVMFunctionDescriptor> getFunctionDescriptors() {
        return functionDescriptors;
    }

    public LLVMFunctionDescriptor getZeroFunctionDescriptor() {
        return functionDescriptors.get(0);
    }

    public interface FunctionFactory {
        LLVMFunctionDescriptor create(int index);
    }

    public LLVMFunctionDescriptor addFunction(String name, FunctionFactory factory) {
        LLVMFunctionDescriptor function = functionIndex.get(name);
        if (function == null) {
            function = factory.create(currentFunctionIndex++);
            functionDescriptors.add(function);
            functionIndex.put(name, function);

            assert function.getFunctionIndex() == currentFunctionIndex - 1;
            assert functionDescriptors.get(currentFunctionIndex - 1) == function;
        }
        return function;

    }

    public NativeLookup getNativeLookup() {
        return nativeLookup;
    }

}
