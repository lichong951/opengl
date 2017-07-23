package top.lc951.sample17._6;

import com.bulletphysics.dynamics.RigidBody;
import com.bulletphysics.linearmath.Transform;

import javax.vecmath.Quat4f;

import top.lc951.sample17._2.SYSUtil;

import static top.lc951.sample17._6.Constant.isNumber;

/**
 * Created by lichong@7moor.com on 2017/7/23.
 */

class Cube {
    TexRect rect;//正方形
    float halfSize;

    RigidBody body;
    MySurfaceView_6 mv;

    public Cube
            (
                    MySurfaceView_6 mv,
                    float halfSize,
                    RigidBody body
            ){
        this.mv=mv;
        this.halfSize=halfSize;
        rect = new TexRect(mv,1,halfSize,halfSize);
        this.body=body;
    }

    public void drawSelf(int[] texIds,int index){
        int texId = texIds[index];

        MatrixState.pushMatrix();
        MySurfaceView_6.init=false;
        Transform trans = body.getMotionState().getWorldTransform(new Transform());
        MatrixState.translate(trans.origin.x,trans.origin.y, trans.origin.z);
        Quat4f ro=trans.getRotation(new Quat4f());
        if(ro.x!=0||ro.y!=0||ro.z!=0)
        {
            float[] fa= SYSUtil.fromSYStoAXYZ(ro);
            if(isNumber(fa[0]+"") && isNumber(fa[1]+"") && isNumber(fa[2]+"")){
                MatrixState.rotate(fa[0], fa[1], fa[2], fa[3]);
            }
        }


        //绘制上面
        MatrixState.pushMatrix();
        MatrixState.translate(0, halfSize, 0);
        MatrixState.rotate(-90, 1, 0, 0);
        rect.drawSelf(texId);
        MatrixState.popMatrix();

        //绘制下面
        MatrixState.pushMatrix();
        MatrixState.translate(0, -halfSize, 0);
        MatrixState.rotate(90, 1, 0, 0);
        rect.drawSelf(texId);
        MatrixState.popMatrix();

        //绘制左面
        MatrixState.pushMatrix();
        MatrixState.translate(-halfSize, 0, 0);
        MatrixState.rotate(-90, 0, 1, 0);
        rect.drawSelf(texId);
        MatrixState.popMatrix();

        //绘制右面
        MatrixState.pushMatrix();
        MatrixState.translate(halfSize, 0, 0);
        MatrixState.rotate(90, 0, 1, 0);
        rect.drawSelf(texId);
        MatrixState.popMatrix();

        //绘制前面
        MatrixState.pushMatrix();
        MatrixState.translate(0, 0, halfSize);
        rect.drawSelf(texId);
        MatrixState.popMatrix();

        //绘制后面
        MatrixState.pushMatrix();
        MatrixState.translate(0, 0, -halfSize);
        MatrixState.rotate(180, 0, 1, 0);
        rect.drawSelf(texId);
        MatrixState.popMatrix();

        MatrixState.popMatrix();
    }
}
