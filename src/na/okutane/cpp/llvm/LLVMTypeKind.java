/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package na.okutane.cpp.llvm;

public final class LLVMTypeKind {
  public final static LLVMTypeKind LLVMVoidTypeKind = new LLVMTypeKind("LLVMVoidTypeKind");
  public final static LLVMTypeKind LLVMHalfTypeKind = new LLVMTypeKind("LLVMHalfTypeKind");
  public final static LLVMTypeKind LLVMFloatTypeKind = new LLVMTypeKind("LLVMFloatTypeKind");
  public final static LLVMTypeKind LLVMDoubleTypeKind = new LLVMTypeKind("LLVMDoubleTypeKind");
  public final static LLVMTypeKind LLVMX86_FP80TypeKind = new LLVMTypeKind("LLVMX86_FP80TypeKind");
  public final static LLVMTypeKind LLVMFP128TypeKind = new LLVMTypeKind("LLVMFP128TypeKind");
  public final static LLVMTypeKind LLVMPPC_FP128TypeKind = new LLVMTypeKind("LLVMPPC_FP128TypeKind");
  public final static LLVMTypeKind LLVMLabelTypeKind = new LLVMTypeKind("LLVMLabelTypeKind");
  public final static LLVMTypeKind LLVMIntegerTypeKind = new LLVMTypeKind("LLVMIntegerTypeKind");
  public final static LLVMTypeKind LLVMFunctionTypeKind = new LLVMTypeKind("LLVMFunctionTypeKind");
  public final static LLVMTypeKind LLVMStructTypeKind = new LLVMTypeKind("LLVMStructTypeKind");
  public final static LLVMTypeKind LLVMArrayTypeKind = new LLVMTypeKind("LLVMArrayTypeKind");
  public final static LLVMTypeKind LLVMPointerTypeKind = new LLVMTypeKind("LLVMPointerTypeKind");
  public final static LLVMTypeKind LLVMVectorTypeKind = new LLVMTypeKind("LLVMVectorTypeKind");
  public final static LLVMTypeKind LLVMMetadataTypeKind = new LLVMTypeKind("LLVMMetadataTypeKind");
  public final static LLVMTypeKind LLVMX86_MMXTypeKind = new LLVMTypeKind("LLVMX86_MMXTypeKind");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static LLVMTypeKind swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + LLVMTypeKind.class + " with value " + swigValue);
  }

  private LLVMTypeKind(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private LLVMTypeKind(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private LLVMTypeKind(String swigName, LLVMTypeKind swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static LLVMTypeKind[] swigValues = { LLVMVoidTypeKind, LLVMHalfTypeKind, LLVMFloatTypeKind, LLVMDoubleTypeKind, LLVMX86_FP80TypeKind, LLVMFP128TypeKind, LLVMPPC_FP128TypeKind, LLVMLabelTypeKind, LLVMIntegerTypeKind, LLVMFunctionTypeKind, LLVMStructTypeKind, LLVMArrayTypeKind, LLVMPointerTypeKind, LLVMVectorTypeKind, LLVMMetadataTypeKind, LLVMX86_MMXTypeKind };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

