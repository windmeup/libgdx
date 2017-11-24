/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btTypedConstraint extends btTypedObject {
	private long swigCPtr;
	
	protected btTypedConstraint(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, DynamicsJNI.btTypedConstraint_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new btTypedConstraint, normally you should not need this constructor it's intended for low-level usage. */
	public btTypedConstraint(long cPtr, boolean cMemoryOwn) {
		this("btTypedConstraint", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(DynamicsJNI.btTypedConstraint_SWIGUpcast(swigCPtr = cPtr), cMemoryOwn);
	}
	
	public static long getCPtr(btTypedConstraint obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				DynamicsJNI.delete_btTypedConstraint(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public long operatorNew(long sizeInBytes) {
    return DynamicsJNI.btTypedConstraint_operatorNew__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDelete(long ptr) {
    DynamicsJNI.btTypedConstraint_operatorDelete__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNew(long arg0, long ptr) {
    return DynamicsJNI.btTypedConstraint_operatorNew__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDelete(long arg0, long arg1) {
    DynamicsJNI.btTypedConstraint_operatorDelete__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  public long operatorNewArray(long sizeInBytes) {
    return DynamicsJNI.btTypedConstraint_operatorNewArray__SWIG_0(swigCPtr, this, sizeInBytes);
  }

  public void operatorDeleteArray(long ptr) {
    DynamicsJNI.btTypedConstraint_operatorDeleteArray__SWIG_0(swigCPtr, this, ptr);
  }

  public long operatorNewArray(long arg0, long ptr) {
    return DynamicsJNI.btTypedConstraint_operatorNewArray__SWIG_1(swigCPtr, this, arg0, ptr);
  }

  public void operatorDeleteArray(long arg0, long arg1) {
    DynamicsJNI.btTypedConstraint_operatorDeleteArray__SWIG_1(swigCPtr, this, arg0, arg1);
  }

  static public class btConstraintInfo1 extends BulletBase {
  	private long swigCPtr;
  	
  	protected btConstraintInfo1(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, cPtr, cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new btConstraintInfo1, normally you should not need this constructor it's intended for low-level usage. */ 
  	public btConstraintInfo1(long cPtr, boolean cMemoryOwn) {
  		this("btConstraintInfo1", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(swigCPtr = cPtr, cMemoryOwn);
  	}
  	
  	public static long getCPtr(btConstraintInfo1 obj) {
  		return (obj == null) ? 0 : obj.swigCPtr;
  	}
  
  	@Override
  	protected void finalize() throws Throwable {
  		if (!destroyed)
  			destroy();
  		super.finalize();
  	}
  
    @Override protected synchronized void delete() {
  		if (swigCPtr != 0) {
  			if (swigCMemOwn) {
  				swigCMemOwn = false;
  				DynamicsJNI.delete_btTypedConstraint_btConstraintInfo1(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public void setNumConstraintRows(int value) {
      DynamicsJNI.btTypedConstraint_btConstraintInfo1_numConstraintRows_set(swigCPtr, this, value);
    }
  
    public int getNumConstraintRows() {
      return DynamicsJNI.btTypedConstraint_btConstraintInfo1_numConstraintRows_get(swigCPtr, this);
    }
  
    public void setNub(int value) {
      DynamicsJNI.btTypedConstraint_btConstraintInfo1_nub_set(swigCPtr, this, value);
    }
  
    public int getNub() {
      return DynamicsJNI.btTypedConstraint_btConstraintInfo1_nub_get(swigCPtr, this);
    }
  
    public btConstraintInfo1() {
      this(DynamicsJNI.new_btTypedConstraint_btConstraintInfo1(), true);
    }
  
  }

  public static btRigidBody getFixedBody() {
	return btRigidBody.getInstance(DynamicsJNI.btTypedConstraint_getFixedBody(), false);
}

  static public class btConstraintInfo2 extends BulletBase {
  	private long swigCPtr;
  	
  	protected btConstraintInfo2(final String className, long cPtr, boolean cMemoryOwn) {
  		super(className, cPtr, cMemoryOwn);
  		swigCPtr = cPtr;
  	}
  	
  	/** Construct a new btConstraintInfo2, normally you should not need this constructor it's intended for low-level usage. */ 
  	public btConstraintInfo2(long cPtr, boolean cMemoryOwn) {
  		this("btConstraintInfo2", cPtr, cMemoryOwn);
  		construct();
  	}
  	
  	@Override
  	protected void reset(long cPtr, boolean cMemoryOwn) {
  		if (!destroyed)
  			destroy();
  		super.reset(swigCPtr = cPtr, cMemoryOwn);
  	}
  	
  	public static long getCPtr(btConstraintInfo2 obj) {
  		return (obj == null) ? 0 : obj.swigCPtr;
  	}
  
  	@Override
  	protected void finalize() throws Throwable {
  		if (!destroyed)
  			destroy();
  		super.finalize();
  	}
  
    @Override protected synchronized void delete() {
  		if (swigCPtr != 0) {
  			if (swigCMemOwn) {
  				swigCMemOwn = false;
  				DynamicsJNI.delete_btTypedConstraint_btConstraintInfo2(swigCPtr);
  			}
  			swigCPtr = 0;
  		}
  		super.delete();
  	}
  
    public void setFps(float value) {
      DynamicsJNI.btTypedConstraint_btConstraintInfo2_fps_set(swigCPtr, this, value);
    }
  
    public float getFps() {
      return DynamicsJNI.btTypedConstraint_btConstraintInfo2_fps_get(swigCPtr, this);
    }
  
    public void setErp(float value) {
      DynamicsJNI.btTypedConstraint_btConstraintInfo2_erp_set(swigCPtr, this, value);
    }
  
    public float getErp() {
      return DynamicsJNI.btTypedConstraint_btConstraintInfo2_erp_get(swigCPtr, this);
    }
  
    public void setJ1linearAxis(SWIGTYPE_p_float value) {
      DynamicsJNI.btTypedConstraint_btConstraintInfo2_J1linearAxis_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
    }
  
    public SWIGTYPE_p_float getJ1linearAxis() {
      long cPtr = DynamicsJNI.btTypedConstraint_btConstraintInfo2_J1linearAxis_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
    }
  
    public void setJ1angularAxis(SWIGTYPE_p_float value) {
      DynamicsJNI.btTypedConstraint_btConstraintInfo2_J1angularAxis_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
    }
  
    public SWIGTYPE_p_float getJ1angularAxis() {
      long cPtr = DynamicsJNI.btTypedConstraint_btConstraintInfo2_J1angularAxis_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
    }
  
    public void setJ2linearAxis(SWIGTYPE_p_float value) {
      DynamicsJNI.btTypedConstraint_btConstraintInfo2_J2linearAxis_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
    }
  
    public SWIGTYPE_p_float getJ2linearAxis() {
      long cPtr = DynamicsJNI.btTypedConstraint_btConstraintInfo2_J2linearAxis_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
    }
  
    public void setJ2angularAxis(SWIGTYPE_p_float value) {
      DynamicsJNI.btTypedConstraint_btConstraintInfo2_J2angularAxis_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
    }
  
    public SWIGTYPE_p_float getJ2angularAxis() {
      long cPtr = DynamicsJNI.btTypedConstraint_btConstraintInfo2_J2angularAxis_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
    }
  
    public void setRowskip(int value) {
      DynamicsJNI.btTypedConstraint_btConstraintInfo2_rowskip_set(swigCPtr, this, value);
    }
  
    public int getRowskip() {
      return DynamicsJNI.btTypedConstraint_btConstraintInfo2_rowskip_get(swigCPtr, this);
    }
  
    public void setConstraintError(SWIGTYPE_p_float value) {
      DynamicsJNI.btTypedConstraint_btConstraintInfo2_constraintError_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
    }
  
    public SWIGTYPE_p_float getConstraintError() {
      long cPtr = DynamicsJNI.btTypedConstraint_btConstraintInfo2_constraintError_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
    }
  
    public void setCfm(SWIGTYPE_p_float value) {
      DynamicsJNI.btTypedConstraint_btConstraintInfo2_cfm_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
    }
  
    public SWIGTYPE_p_float getCfm() {
      long cPtr = DynamicsJNI.btTypedConstraint_btConstraintInfo2_cfm_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
    }
  
    public void setLowerLimit(SWIGTYPE_p_float value) {
      DynamicsJNI.btTypedConstraint_btConstraintInfo2_lowerLimit_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
    }
  
    public SWIGTYPE_p_float getLowerLimit() {
      long cPtr = DynamicsJNI.btTypedConstraint_btConstraintInfo2_lowerLimit_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
    }
  
    public void setUpperLimit(SWIGTYPE_p_float value) {
      DynamicsJNI.btTypedConstraint_btConstraintInfo2_upperLimit_set(swigCPtr, this, SWIGTYPE_p_float.getCPtr(value));
    }
  
    public SWIGTYPE_p_float getUpperLimit() {
      long cPtr = DynamicsJNI.btTypedConstraint_btConstraintInfo2_upperLimit_get(swigCPtr, this);
      return (cPtr == 0) ? null : new SWIGTYPE_p_float(cPtr, false);
    }
  
    public void setNumIterations(int value) {
      DynamicsJNI.btTypedConstraint_btConstraintInfo2_numIterations_set(swigCPtr, this, value);
    }
  
    public int getNumIterations() {
      return DynamicsJNI.btTypedConstraint_btConstraintInfo2_numIterations_get(swigCPtr, this);
    }
  
    public void setDamping(float value) {
      DynamicsJNI.btTypedConstraint_btConstraintInfo2_damping_set(swigCPtr, this, value);
    }
  
    public float getDamping() {
      return DynamicsJNI.btTypedConstraint_btConstraintInfo2_damping_get(swigCPtr, this);
    }
  
    public btConstraintInfo2() {
      this(DynamicsJNI.new_btTypedConstraint_btConstraintInfo2(), true);
    }
  
  }

  public int getOverrideNumSolverIterations() {
    return DynamicsJNI.btTypedConstraint_getOverrideNumSolverIterations(swigCPtr, this);
  }

  public void setOverrideNumSolverIterations(int overideNumIterations) {
    DynamicsJNI.btTypedConstraint_setOverrideNumSolverIterations(swigCPtr, this, overideNumIterations);
  }

  public void buildJacobian() {
    DynamicsJNI.btTypedConstraint_buildJacobian(swigCPtr, this);
  }

  public void setupSolverConstraint(SWIGTYPE_p_btAlignedObjectArrayT_btSolverConstraint_t ca, int solverBodyA, int solverBodyB, float timeStep) {
    DynamicsJNI.btTypedConstraint_setupSolverConstraint(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btSolverConstraint_t.getCPtr(ca), solverBodyA, solverBodyB, timeStep);
  }

  public void getInfo1(btTypedConstraint.btConstraintInfo1 info) {
    DynamicsJNI.btTypedConstraint_getInfo1(swigCPtr, this, btTypedConstraint.btConstraintInfo1.getCPtr(info), info);
  }

  public void getInfo2(btTypedConstraint.btConstraintInfo2 info) {
    DynamicsJNI.btTypedConstraint_getInfo2(swigCPtr, this, btTypedConstraint.btConstraintInfo2.getCPtr(info), info);
  }

  public void internalSetAppliedImpulse(float appliedImpulse) {
    DynamicsJNI.btTypedConstraint_internalSetAppliedImpulse(swigCPtr, this, appliedImpulse);
  }

  public float internalGetAppliedImpulse() {
    return DynamicsJNI.btTypedConstraint_internalGetAppliedImpulse(swigCPtr, this);
  }

  public float getBreakingImpulseThreshold() {
    return DynamicsJNI.btTypedConstraint_getBreakingImpulseThreshold(swigCPtr, this);
  }

  public void setBreakingImpulseThreshold(float threshold) {
    DynamicsJNI.btTypedConstraint_setBreakingImpulseThreshold(swigCPtr, this, threshold);
  }

  public boolean isEnabled() {
    return DynamicsJNI.btTypedConstraint_isEnabled(swigCPtr, this);
  }

  public void setEnabled(boolean enabled) {
    DynamicsJNI.btTypedConstraint_setEnabled(swigCPtr, this, enabled);
  }

  public void solveConstraintObsolete(btSolverBody arg0, btSolverBody arg1, float arg2) {
    DynamicsJNI.btTypedConstraint_solveConstraintObsolete(swigCPtr, this, btSolverBody.getCPtr(arg0), arg0, btSolverBody.getCPtr(arg1), arg1, arg2);
  }

  public btRigidBody getRigidBodyAConst() {
	return btRigidBody.getInstance(DynamicsJNI.btTypedConstraint_getRigidBodyAConst(swigCPtr, this), false);
}

  public btRigidBody getRigidBodyBConst() {
	return btRigidBody.getInstance(DynamicsJNI.btTypedConstraint_getRigidBodyBConst(swigCPtr, this), false);
}

  public btRigidBody getRigidBodyA() {
	return btRigidBody.getInstance(DynamicsJNI.btTypedConstraint_getRigidBodyA(swigCPtr, this), false);
}

  public btRigidBody getRigidBodyB() {
	return btRigidBody.getInstance(DynamicsJNI.btTypedConstraint_getRigidBodyB(swigCPtr, this), false);
}

  public int getUserConstraintType() {
    return DynamicsJNI.btTypedConstraint_getUserConstraintType(swigCPtr, this);
  }

  public void setUserConstraintType(int userConstraintType) {
    DynamicsJNI.btTypedConstraint_setUserConstraintType(swigCPtr, this, userConstraintType);
  }

  public void setUserConstraintId(int uid) {
    DynamicsJNI.btTypedConstraint_setUserConstraintId(swigCPtr, this, uid);
  }

  public int getUserConstraintId() {
    return DynamicsJNI.btTypedConstraint_getUserConstraintId(swigCPtr, this);
  }

  public void setUserConstraintPtr(long ptr) {
    DynamicsJNI.btTypedConstraint_setUserConstraintPtr(swigCPtr, this, ptr);
  }

  public long getUserConstraintPtr() {
    return DynamicsJNI.btTypedConstraint_getUserConstraintPtr(swigCPtr, this);
  }

  public void setJointFeedback(btJointFeedback jointFeedback) {
    DynamicsJNI.btTypedConstraint_setJointFeedback(swigCPtr, this, btJointFeedback.getCPtr(jointFeedback), jointFeedback);
  }

  public btJointFeedback getJointFeedbackConst() {
    long cPtr = DynamicsJNI.btTypedConstraint_getJointFeedbackConst(swigCPtr, this);
    return (cPtr == 0) ? null : new btJointFeedback(cPtr, false);
  }

  public btJointFeedback getJointFeedback() {
    long cPtr = DynamicsJNI.btTypedConstraint_getJointFeedback(swigCPtr, this);
    return (cPtr == 0) ? null : new btJointFeedback(cPtr, false);
  }

  public int getUid() {
    return DynamicsJNI.btTypedConstraint_getUid(swigCPtr, this);
  }

  public boolean needsFeedback() {
    return DynamicsJNI.btTypedConstraint_needsFeedback(swigCPtr, this);
  }

  public void enableFeedback(boolean needsFeedback) {
    DynamicsJNI.btTypedConstraint_enableFeedback(swigCPtr, this, needsFeedback);
  }

  public float getAppliedImpulse() {
    return DynamicsJNI.btTypedConstraint_getAppliedImpulse(swigCPtr, this);
  }

  public int getConstraintType() {
    return DynamicsJNI.btTypedConstraint_getConstraintType(swigCPtr, this);
  }

  public void setDbgDrawSize(float dbgDrawSize) {
    DynamicsJNI.btTypedConstraint_setDbgDrawSize(swigCPtr, this, dbgDrawSize);
  }

  public float getDbgDrawSize() {
    return DynamicsJNI.btTypedConstraint_getDbgDrawSize(swigCPtr, this);
  }

  public void setParam(int num, float value, int axis) {
    DynamicsJNI.btTypedConstraint_setParam__SWIG_0(swigCPtr, this, num, value, axis);
  }

  public void setParam(int num, float value) {
    DynamicsJNI.btTypedConstraint_setParam__SWIG_1(swigCPtr, this, num, value);
  }

  public float getParam(int num, int axis) {
    return DynamicsJNI.btTypedConstraint_getParam__SWIG_0(swigCPtr, this, num, axis);
  }

  public float getParam(int num) {
    return DynamicsJNI.btTypedConstraint_getParam__SWIG_1(swigCPtr, this, num);
  }

  public int calculateSerializeBufferSize() {
    return DynamicsJNI.btTypedConstraint_calculateSerializeBufferSize(swigCPtr, this);
  }

  public String serialize(long dataBuffer, btSerializer serializer) {
    return DynamicsJNI.btTypedConstraint_serialize(swigCPtr, this, dataBuffer, btSerializer.getCPtr(serializer), serializer);
  }

}
