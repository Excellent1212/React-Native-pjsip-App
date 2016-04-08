/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class LossType {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected LossType(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LossType obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_LossType(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBurst(long value) {
    pjsua2JNI.LossType_burst_set(swigCPtr, this, value);
  }

  public long getBurst() {
    return pjsua2JNI.LossType_burst_get(swigCPtr, this);
  }

  public void setRandom(long value) {
    pjsua2JNI.LossType_random_set(swigCPtr, this, value);
  }

  public long getRandom() {
    return pjsua2JNI.LossType_random_get(swigCPtr, this);
  }

  public LossType() {
    this(pjsua2JNI.new_LossType(), true);
  }

}
