/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package na.okutane.cpp.llvm;

public final class LLVMAtomicOrdering {
  public final static LLVMAtomicOrdering LLVMAtomicOrderingNotAtomic = new LLVMAtomicOrdering("LLVMAtomicOrderingNotAtomic", bitreaderJNI.LLVMAtomicOrderingNotAtomic_get());
  public final static LLVMAtomicOrdering LLVMAtomicOrderingUnordered = new LLVMAtomicOrdering("LLVMAtomicOrderingUnordered", bitreaderJNI.LLVMAtomicOrderingUnordered_get());
  public final static LLVMAtomicOrdering LLVMAtomicOrderingMonotonic = new LLVMAtomicOrdering("LLVMAtomicOrderingMonotonic", bitreaderJNI.LLVMAtomicOrderingMonotonic_get());
  public final static LLVMAtomicOrdering LLVMAtomicOrderingAcquire = new LLVMAtomicOrdering("LLVMAtomicOrderingAcquire", bitreaderJNI.LLVMAtomicOrderingAcquire_get());
  public final static LLVMAtomicOrdering LLVMAtomicOrderingRelease = new LLVMAtomicOrdering("LLVMAtomicOrderingRelease", bitreaderJNI.LLVMAtomicOrderingRelease_get());
  public final static LLVMAtomicOrdering LLVMAtomicOrderingAcquireRelease = new LLVMAtomicOrdering("LLVMAtomicOrderingAcquireRelease", bitreaderJNI.LLVMAtomicOrderingAcquireRelease_get());
  public final static LLVMAtomicOrdering LLVMAtomicOrderingSequentiallyConsistent = new LLVMAtomicOrdering("LLVMAtomicOrderingSequentiallyConsistent", bitreaderJNI.LLVMAtomicOrderingSequentiallyConsistent_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static LLVMAtomicOrdering swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + LLVMAtomicOrdering.class + " with value " + swigValue);
  }

  private LLVMAtomicOrdering(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private LLVMAtomicOrdering(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private LLVMAtomicOrdering(String swigName, LLVMAtomicOrdering swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static LLVMAtomicOrdering[] swigValues = { LLVMAtomicOrderingNotAtomic, LLVMAtomicOrderingUnordered, LLVMAtomicOrderingMonotonic, LLVMAtomicOrderingAcquire, LLVMAtomicOrderingRelease, LLVMAtomicOrderingAcquireRelease, LLVMAtomicOrderingSequentiallyConsistent };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

