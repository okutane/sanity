/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package na.okutane.cpp.llvm;

public class DIImportedModule extends DIDescriptor {
  private long swigCPtr;

  protected DIImportedModule(long cPtr, boolean cMemoryOwn) {
    super(bitreaderJNI.DIImportedModule_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DIImportedModule obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        bitreaderJNI.delete_DIImportedModule(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DIImportedModule(MDNode N) {
    this(bitreaderJNI.new_DIImportedModule(MDNode.getCPtr(N), N), true);
  }

  public DIScope getContext() {
    return new DIScope(bitreaderJNI.DIImportedModule_getContext(swigCPtr, this), true);
  }

  public DINameSpace getNameSpace() {
    return new DINameSpace(bitreaderJNI.DIImportedModule_getNameSpace(swigCPtr, this), true);
  }

  public long getLineNumber() {
    return bitreaderJNI.DIImportedModule_getLineNumber(swigCPtr, this);
  }

  public boolean Verify() {
    return bitreaderJNI.DIImportedModule_Verify(swigCPtr, this);
  }

}
