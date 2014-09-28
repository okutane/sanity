/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package na.okutane.cpp.llvm;

public class DIGlobalVariable extends DIDescriptor {
  private long swigCPtr;

  protected DIGlobalVariable(long cPtr, boolean cMemoryOwn) {
    super(bitreaderJNI.DIGlobalVariable_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DIGlobalVariable obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        bitreaderJNI.delete_DIGlobalVariable(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DIGlobalVariable(MDNode N) {
    this(bitreaderJNI.new_DIGlobalVariable__SWIG_0(MDNode.getCPtr(N), N), true);
  }

  public DIGlobalVariable() {
    this(bitreaderJNI.new_DIGlobalVariable__SWIG_1(), true);
  }

  public DIScope getContext() {
    return new DIScope(bitreaderJNI.DIGlobalVariable_getContext(swigCPtr, this), true);
  }

  public StringRef getName() {
    return new StringRef(bitreaderJNI.DIGlobalVariable_getName(swigCPtr, this), true);
  }

  public StringRef getDisplayName() {
    return new StringRef(bitreaderJNI.DIGlobalVariable_getDisplayName(swigCPtr, this), true);
  }

  public StringRef getLinkageName() {
    return new StringRef(bitreaderJNI.DIGlobalVariable_getLinkageName(swigCPtr, this), true);
  }

  public StringRef getFilename() {
    return new StringRef(bitreaderJNI.DIGlobalVariable_getFilename(swigCPtr, this), true);
  }

  public StringRef getDirectory() {
    return new StringRef(bitreaderJNI.DIGlobalVariable_getDirectory(swigCPtr, this), true);
  }

  public long getLineNumber() {
    return bitreaderJNI.DIGlobalVariable_getLineNumber(swigCPtr, this);
  }

  public DIType getType() {
    return new DIType(bitreaderJNI.DIGlobalVariable_getType(swigCPtr, this), true);
  }

  public long isLocalToUnit() {
    return bitreaderJNI.DIGlobalVariable_isLocalToUnit(swigCPtr, this);
  }

  public long isDefinition() {
    return bitreaderJNI.DIGlobalVariable_isDefinition(swigCPtr, this);
  }

  public SWIGTYPE_p_llvm__GlobalVariable getGlobal() {
    long cPtr = bitreaderJNI.DIGlobalVariable_getGlobal(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_llvm__GlobalVariable(cPtr, false);
  }

  public SWIGTYPE_p_llvm__Constant getConstant() {
    long cPtr = bitreaderJNI.DIGlobalVariable_getConstant(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_llvm__Constant(cPtr, false);
  }

  public DIDerivedType getStaticDataMemberDeclaration() {
    return new DIDerivedType(bitreaderJNI.DIGlobalVariable_getStaticDataMemberDeclaration(swigCPtr, this), true);
  }

  public boolean Verify() {
    return bitreaderJNI.DIGlobalVariable_Verify(swigCPtr, this);
  }

}
