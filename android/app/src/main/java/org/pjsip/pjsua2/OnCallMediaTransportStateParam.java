/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class OnCallMediaTransportStateParam {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected OnCallMediaTransportStateParam(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OnCallMediaTransportStateParam obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_OnCallMediaTransportStateParam(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMedIdx(long value) {
    pjsua2JNI.OnCallMediaTransportStateParam_medIdx_set(swigCPtr, this, value);
  }

  public long getMedIdx() {
    return pjsua2JNI.OnCallMediaTransportStateParam_medIdx_get(swigCPtr, this);
  }

  public void setState(pjsua_med_tp_st value) {
    pjsua2JNI.OnCallMediaTransportStateParam_state_set(swigCPtr, this, value.swigValue());
  }

  public pjsua_med_tp_st getState() {
    return pjsua_med_tp_st.swigToEnum(pjsua2JNI.OnCallMediaTransportStateParam_state_get(swigCPtr, this));
  }

  public void setStatus(int value) {
    pjsua2JNI.OnCallMediaTransportStateParam_status_set(swigCPtr, this, value);
  }

  public int getStatus() {
    return pjsua2JNI.OnCallMediaTransportStateParam_status_get(swigCPtr, this);
  }

  public void setSipErrorCode(int value) {
    pjsua2JNI.OnCallMediaTransportStateParam_sipErrorCode_set(swigCPtr, this, value);
  }

  public int getSipErrorCode() {
    return pjsua2JNI.OnCallMediaTransportStateParam_sipErrorCode_get(swigCPtr, this);
  }

  public OnCallMediaTransportStateParam() {
    this(pjsua2JNI.new_OnCallMediaTransportStateParam(), true);
  }

}
