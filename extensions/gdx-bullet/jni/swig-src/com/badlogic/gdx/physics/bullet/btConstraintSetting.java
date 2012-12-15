/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btConstraintSetting {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btConstraintSetting(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btConstraintSetting obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btConstraintSetting(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public btConstraintSetting() {
    this(gdxBulletJNI.new_btConstraintSetting(), true);
  }

  public void setM_tau(float value) {
    gdxBulletJNI.btConstraintSetting_m_tau_set(swigCPtr, this, value);
  }

  public float getM_tau() {
    return gdxBulletJNI.btConstraintSetting_m_tau_get(swigCPtr, this);
  }

  public void setM_damping(float value) {
    gdxBulletJNI.btConstraintSetting_m_damping_set(swigCPtr, this, value);
  }

  public float getM_damping() {
    return gdxBulletJNI.btConstraintSetting_m_damping_get(swigCPtr, this);
  }

  public void setM_impulseClamp(float value) {
    gdxBulletJNI.btConstraintSetting_m_impulseClamp_set(swigCPtr, this, value);
  }

  public float getM_impulseClamp() {
    return gdxBulletJNI.btConstraintSetting_m_impulseClamp_get(swigCPtr, this);
  }

}
