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

import com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import com.oracle.truffle.api.interop.ForeignAccess;
import com.oracle.truffle.api.interop.TruffleObject;
import com.oracle.truffle.llvm.runtime.LLVMFunctionDescriptor.LLVMRuntimeType;

public class LLVMTruffleAddress implements TruffleObject {
    private final LLVMAddress address;
    private final LLVMRuntimeType type;

    public LLVMTruffleAddress(LLVMAddress address, LLVMRuntimeType type) {
        this.address = address;
        this.type = type;
    }

    public LLVMAddress getAddress() {
        return address;
    }

    public LLVMRuntimeType getType() {
        return type;
    }

    public static boolean isInstance(TruffleObject object) {
        return object instanceof LLVMTruffleAddress;
    }

    @CompilationFinal
    private static ForeignAccess ACCESS;

    @Override
    public ForeignAccess getForeignAccess() {
        if (ACCESS == null) {
            try {
                Class<?> accessor = getLLVMAddressMessageResolutionAccessorClass();
                ACCESS = (ForeignAccess) accessor.getField("ACCESS").get(null);
            } catch (Exception e) {
                throw new AssertionError(e);
            }
        }
        return ACCESS;
    }

    // needed by SVM
    private static Class<?> getLLVMAddressMessageResolutionAccessorClass() throws ClassNotFoundException {
        return Class.forName("com.oracle.truffle.llvm.nodes.intrinsics.interop.LLVMAddressMessageResolutionAccessor");
    }
}
