package top.lc951.sample8._2;

import top.lc951.sample8._1.MatrixState;

/**
 * Created by lichong on 2017/7/12.
 */

class ConeL {
    CircleL bottomCircle;//底圆的骨架类的引用
    ConeSideL coneSide;//侧面的骨架类的引用
    float xAngle=0;//绕x轴旋转的角度
    float yAngle=0;//绕y轴旋转的角度
    float zAngle=0;//绕z轴旋转的角度
    float h;
    float scale;

    public ConeL(MySurfaceView mySurfaceView,float scale,float r, float h,int n)
    {
        this.scale=scale;
        this.h=h;
        bottomCircle=new CircleL(mySurfaceView,scale,r,n);  //创建底面骨架圆的对象
        coneSide=new ConeSideL(mySurfaceView,scale,r,h,n); //创建侧面无顶圆锥骨架的对象
    }
    public void drawSelf()
    {
        MatrixState.rotate(xAngle, 1, 0, 0);
        MatrixState.rotate(yAngle, 0, 1, 0);
        MatrixState.rotate(zAngle, 0, 0, 1);

        //底面
        MatrixState.pushMatrix();
        MatrixState.translate(0, -h/2, 0);
        MatrixState.rotate(90, 1, 0, 0);
        MatrixState.rotate(180, 0, 0, 1);
        bottomCircle.drawSelf();
        MatrixState.popMatrix();

        //侧面
        MatrixState.pushMatrix();
        MatrixState.translate(0, -h/2, 0);
        coneSide.drawSelf();
        MatrixState.popMatrix();
    }
}