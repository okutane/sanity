/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package na.okutane.cpp.llvm;

public class DIObjCProperty extends DIDescriptor {
  private long swigCPtr;

  protected DIObjCProperty(long cPtr, boolean cMemoryOwn) {
    super(bitreaderJNI.DIObjCProperty_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DIObjCProperty obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        bitreaderJNI.delete_DIObjCProperty(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DIObjCProperty(MDNode N) {
    this(bitreaderJNI.new_DIObjCProperty(MDNode.getCPtr(N), N), true);
  }

  public StringRef getObjCPropertyName() {
    return new StringRef(bitreaderJNI.DIObjCProperty_getObjCPropertyName(swigCPtr, this), true);
  }

  public DIFile getFile() {
    return new DIFile(bitreaderJNI.DIObjCProperty_getFile(swigCPtr, this), true);
  }

  public long getLineNumber() {
    return bitreaderJNI.DIObjCProperty_getLineNumber(swigCPtr, this);
  }

  public StringRef getObjCPropertyGetterName() {
    return new StringRef(bitreaderJNI.DIObjCProperty_getObjCPropertyGetterName(swigCPtr, this), true);
  }

  public StringRef getObjCPropertySetterName() {
    return new StringRef(bitreaderJNI.DIObjCProperty_getObjCPropertySetterName(swigCPtr, this), true);
  }

  public boolean isReadOnlyObjCProperty() {
    return bitreaderJNI.DIObjCProperty_isReadOnlyObjCProperty(swigCPtr, this);
  }

  public boolean isReadWriteObjCProperty() {
    return bitreaderJNI.DIObjCProperty_isReadWriteObjCProperty(swigCPtr, this);
  }

  public boolean isAssignObjCProperty() {
    return bitreaderJNI.DIObjCProperty_isAssignObjCProperty(swigCPtr, this);
  }

  public boolean isRetainObjCProperty() {
    return bitreaderJNI.DIObjCProperty_isRetainObjCProperty(swigCPtr, this);
  }

  public boolean isCopyObjCProperty() {
    return bitreaderJNI.DIObjCProperty_isCopyObjCProperty(swigCPtr, this);
  }

  public boolean isNonAtomicObjCProperty() {
    return bitreaderJNI.DIObjCProperty_isNonAtomicObjCProperty(swigCPtr, this);
  }

  public DIType getType() {
    return new DIType(bitreaderJNI.DIObjCProperty_getType(swigCPtr, this), true);
  }

  public boolean Verify() {
    return bitreaderJNI.DIObjCProperty_Verify(swigCPtr, this);
  }

}
