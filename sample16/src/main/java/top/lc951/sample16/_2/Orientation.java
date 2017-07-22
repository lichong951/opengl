package top.lc951.sample16._2;

import android.opengl.Matrix;

/**
 * Created by lichong on 2017/7/20.
 *
 * @ Email lichongmac@163.com
 */

class Orientation {
    float[] orientationData=new float[16];

    public Orientation(float angle,float zx,float zy,float zz)
    {
        Matrix.setRotateM(orientationData, 0, angle, zx, zy, zz);
    }
}
