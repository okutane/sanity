/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package na.okutane.cpp.llvm;

public class SWIGTYPE_p_p_LLVMOpaqueMemoryBuffer {
  private transient long swigCPtr;

  protected SWIGTYPE_p_p_LLVMOpaqueMemoryBuffer(long cPtr, @SuppressWarnings("unused") boolean futureUse) {
    swigCPtr = cPtr;
  }

  protected SWIGTYPE_p_p_LLVMOpaqueMemoryBuffer() {
    swigCPtr = 0;
  }

  protected static long getCPtr(SWIGTYPE_p_p_LLVMOpaqueMemoryBuffer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public boolean equals(Object obj) {
    boolean equal = false;
    if (obj instanceof SWIGTYPE_p_p_LLVMOpaqueMemoryBuffer)
      equal = (((SWIGTYPE_p_p_LLVMOpaqueMemoryBuffer)obj).swigCPtr == this.swigCPtr);
    return equal;
  }

  public int hashCode() {
     return Long.hashCode(swigCPtr);
  }
}

