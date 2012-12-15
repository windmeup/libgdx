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

public class btQuantizedBvh {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btQuantizedBvh(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btQuantizedBvh obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btQuantizedBvh(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public btQuantizedBvh() {
    this(gdxBulletJNI.new_btQuantizedBvh(), true);
  }

  public void setQuantizationValues(Vector3 bvhAabbMin, Vector3 bvhAabbMax, float quantizationMargin) {
    gdxBulletJNI.btQuantizedBvh_setQuantizationValues__SWIG_0(swigCPtr, this, bvhAabbMin, bvhAabbMax, quantizationMargin);
  }

  public void setQuantizationValues(Vector3 bvhAabbMin, Vector3 bvhAabbMax) {
    gdxBulletJNI.btQuantizedBvh_setQuantizationValues__SWIG_1(swigCPtr, this, bvhAabbMin, bvhAabbMax);
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btQuantizedBvhNode_t getLeafNodeArray() {
    return new SWIGTYPE_p_btAlignedObjectArrayT_btQuantizedBvhNode_t(gdxBulletJNI.btQuantizedBvh_getLeafNodeArray(swigCPtr, this), false);
  }

  public void buildInternal() {
    gdxBulletJNI.btQuantizedBvh_buildInternal(swigCPtr, this);
  }

  public void reportAabbOverlappingNodex(btNodeOverlapCallback nodeCallback, Vector3 aabbMin, Vector3 aabbMax) {
    gdxBulletJNI.btQuantizedBvh_reportAabbOverlappingNodex(swigCPtr, this, btNodeOverlapCallback.getCPtr(nodeCallback), nodeCallback, aabbMin, aabbMax);
  }

  public void reportRayOverlappingNodex(btNodeOverlapCallback nodeCallback, Vector3 raySource, Vector3 rayTarget) {
    gdxBulletJNI.btQuantizedBvh_reportRayOverlappingNodex(swigCPtr, this, btNodeOverlapCallback.getCPtr(nodeCallback), nodeCallback, raySource, rayTarget);
  }

  public void reportBoxCastOverlappingNodex(btNodeOverlapCallback nodeCallback, Vector3 raySource, Vector3 rayTarget, Vector3 aabbMin, Vector3 aabbMax) {
    gdxBulletJNI.btQuantizedBvh_reportBoxCastOverlappingNodex(swigCPtr, this, btNodeOverlapCallback.getCPtr(nodeCallback), nodeCallback, raySource, rayTarget, aabbMin, aabbMax);
  }

  public void quantize(java.nio.IntBuffer out, Vector3 point, int isMax) {
    assert out.isDirect() : "Buffer must be allocated direct.";
    {
      gdxBulletJNI.btQuantizedBvh_quantize(swigCPtr, this, out, point, isMax);
    }
  }

  public void quantizeWithClamp(java.nio.IntBuffer out, Vector3 point2, int isMax) {
    assert out.isDirect() : "Buffer must be allocated direct.";
    {
      gdxBulletJNI.btQuantizedBvh_quantizeWithClamp(swigCPtr, this, out, point2, isMax);
    }
  }

  public Vector3 unQuantize(java.nio.IntBuffer vecIn) {
    assert vecIn.isDirect() : "Buffer must be allocated direct.";
    {
	return gdxBulletJNI.btQuantizedBvh_unQuantize(swigCPtr, this, vecIn);
}
  }

  public void setTraversalMode(int traversalMode) {
    gdxBulletJNI.btQuantizedBvh_setTraversalMode(swigCPtr, this, traversalMode);
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btQuantizedBvhNode_t getQuantizedNodeArray() {
    return new SWIGTYPE_p_btAlignedObjectArrayT_btQuantizedBvhNode_t(gdxBulletJNI.btQuantizedBvh_getQuantizedNodeArray(swigCPtr, this), false);
  }

  public SWIGTYPE_p_btAlignedObjectArrayT_btBvhSubtreeInfo_t getSubtreeInfoArray() {
    return new SWIGTYPE_p_btAlignedObjectArrayT_btBvhSubtreeInfo_t(gdxBulletJNI.btQuantizedBvh_getSubtreeInfoArray(swigCPtr, this), false);
  }

  public long calculateSerializeBufferSize() {
    return gdxBulletJNI.btQuantizedBvh_calculateSerializeBufferSize(swigCPtr, this);
  }

  public boolean serialize(SWIGTYPE_p_void o_alignedDataBuffer, long i_dataBufferSize, boolean i_swapEndian) {
    return gdxBulletJNI.btQuantizedBvh_serialize__SWIG_0(swigCPtr, this, SWIGTYPE_p_void.getCPtr(o_alignedDataBuffer), i_dataBufferSize, i_swapEndian);
  }

  public static btQuantizedBvh deSerializeInPlace(SWIGTYPE_p_void i_alignedDataBuffer, long i_dataBufferSize, boolean i_swapEndian) {
    long cPtr = gdxBulletJNI.btQuantizedBvh_deSerializeInPlace(SWIGTYPE_p_void.getCPtr(i_alignedDataBuffer), i_dataBufferSize, i_swapEndian);
    return (cPtr == 0) ? null : new btQuantizedBvh(cPtr, false);
  }

  public static long getAlignmentSerializationPadding() {
    return gdxBulletJNI.btQuantizedBvh_getAlignmentSerializationPadding();
  }

  public int calculateSerializeBufferSizeNew() {
    return gdxBulletJNI.btQuantizedBvh_calculateSerializeBufferSizeNew(swigCPtr, this);
  }

  public String serialize(SWIGTYPE_p_void dataBuffer, SWIGTYPE_p_btSerializer serializer) {
    return gdxBulletJNI.btQuantizedBvh_serialize__SWIG_1(swigCPtr, this, SWIGTYPE_p_void.getCPtr(dataBuffer), SWIGTYPE_p_btSerializer.getCPtr(serializer));
  }

  public void deSerializeFloat(btQuantizedBvhFloatData quantizedBvhFloatData) {
    gdxBulletJNI.btQuantizedBvh_deSerializeFloat(swigCPtr, this, btQuantizedBvhFloatData.getCPtr(quantizedBvhFloatData), quantizedBvhFloatData);
  }

  public void deSerializeDouble(btQuantizedBvhDoubleData quantizedBvhDoubleData) {
    gdxBulletJNI.btQuantizedBvh_deSerializeDouble(swigCPtr, this, btQuantizedBvhDoubleData.getCPtr(quantizedBvhDoubleData), quantizedBvhDoubleData);
  }

  public boolean isQuantized() {
    return gdxBulletJNI.btQuantizedBvh_isQuantized(swigCPtr, this);
  }

  public final static class btTraversalMode {
    public final static int TRAVERSAL_STACKLESS = 0;
    public final static int TRAVERSAL_STACKLESS_CACHE_FRIENDLY = TRAVERSAL_STACKLESS + 1;
    public final static int TRAVERSAL_RECURSIVE = TRAVERSAL_STACKLESS_CACHE_FRIENDLY + 1;
  }

}
