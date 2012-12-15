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

public class btHashedOverlappingPairCache extends btOverlappingPairCache {
  private long swigCPtr;

  protected btHashedOverlappingPairCache(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btHashedOverlappingPairCache_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btHashedOverlappingPairCache obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btHashedOverlappingPairCache(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public btHashedOverlappingPairCache() {
    this(gdxBulletJNI.new_btHashedOverlappingPairCache(), true);
  }

  public boolean needsBroadphaseCollision(btBroadphaseProxy proxy0, btBroadphaseProxy proxy1) {
    return gdxBulletJNI.btHashedOverlappingPairCache_needsBroadphaseCollision(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy0), proxy0, btBroadphaseProxy.getCPtr(proxy1), proxy1);
  }

  public btBroadphasePair getOverlappingPairArrayPtr() {
    long cPtr = gdxBulletJNI.btHashedOverlappingPairCache_getOverlappingPairArrayPtr__SWIG_0(swigCPtr, this);
    return (cPtr == 0) ? null : new btBroadphasePair(cPtr, false);
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btBroadphasePair_t getOverlappingPairArray() {
    return new SWIGTYPE_p_btAlignedObjectArrayT_btBroadphasePair_t(gdxBulletJNI.btHashedOverlappingPairCache_getOverlappingPairArray__SWIG_0(swigCPtr, this), false);
  }

  public int GetCount() {
    return gdxBulletJNI.btHashedOverlappingPairCache_GetCount(swigCPtr, this);
  }

  public btOverlapFilterCallback getOverlapFilterCallback() {
    long cPtr = gdxBulletJNI.btHashedOverlappingPairCache_getOverlapFilterCallback(swigCPtr, this);
    return (cPtr == 0) ? null : new btOverlapFilterCallback(cPtr, false);
  }

}
