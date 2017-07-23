package top.lc951.sample17._7;

import com.bulletphysics.collision.shapes.CollisionShape;
import com.bulletphysics.dynamics.DiscreteDynamicsWorld;
import com.bulletphysics.dynamics.RigidBody;
import com.bulletphysics.dynamics.RigidBodyConstructionInfo;
import com.bulletphysics.linearmath.DefaultMotionState;
import com.bulletphysics.linearmath.Transform;

import javax.vecmath.Vector3f;

/**
 * Created by lichong@7moor.com on 2017/7/23.
 */

class AddRigidBody {
    RigidBody body;

    public AddRigidBody(CollisionShape shape, float mass, DiscreteDynamicsWorld dynamicsWorld,
                        float restitution, float friction, Vector3f origin){
        boolean isDynamic = (mass!=0);
        Vector3f localInertia = new Vector3f(0,0,0);
        if(isDynamic){
            shape.calculateLocalInertia(mass, localInertia);
        }
        //创建刚体的初始变换对象
        Transform groundTransform = new Transform();
        groundTransform.setIdentity();
        groundTransform.origin.set(origin);
        //创建刚体的运动状态对象
        DefaultMotionState myMotionState = new DefaultMotionState(groundTransform);
        //创建刚体信息对象
        RigidBodyConstructionInfo rbInfo = new RigidBodyConstructionInfo(mass, myMotionState, shape, localInertia);
        //创建刚体
        body = new RigidBody(rbInfo);
        //设置反弹系数
        body.setRestitution(restitution);
        //设置摩擦系数
        body.setFriction(friction);
        //将刚体添加进物理世界
        dynamicsWorld.addRigidBody(body);
    }
}
