/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package na.okutane.cpp.llvm;

public class APInt {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected APInt(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(APInt obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        bitreaderJNI.delete_APInt(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public APInt(long numBits, SWIGTYPE_p_uint64_t val, boolean isSigned) {
    this(bitreaderJNI.new_APInt__SWIG_0(numBits, SWIGTYPE_p_uint64_t.getCPtr(val), isSigned), true);
  }

  public APInt(long numBits, SWIGTYPE_p_uint64_t val) {
    this(bitreaderJNI.new_APInt__SWIG_1(numBits, SWIGTYPE_p_uint64_t.getCPtr(val)), true);
  }

  public APInt(long numBits, SWIGTYPE_p_ArrayRefT_uint64_t_t bigVal) {
    this(bitreaderJNI.new_APInt__SWIG_2(numBits, SWIGTYPE_p_ArrayRefT_uint64_t_t.getCPtr(bigVal)), true);
  }

  public APInt(long numBits, long numWords, SWIGTYPE_p_uint64_t bigVal) {
    this(bitreaderJNI.new_APInt__SWIG_3(numBits, numWords, SWIGTYPE_p_uint64_t.getCPtr(bigVal)), true);
  }

  public APInt(long numBits, StringRef str, SWIGTYPE_p_uint8_t radix) {
    this(bitreaderJNI.new_APInt__SWIG_4(numBits, StringRef.getCPtr(str), str, SWIGTYPE_p_uint8_t.getCPtr(radix)), true);
  }

  public APInt(APInt that) {
    this(bitreaderJNI.new_APInt__SWIG_5(APInt.getCPtr(that), that), true);
  }

  public APInt() {
    this(bitreaderJNI.new_APInt__SWIG_6(), true);
  }

  public void Profile(SWIGTYPE_p_llvm__FoldingSetNodeID id) {
    bitreaderJNI.APInt_Profile(swigCPtr, this, SWIGTYPE_p_llvm__FoldingSetNodeID.getCPtr(id));
  }

  public boolean isNegative() {
    return bitreaderJNI.APInt_isNegative(swigCPtr, this);
  }

  public boolean isNonNegative() {
    return bitreaderJNI.APInt_isNonNegative(swigCPtr, this);
  }

  public boolean isStrictlyPositive() {
    return bitreaderJNI.APInt_isStrictlyPositive(swigCPtr, this);
  }

  public boolean isAllOnesValue() {
    return bitreaderJNI.APInt_isAllOnesValue(swigCPtr, this);
  }

  public boolean isMaxValue() {
    return bitreaderJNI.APInt_isMaxValue(swigCPtr, this);
  }

  public boolean isMaxSignedValue() {
    return bitreaderJNI.APInt_isMaxSignedValue(swigCPtr, this);
  }

  public boolean isMinValue() {
    return bitreaderJNI.APInt_isMinValue(swigCPtr, this);
  }

  public boolean isMinSignedValue() {
    return bitreaderJNI.APInt_isMinSignedValue(swigCPtr, this);
  }

  public boolean isIntN(long N) {
    return bitreaderJNI.APInt_isIntN(swigCPtr, this, N);
  }

  public boolean isSignedIntN(long N) {
    return bitreaderJNI.APInt_isSignedIntN(swigCPtr, this, N);
  }

  public boolean isPowerOf2() {
    return bitreaderJNI.APInt_isPowerOf2(swigCPtr, this);
  }

  public boolean isSignBit() {
    return bitreaderJNI.APInt_isSignBit(swigCPtr, this);
  }

  public boolean getBoolValue() {
    return bitreaderJNI.APInt_getBoolValue(swigCPtr, this);
  }

  public SWIGTYPE_p_uint64_t getLimitedValue(SWIGTYPE_p_uint64_t Limit) {
    return new SWIGTYPE_p_uint64_t(bitreaderJNI.APInt_getLimitedValue__SWIG_0(swigCPtr, this, SWIGTYPE_p_uint64_t.getCPtr(Limit)), true);
  }

  public SWIGTYPE_p_uint64_t getLimitedValue() {
    return new SWIGTYPE_p_uint64_t(bitreaderJNI.APInt_getLimitedValue__SWIG_1(swigCPtr, this), true);
  }

  public static APInt getMaxValue(long numBits) {
    return new APInt(bitreaderJNI.APInt_getMaxValue(numBits), true);
  }

  public static APInt getSignedMaxValue(long numBits) {
    return new APInt(bitreaderJNI.APInt_getSignedMaxValue(numBits), true);
  }

  public static APInt getMinValue(long numBits) {
    return new APInt(bitreaderJNI.APInt_getMinValue(numBits), true);
  }

  public static APInt getSignedMinValue(long numBits) {
    return new APInt(bitreaderJNI.APInt_getSignedMinValue(numBits), true);
  }

  public static APInt getSignBit(long BitWidth) {
    return new APInt(bitreaderJNI.APInt_getSignBit(BitWidth), true);
  }

  public static APInt getAllOnesValue(long numBits) {
    return new APInt(bitreaderJNI.APInt_getAllOnesValue(numBits), true);
  }

  public static APInt getNullValue(long numBits) {
    return new APInt(bitreaderJNI.APInt_getNullValue(numBits), true);
  }

  public APInt getHiBits(long numBits) {
    return new APInt(bitreaderJNI.APInt_getHiBits(swigCPtr, this, numBits), true);
  }

  public APInt getLoBits(long numBits) {
    return new APInt(bitreaderJNI.APInt_getLoBits(swigCPtr, this, numBits), true);
  }

  public static APInt getOneBitSet(long numBits, long BitNo) {
    return new APInt(bitreaderJNI.APInt_getOneBitSet(numBits, BitNo), true);
  }

  public static APInt getBitsSet(long numBits, long loBit, long hiBit) {
    return new APInt(bitreaderJNI.APInt_getBitsSet(numBits, loBit, hiBit), true);
  }

  public static APInt getHighBitsSet(long numBits, long hiBitsSet) {
    return new APInt(bitreaderJNI.APInt_getHighBitsSet(numBits, hiBitsSet), true);
  }

  public static APInt getLowBitsSet(long numBits, long loBitsSet) {
    return new APInt(bitreaderJNI.APInt_getLowBitsSet(numBits, loBitsSet), true);
  }

  public static APInt getSplat(long NewLen, APInt V) {
    return new APInt(bitreaderJNI.APInt_getSplat(NewLen, APInt.getCPtr(V), V), true);
  }

  public static boolean isSameValue(APInt I1, APInt I2) {
    return bitreaderJNI.APInt_isSameValue(APInt.getCPtr(I1), I1, APInt.getCPtr(I2), I2);
  }

  public SWIGTYPE_p_uint64_t getRawData() {
    long cPtr = bitreaderJNI.APInt_getRawData(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_uint64_t(cPtr, false);
  }

  public APInt And(APInt RHS) {
    return new APInt(bitreaderJNI.APInt_And(swigCPtr, this, APInt.getCPtr(RHS), RHS), true);
  }

  public APInt Or(APInt RHS) {
    return new APInt(bitreaderJNI.APInt_Or(swigCPtr, this, APInt.getCPtr(RHS), RHS), true);
  }

  public APInt Xor(APInt RHS) {
    return new APInt(bitreaderJNI.APInt_Xor(swigCPtr, this, APInt.getCPtr(RHS), RHS), true);
  }

  public APInt ashr(long shiftAmt) {
    return new APInt(bitreaderJNI.APInt_ashr__SWIG_0(swigCPtr, this, shiftAmt), true);
  }

  public APInt lshr(long shiftAmt) {
    return new APInt(bitreaderJNI.APInt_lshr__SWIG_0(swigCPtr, this, shiftAmt), true);
  }

  public APInt shl(long shiftAmt) {
    return new APInt(bitreaderJNI.APInt_shl__SWIG_0(swigCPtr, this, shiftAmt), true);
  }

  public APInt rotl(long rotateAmt) {
    return new APInt(bitreaderJNI.APInt_rotl__SWIG_0(swigCPtr, this, rotateAmt), true);
  }

  public APInt rotr(long rotateAmt) {
    return new APInt(bitreaderJNI.APInt_rotr__SWIG_0(swigCPtr, this, rotateAmt), true);
  }

  public APInt ashr(APInt shiftAmt) {
    return new APInt(bitreaderJNI.APInt_ashr__SWIG_1(swigCPtr, this, APInt.getCPtr(shiftAmt), shiftAmt), true);
  }

  public APInt lshr(APInt shiftAmt) {
    return new APInt(bitreaderJNI.APInt_lshr__SWIG_1(swigCPtr, this, APInt.getCPtr(shiftAmt), shiftAmt), true);
  }

  public APInt shl(APInt shiftAmt) {
    return new APInt(bitreaderJNI.APInt_shl__SWIG_1(swigCPtr, this, APInt.getCPtr(shiftAmt), shiftAmt), true);
  }

  public APInt rotl(APInt rotateAmt) {
    return new APInt(bitreaderJNI.APInt_rotl__SWIG_1(swigCPtr, this, APInt.getCPtr(rotateAmt), rotateAmt), true);
  }

  public APInt rotr(APInt rotateAmt) {
    return new APInt(bitreaderJNI.APInt_rotr__SWIG_1(swigCPtr, this, APInt.getCPtr(rotateAmt), rotateAmt), true);
  }

  public APInt udiv(APInt RHS) {
    return new APInt(bitreaderJNI.APInt_udiv(swigCPtr, this, APInt.getCPtr(RHS), RHS), true);
  }

  public APInt sdiv(APInt RHS) {
    return new APInt(bitreaderJNI.APInt_sdiv(swigCPtr, this, APInt.getCPtr(RHS), RHS), true);
  }

  public APInt urem(APInt RHS) {
    return new APInt(bitreaderJNI.APInt_urem(swigCPtr, this, APInt.getCPtr(RHS), RHS), true);
  }

  public APInt srem(APInt RHS) {
    return new APInt(bitreaderJNI.APInt_srem(swigCPtr, this, APInt.getCPtr(RHS), RHS), true);
  }

  public static void udivrem(APInt LHS, APInt RHS, APInt Quotient, APInt Remainder) {
    bitreaderJNI.APInt_udivrem(APInt.getCPtr(LHS), LHS, APInt.getCPtr(RHS), RHS, APInt.getCPtr(Quotient), Quotient, APInt.getCPtr(Remainder), Remainder);
  }

  public static void sdivrem(APInt LHS, APInt RHS, APInt Quotient, APInt Remainder) {
    bitreaderJNI.APInt_sdivrem(APInt.getCPtr(LHS), LHS, APInt.getCPtr(RHS), RHS, APInt.getCPtr(Quotient), Quotient, APInt.getCPtr(Remainder), Remainder);
  }

  public APInt sadd_ov(APInt RHS, SWIGTYPE_p_bool Overflow) {
    return new APInt(bitreaderJNI.APInt_sadd_ov(swigCPtr, this, APInt.getCPtr(RHS), RHS, SWIGTYPE_p_bool.getCPtr(Overflow)), true);
  }

  public APInt uadd_ov(APInt RHS, SWIGTYPE_p_bool Overflow) {
    return new APInt(bitreaderJNI.APInt_uadd_ov(swigCPtr, this, APInt.getCPtr(RHS), RHS, SWIGTYPE_p_bool.getCPtr(Overflow)), true);
  }

  public APInt ssub_ov(APInt RHS, SWIGTYPE_p_bool Overflow) {
    return new APInt(bitreaderJNI.APInt_ssub_ov(swigCPtr, this, APInt.getCPtr(RHS), RHS, SWIGTYPE_p_bool.getCPtr(Overflow)), true);
  }

  public APInt usub_ov(APInt RHS, SWIGTYPE_p_bool Overflow) {
    return new APInt(bitreaderJNI.APInt_usub_ov(swigCPtr, this, APInt.getCPtr(RHS), RHS, SWIGTYPE_p_bool.getCPtr(Overflow)), true);
  }

  public APInt sdiv_ov(APInt RHS, SWIGTYPE_p_bool Overflow) {
    return new APInt(bitreaderJNI.APInt_sdiv_ov(swigCPtr, this, APInt.getCPtr(RHS), RHS, SWIGTYPE_p_bool.getCPtr(Overflow)), true);
  }

  public APInt smul_ov(APInt RHS, SWIGTYPE_p_bool Overflow) {
    return new APInt(bitreaderJNI.APInt_smul_ov(swigCPtr, this, APInt.getCPtr(RHS), RHS, SWIGTYPE_p_bool.getCPtr(Overflow)), true);
  }

  public APInt umul_ov(APInt RHS, SWIGTYPE_p_bool Overflow) {
    return new APInt(bitreaderJNI.APInt_umul_ov(swigCPtr, this, APInt.getCPtr(RHS), RHS, SWIGTYPE_p_bool.getCPtr(Overflow)), true);
  }

  public APInt sshl_ov(long Amt, SWIGTYPE_p_bool Overflow) {
    return new APInt(bitreaderJNI.APInt_sshl_ov(swigCPtr, this, Amt, SWIGTYPE_p_bool.getCPtr(Overflow)), true);
  }

  public boolean eq(APInt RHS) {
    return bitreaderJNI.APInt_eq(swigCPtr, this, APInt.getCPtr(RHS), RHS);
  }

  public boolean ne(APInt RHS) {
    return bitreaderJNI.APInt_ne(swigCPtr, this, APInt.getCPtr(RHS), RHS);
  }

  public boolean ult(APInt RHS) {
    return bitreaderJNI.APInt_ult__SWIG_0(swigCPtr, this, APInt.getCPtr(RHS), RHS);
  }

  public boolean ult(SWIGTYPE_p_uint64_t RHS) {
    return bitreaderJNI.APInt_ult__SWIG_1(swigCPtr, this, SWIGTYPE_p_uint64_t.getCPtr(RHS));
  }

  public boolean slt(APInt RHS) {
    return bitreaderJNI.APInt_slt__SWIG_0(swigCPtr, this, APInt.getCPtr(RHS), RHS);
  }

  public boolean slt(SWIGTYPE_p_uint64_t RHS) {
    return bitreaderJNI.APInt_slt__SWIG_1(swigCPtr, this, SWIGTYPE_p_uint64_t.getCPtr(RHS));
  }

  public boolean ule(APInt RHS) {
    return bitreaderJNI.APInt_ule__SWIG_0(swigCPtr, this, APInt.getCPtr(RHS), RHS);
  }

  public boolean ule(SWIGTYPE_p_uint64_t RHS) {
    return bitreaderJNI.APInt_ule__SWIG_1(swigCPtr, this, SWIGTYPE_p_uint64_t.getCPtr(RHS));
  }

  public boolean sle(APInt RHS) {
    return bitreaderJNI.APInt_sle__SWIG_0(swigCPtr, this, APInt.getCPtr(RHS), RHS);
  }

  public boolean sle(SWIGTYPE_p_uint64_t RHS) {
    return bitreaderJNI.APInt_sle__SWIG_1(swigCPtr, this, SWIGTYPE_p_uint64_t.getCPtr(RHS));
  }

  public boolean ugt(APInt RHS) {
    return bitreaderJNI.APInt_ugt__SWIG_0(swigCPtr, this, APInt.getCPtr(RHS), RHS);
  }

  public boolean ugt(SWIGTYPE_p_uint64_t RHS) {
    return bitreaderJNI.APInt_ugt__SWIG_1(swigCPtr, this, SWIGTYPE_p_uint64_t.getCPtr(RHS));
  }

  public boolean sgt(APInt RHS) {
    return bitreaderJNI.APInt_sgt__SWIG_0(swigCPtr, this, APInt.getCPtr(RHS), RHS);
  }

  public boolean sgt(SWIGTYPE_p_uint64_t RHS) {
    return bitreaderJNI.APInt_sgt__SWIG_1(swigCPtr, this, SWIGTYPE_p_uint64_t.getCPtr(RHS));
  }

  public boolean uge(APInt RHS) {
    return bitreaderJNI.APInt_uge__SWIG_0(swigCPtr, this, APInt.getCPtr(RHS), RHS);
  }

  public boolean uge(SWIGTYPE_p_uint64_t RHS) {
    return bitreaderJNI.APInt_uge__SWIG_1(swigCPtr, this, SWIGTYPE_p_uint64_t.getCPtr(RHS));
  }

  public boolean sge(APInt RHS) {
    return bitreaderJNI.APInt_sge__SWIG_0(swigCPtr, this, APInt.getCPtr(RHS), RHS);
  }

  public boolean sge(SWIGTYPE_p_uint64_t RHS) {
    return bitreaderJNI.APInt_sge__SWIG_1(swigCPtr, this, SWIGTYPE_p_uint64_t.getCPtr(RHS));
  }

  public boolean intersects(APInt RHS) {
    return bitreaderJNI.APInt_intersects(swigCPtr, this, APInt.getCPtr(RHS), RHS);
  }

  public APInt trunc(long width) {
    return new APInt(bitreaderJNI.APInt_trunc(swigCPtr, this, width), true);
  }

  public APInt sext(long width) {
    return new APInt(bitreaderJNI.APInt_sext(swigCPtr, this, width), true);
  }

  public APInt zext(long width) {
    return new APInt(bitreaderJNI.APInt_zext(swigCPtr, this, width), true);
  }

  public APInt sextOrTrunc(long width) {
    return new APInt(bitreaderJNI.APInt_sextOrTrunc(swigCPtr, this, width), true);
  }

  public APInt zextOrTrunc(long width) {
    return new APInt(bitreaderJNI.APInt_zextOrTrunc(swigCPtr, this, width), true);
  }

  public APInt sextOrSelf(long width) {
    return new APInt(bitreaderJNI.APInt_sextOrSelf(swigCPtr, this, width), true);
  }

  public APInt zextOrSelf(long width) {
    return new APInt(bitreaderJNI.APInt_zextOrSelf(swigCPtr, this, width), true);
  }

  public void setAllBits() {
    bitreaderJNI.APInt_setAllBits(swigCPtr, this);
  }

  public void setBit(long bitPosition) {
    bitreaderJNI.APInt_setBit(swigCPtr, this, bitPosition);
  }

  public void clearAllBits() {
    bitreaderJNI.APInt_clearAllBits(swigCPtr, this);
  }

  public void clearBit(long bitPosition) {
    bitreaderJNI.APInt_clearBit(swigCPtr, this, bitPosition);
  }

  public void flipAllBits() {
    bitreaderJNI.APInt_flipAllBits(swigCPtr, this);
  }

  public void flipBit(long bitPosition) {
    bitreaderJNI.APInt_flipBit(swigCPtr, this, bitPosition);
  }

  public long getBitWidth() {
    return bitreaderJNI.APInt_getBitWidth(swigCPtr, this);
  }

  public long getNumWords() {
    return bitreaderJNI.APInt_getNumWords__SWIG_0(swigCPtr, this);
  }

  public static long getNumWords(long BitWidth) {
    return bitreaderJNI.APInt_getNumWords__SWIG_1(BitWidth);
  }

  public long getActiveBits() {
    return bitreaderJNI.APInt_getActiveBits(swigCPtr, this);
  }

  public long getActiveWords() {
    return bitreaderJNI.APInt_getActiveWords(swigCPtr, this);
  }

  public long getMinSignedBits() {
    return bitreaderJNI.APInt_getMinSignedBits(swigCPtr, this);
  }

  public SWIGTYPE_p_uint64_t getZExtValue() {
    return new SWIGTYPE_p_uint64_t(bitreaderJNI.APInt_getZExtValue(swigCPtr, this), true);
  }

  public SWIGTYPE_p_int64_t getSExtValue() {
    return new SWIGTYPE_p_int64_t(bitreaderJNI.APInt_getSExtValue(swigCPtr, this), true);
  }

  public static long getBitsNeeded(StringRef str, SWIGTYPE_p_uint8_t radix) {
    return bitreaderJNI.APInt_getBitsNeeded(StringRef.getCPtr(str), str, SWIGTYPE_p_uint8_t.getCPtr(radix));
  }

  public long countLeadingZeros() {
    return bitreaderJNI.APInt_countLeadingZeros(swigCPtr, this);
  }

  public long countLeadingOnes() {
    return bitreaderJNI.APInt_countLeadingOnes(swigCPtr, this);
  }

  public long getNumSignBits() {
    return bitreaderJNI.APInt_getNumSignBits(swigCPtr, this);
  }

  public long countTrailingZeros() {
    return bitreaderJNI.APInt_countTrailingZeros(swigCPtr, this);
  }

  public long countTrailingOnes() {
    return bitreaderJNI.APInt_countTrailingOnes(swigCPtr, this);
  }

  public long countPopulation() {
    return bitreaderJNI.APInt_countPopulation(swigCPtr, this);
  }

  public void print(SWIGTYPE_p_llvm__raw_ostream OS, boolean isSigned) {
    bitreaderJNI.APInt_print(swigCPtr, this, SWIGTYPE_p_llvm__raw_ostream.getCPtr(OS), isSigned);
  }

  public void toString(SWIGTYPE_p_llvm__SmallVectorImplT_char_t Str, long Radix, boolean Signed, boolean formatAsCLiteral) {
    bitreaderJNI.APInt_toString__SWIG_0(swigCPtr, this, SWIGTYPE_p_llvm__SmallVectorImplT_char_t.getCPtr(Str), Radix, Signed, formatAsCLiteral);
  }

  public void toString(SWIGTYPE_p_llvm__SmallVectorImplT_char_t Str, long Radix, boolean Signed) {
    bitreaderJNI.APInt_toString__SWIG_1(swigCPtr, this, SWIGTYPE_p_llvm__SmallVectorImplT_char_t.getCPtr(Str), Radix, Signed);
  }

  public void toStringUnsigned(SWIGTYPE_p_llvm__SmallVectorImplT_char_t Str, long Radix) {
    bitreaderJNI.APInt_toStringUnsigned__SWIG_0(swigCPtr, this, SWIGTYPE_p_llvm__SmallVectorImplT_char_t.getCPtr(Str), Radix);
  }

  public void toStringUnsigned(SWIGTYPE_p_llvm__SmallVectorImplT_char_t Str) {
    bitreaderJNI.APInt_toStringUnsigned__SWIG_1(swigCPtr, this, SWIGTYPE_p_llvm__SmallVectorImplT_char_t.getCPtr(Str));
  }

  public void toStringSigned(SWIGTYPE_p_llvm__SmallVectorImplT_char_t Str, long Radix) {
    bitreaderJNI.APInt_toStringSigned__SWIG_0(swigCPtr, this, SWIGTYPE_p_llvm__SmallVectorImplT_char_t.getCPtr(Str), Radix);
  }

  public void toStringSigned(SWIGTYPE_p_llvm__SmallVectorImplT_char_t Str) {
    bitreaderJNI.APInt_toStringSigned__SWIG_1(swigCPtr, this, SWIGTYPE_p_llvm__SmallVectorImplT_char_t.getCPtr(Str));
  }

  public String toString(long Radix, boolean Signed) {
    return bitreaderJNI.APInt_toString__SWIG_2(swigCPtr, this, Radix, Signed);
  }

  public APInt byteSwap() {
    return new APInt(bitreaderJNI.APInt_byteSwap(swigCPtr, this), true);
  }

  public double roundToDouble(boolean isSigned) {
    return bitreaderJNI.APInt_roundToDouble__SWIG_0(swigCPtr, this, isSigned);
  }

  public double roundToDouble() {
    return bitreaderJNI.APInt_roundToDouble__SWIG_1(swigCPtr, this);
  }

  public double signedRoundToDouble() {
    return bitreaderJNI.APInt_signedRoundToDouble(swigCPtr, this);
  }

  public double bitsToDouble() {
    return bitreaderJNI.APInt_bitsToDouble(swigCPtr, this);
  }

  public float bitsToFloat() {
    return bitreaderJNI.APInt_bitsToFloat(swigCPtr, this);
  }

  public static APInt doubleToBits(double V) {
    return new APInt(bitreaderJNI.APInt_doubleToBits(V), true);
  }

  public static APInt floatToBits(float V) {
    return new APInt(bitreaderJNI.APInt_floatToBits(V), true);
  }

  public long logBase2() {
    return bitreaderJNI.APInt_logBase2(swigCPtr, this);
  }

  public long ceilLogBase2() {
    return bitreaderJNI.APInt_ceilLogBase2(swigCPtr, this);
  }

  public SWIGTYPE_p_int32_t exactLogBase2() {
    return new SWIGTYPE_p_int32_t(bitreaderJNI.APInt_exactLogBase2(swigCPtr, this), true);
  }

  public APInt sqrt() {
    return new APInt(bitreaderJNI.APInt_sqrt(swigCPtr, this), true);
  }

  public APInt abs() {
    return new APInt(bitreaderJNI.APInt_abs(swigCPtr, this), true);
  }

  public APInt multiplicativeInverse(APInt modulo) {
    return new APInt(bitreaderJNI.APInt_multiplicativeInverse(swigCPtr, this, APInt.getCPtr(modulo), modulo), true);
  }

  public APInt.ms magic() {
    return new APInt.ms(bitreaderJNI.APInt_magic(swigCPtr, this), true);
  }

  public APInt.mu magicu(long LeadingZeros) {
    return new APInt.mu(bitreaderJNI.APInt_magicu__SWIG_0(swigCPtr, this, LeadingZeros), true);
  }

  public APInt.mu magicu() {
    return new APInt.mu(bitreaderJNI.APInt_magicu__SWIG_1(swigCPtr, this), true);
  }

  public static void tcSet(SWIGTYPE_p_uint64_t arg0, SWIGTYPE_p_uint64_t arg1, long arg2) {
    bitreaderJNI.APInt_tcSet(SWIGTYPE_p_uint64_t.getCPtr(arg0), SWIGTYPE_p_uint64_t.getCPtr(arg1), arg2);
  }

  public static void tcAssign(SWIGTYPE_p_uint64_t arg0, SWIGTYPE_p_uint64_t arg1, long arg2) {
    bitreaderJNI.APInt_tcAssign(SWIGTYPE_p_uint64_t.getCPtr(arg0), SWIGTYPE_p_uint64_t.getCPtr(arg1), arg2);
  }

  public static boolean tcIsZero(SWIGTYPE_p_uint64_t arg0, long arg1) {
    return bitreaderJNI.APInt_tcIsZero(SWIGTYPE_p_uint64_t.getCPtr(arg0), arg1);
  }

  public static int tcExtractBit(SWIGTYPE_p_uint64_t arg0, long bit) {
    return bitreaderJNI.APInt_tcExtractBit(SWIGTYPE_p_uint64_t.getCPtr(arg0), bit);
  }

  public static void tcExtract(SWIGTYPE_p_uint64_t arg0, long dstCount, SWIGTYPE_p_uint64_t arg2, long srcBits, long srcLSB) {
    bitreaderJNI.APInt_tcExtract(SWIGTYPE_p_uint64_t.getCPtr(arg0), dstCount, SWIGTYPE_p_uint64_t.getCPtr(arg2), srcBits, srcLSB);
  }

  public static void tcSetBit(SWIGTYPE_p_uint64_t arg0, long bit) {
    bitreaderJNI.APInt_tcSetBit(SWIGTYPE_p_uint64_t.getCPtr(arg0), bit);
  }

  public static void tcClearBit(SWIGTYPE_p_uint64_t arg0, long bit) {
    bitreaderJNI.APInt_tcClearBit(SWIGTYPE_p_uint64_t.getCPtr(arg0), bit);
  }

  public static long tcLSB(SWIGTYPE_p_uint64_t arg0, long arg1) {
    return bitreaderJNI.APInt_tcLSB(SWIGTYPE_p_uint64_t.getCPtr(arg0), arg1);
  }

  public static long tcMSB(SWIGTYPE_p_uint64_t parts, long n) {
    return bitreaderJNI.APInt_tcMSB(SWIGTYPE_p_uint64_t.getCPtr(parts), n);
  }

  public static void tcNegate(SWIGTYPE_p_uint64_t arg0, long arg1) {
    bitreaderJNI.APInt_tcNegate(SWIGTYPE_p_uint64_t.getCPtr(arg0), arg1);
  }

  public static SWIGTYPE_p_uint64_t tcAdd(SWIGTYPE_p_uint64_t arg0, SWIGTYPE_p_uint64_t arg1, SWIGTYPE_p_uint64_t carry, long arg3) {
    return new SWIGTYPE_p_uint64_t(bitreaderJNI.APInt_tcAdd(SWIGTYPE_p_uint64_t.getCPtr(arg0), SWIGTYPE_p_uint64_t.getCPtr(arg1), SWIGTYPE_p_uint64_t.getCPtr(carry), arg3), true);
  }

  public static SWIGTYPE_p_uint64_t tcSubtract(SWIGTYPE_p_uint64_t arg0, SWIGTYPE_p_uint64_t arg1, SWIGTYPE_p_uint64_t carry, long arg3) {
    return new SWIGTYPE_p_uint64_t(bitreaderJNI.APInt_tcSubtract(SWIGTYPE_p_uint64_t.getCPtr(arg0), SWIGTYPE_p_uint64_t.getCPtr(arg1), SWIGTYPE_p_uint64_t.getCPtr(carry), arg3), true);
  }

  public static int tcMultiplyPart(SWIGTYPE_p_uint64_t dst, SWIGTYPE_p_uint64_t src, SWIGTYPE_p_uint64_t multiplier, SWIGTYPE_p_uint64_t carry, long srcParts, long dstParts, boolean add) {
    return bitreaderJNI.APInt_tcMultiplyPart(SWIGTYPE_p_uint64_t.getCPtr(dst), SWIGTYPE_p_uint64_t.getCPtr(src), SWIGTYPE_p_uint64_t.getCPtr(multiplier), SWIGTYPE_p_uint64_t.getCPtr(carry), srcParts, dstParts, add);
  }

  public static int tcMultiply(SWIGTYPE_p_uint64_t arg0, SWIGTYPE_p_uint64_t arg1, SWIGTYPE_p_uint64_t arg2, long arg3) {
    return bitreaderJNI.APInt_tcMultiply(SWIGTYPE_p_uint64_t.getCPtr(arg0), SWIGTYPE_p_uint64_t.getCPtr(arg1), SWIGTYPE_p_uint64_t.getCPtr(arg2), arg3);
  }

  public static long tcFullMultiply(SWIGTYPE_p_uint64_t arg0, SWIGTYPE_p_uint64_t arg1, SWIGTYPE_p_uint64_t arg2, long arg3, long arg4) {
    return bitreaderJNI.APInt_tcFullMultiply(SWIGTYPE_p_uint64_t.getCPtr(arg0), SWIGTYPE_p_uint64_t.getCPtr(arg1), SWIGTYPE_p_uint64_t.getCPtr(arg2), arg3, arg4);
  }

  public static int tcDivide(SWIGTYPE_p_uint64_t lhs, SWIGTYPE_p_uint64_t rhs, SWIGTYPE_p_uint64_t remainder, SWIGTYPE_p_uint64_t scratch, long parts) {
    return bitreaderJNI.APInt_tcDivide(SWIGTYPE_p_uint64_t.getCPtr(lhs), SWIGTYPE_p_uint64_t.getCPtr(rhs), SWIGTYPE_p_uint64_t.getCPtr(remainder), SWIGTYPE_p_uint64_t.getCPtr(scratch), parts);
  }

  public static void tcShiftLeft(SWIGTYPE_p_uint64_t arg0, long parts, long count) {
    bitreaderJNI.APInt_tcShiftLeft(SWIGTYPE_p_uint64_t.getCPtr(arg0), parts, count);
  }

  public static void tcShiftRight(SWIGTYPE_p_uint64_t arg0, long parts, long count) {
    bitreaderJNI.APInt_tcShiftRight(SWIGTYPE_p_uint64_t.getCPtr(arg0), parts, count);
  }

  public static void tcAnd(SWIGTYPE_p_uint64_t arg0, SWIGTYPE_p_uint64_t arg1, long arg2) {
    bitreaderJNI.APInt_tcAnd(SWIGTYPE_p_uint64_t.getCPtr(arg0), SWIGTYPE_p_uint64_t.getCPtr(arg1), arg2);
  }

  public static void tcOr(SWIGTYPE_p_uint64_t arg0, SWIGTYPE_p_uint64_t arg1, long arg2) {
    bitreaderJNI.APInt_tcOr(SWIGTYPE_p_uint64_t.getCPtr(arg0), SWIGTYPE_p_uint64_t.getCPtr(arg1), arg2);
  }

  public static void tcXor(SWIGTYPE_p_uint64_t arg0, SWIGTYPE_p_uint64_t arg1, long arg2) {
    bitreaderJNI.APInt_tcXor(SWIGTYPE_p_uint64_t.getCPtr(arg0), SWIGTYPE_p_uint64_t.getCPtr(arg1), arg2);
  }

  public static void tcComplement(SWIGTYPE_p_uint64_t arg0, long arg1) {
    bitreaderJNI.APInt_tcComplement(SWIGTYPE_p_uint64_t.getCPtr(arg0), arg1);
  }

  public static int tcCompare(SWIGTYPE_p_uint64_t arg0, SWIGTYPE_p_uint64_t arg1, long arg2) {
    return bitreaderJNI.APInt_tcCompare(SWIGTYPE_p_uint64_t.getCPtr(arg0), SWIGTYPE_p_uint64_t.getCPtr(arg1), arg2);
  }

  public static SWIGTYPE_p_uint64_t tcIncrement(SWIGTYPE_p_uint64_t arg0, long arg1) {
    return new SWIGTYPE_p_uint64_t(bitreaderJNI.APInt_tcIncrement(SWIGTYPE_p_uint64_t.getCPtr(arg0), arg1), true);
  }

  public static void tcSetLeastSignificantBits(SWIGTYPE_p_uint64_t arg0, long arg1, long bits) {
    bitreaderJNI.APInt_tcSetLeastSignificantBits(SWIGTYPE_p_uint64_t.getCPtr(arg0), arg1, bits);
  }

  public void dump() {
    bitreaderJNI.APInt_dump(swigCPtr, this);
  }

  static public class ms {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected ms(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(ms obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          bitreaderJNI.delete_APInt_ms(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setM(APInt value) {
      bitreaderJNI.APInt_ms_m_set(swigCPtr, this, APInt.getCPtr(value), value);
    }
  
    public APInt getM() {
      long cPtr = bitreaderJNI.APInt_ms_m_get(swigCPtr, this);
      return (cPtr == 0) ? null : new APInt(cPtr, false);
    }
  
    public void setS(long value) {
      bitreaderJNI.APInt_ms_s_set(swigCPtr, this, value);
    }
  
    public long getS() {
      return bitreaderJNI.APInt_ms_s_get(swigCPtr, this);
    }
  
    public ms() {
      this(bitreaderJNI.new_APInt_ms(), true);
    }
  
  }

  static public class mu {
    private long swigCPtr;
    protected boolean swigCMemOwn;
  
    protected mu(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(mu obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          bitreaderJNI.delete_APInt_mu(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public void setM(APInt value) {
      bitreaderJNI.APInt_mu_m_set(swigCPtr, this, APInt.getCPtr(value), value);
    }
  
    public APInt getM() {
      long cPtr = bitreaderJNI.APInt_mu_m_get(swigCPtr, this);
      return (cPtr == 0) ? null : new APInt(cPtr, false);
    }
  
    public void setA(boolean value) {
      bitreaderJNI.APInt_mu_a_set(swigCPtr, this, value);
    }
  
    public boolean getA() {
      return bitreaderJNI.APInt_mu_a_get(swigCPtr, this);
    }
  
    public void setS(long value) {
      bitreaderJNI.APInt_mu_s_set(swigCPtr, this, value);
    }
  
    public long getS() {
      return bitreaderJNI.APInt_mu_s_get(swigCPtr, this);
    }
  
    public mu() {
      this(bitreaderJNI.new_APInt_mu(), true);
    }
  
  }

}
