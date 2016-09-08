/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package na.okutane.cpp.llvm;

public final class LLVMVisibility {
  public final static LLVMVisibility LLVMDefaultVisibility = new LLVMVisibility("LLVMDefaultVisibility");
  public final static LLVMVisibility LLVMHiddenVisibility = new LLVMVisibility("LLVMHiddenVisibility");
  public final static LLVMVisibility LLVMProtectedVisibility = new LLVMVisibility("LLVMProtectedVisibility");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static LLVMVisibility swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + LLVMVisibility.class + " with value " + swigValue);
  }

  private LLVMVisibility(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private LLVMVisibility(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private LLVMVisibility(String swigName, LLVMVisibility swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static LLVMVisibility[] swigValues = { LLVMDefaultVisibility, LLVMHiddenVisibility, LLVMProtectedVisibility };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

