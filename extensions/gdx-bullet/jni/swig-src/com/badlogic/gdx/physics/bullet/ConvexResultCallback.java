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

public class ConvexResultCallback {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ConvexResultCallback(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ConvexResultCallback obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_ConvexResultCallback(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setM_closestHitFraction(float value) {
    gdxBulletJNI.ConvexResultCallback_m_closestHitFraction_set(swigCPtr, this, value);
  }

  public float getM_closestHitFraction() {
    return gdxBulletJNI.ConvexResultCallback_m_closestHitFraction_get(swigCPtr, this);
  }

  public void setM_collisionFilterGroup(short value) {
    gdxBulletJNI.ConvexResultCallback_m_collisionFilterGroup_set(swigCPtr, this, value);
  }

  public short getM_collisionFilterGroup() {
    return gdxBulletJNI.ConvexResultCallback_m_collisionFilterGroup_get(swigCPtr, this);
  }

  public void setM_collisionFilterMask(short value) {
    gdxBulletJNI.ConvexResultCallback_m_collisionFilterMask_set(swigCPtr, this, value);
  }

  public short getM_collisionFilterMask() {
    return gdxBulletJNI.ConvexResultCallback_m_collisionFilterMask_get(swigCPtr, this);
  }

  public boolean hasHit() {
    return gdxBulletJNI.ConvexResultCallback_hasHit(swigCPtr, this);
  }

  public boolean needsCollision(btBroadphaseProxy proxy0) {
    return gdxBulletJNI.ConvexResultCallback_needsCollision(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy0), proxy0);
  }

  public float addSingleResult(LocalConvexResult convexResult, boolean normalInWorldSpace) {
    return gdxBulletJNI.ConvexResultCallback_addSingleResult(swigCPtr, this, LocalConvexResult.getCPtr(convexResult), convexResult, normalInWorldSpace);
  }

}
