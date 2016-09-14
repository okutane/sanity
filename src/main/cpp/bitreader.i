%module bitreader

%{
#include "llvm-c/Core.h"
#include "llvm-c/IRReader.h"

LLVMModuleRef parse(const char *path) {
    LLVMModuleRef m;
    LLVMMemoryBufferRef membuf;
    char *errmsg;
    LLVMContextRef ctx = LLVMGetGlobalContext();

    if (LLVMCreateMemoryBufferWithContentsOfFile(path, &membuf, &errmsg)) {
        return 0;
    }
    if (LLVMParseIRInContext(ctx, membuf, &m, &errmsg)) {
        return 0;
    }
    return m;
}

const char *getMDString(LLVMValueRef valueRef) {
    unsigned int len;
    return LLVMGetMDString(valueRef, &len);
}

LLVMTypeRef getType(LLVMTypeRef *types, int i) {
    return types[i];
}

LLVMValueRef getValue(LLVMValueRef *values, int i) {
    return values[i];
}

const char *GetDataArrayString(LLVMValueRef Val);
LLVMRealPredicate GetFCmpPredicate(LLVMValueRef Inst);
double GetConstantFPDoubleValue(LLVMValueRef ConstantVal);

const char *SAGetInstructionDebugLocScopeFile(LLVMValueRef instruction);

%}

%contract LLVMGetOperand (LLVMValueRef Val, unsigned Index) {
require:
   Index >= 0 && Index < LLVMGetNumOperands(Val);
}

%typemap(javacode) SWIGTYPE * %{
  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof $javaclassname)
      equal = ((($javaclassname)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return Long.hashCode(swigCPtr);
  }
%}

#define __STDC_LIMIT_MACROS
#define __STDC_CONSTANT_MACROS

%include "llvm/Support/DataTypes.h"
%include "llvm-c/Types.h"
%include "llvm-c/Support.h"
%include "llvm-c/Core.h"
%include "llvm-c/IRReader.h"

%include "cmalloc.i"
%allocators(LLVMTypeRef);
%allocators(LLVMValueRef);

LLVMTypeRef getType(LLVMTypeRef *types, int i);
LLVMValueRef getValue(LLVMValueRef *values, int i);

LLVMModuleRef parse(const char *path);
const char *getMDString(LLVMValueRef valueRef);
const char* GetDataArrayString(LLVMValueRef Val);
LLVMRealPredicate GetFCmpPredicate(LLVMValueRef Inst);
double GetConstantFPDoubleValue(LLVMValueRef ConstantVal);

int SAGetInstructionDebugLocLine(LLVMValueRef instruction);
const char *SAGetInstructionDebugLocScopeFile(LLVMValueRef instruction);

%pragma(java) jniclasscode=%{
  static {
     System.loadLibrary("irreader");
  }
%}