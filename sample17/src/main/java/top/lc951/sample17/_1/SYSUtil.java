package top.lc951.sample17._1;

import javax.vecmath.Quat4f;

/**
 * Created by lichong on 2017/7/21.
 *
 * @ Email lichongmac@163.com
 */

class SYSUtil {
    //将四元数转换为角度及转轴向量
    public static float[] fromSYStoAXYZ(Quat4f q4)
    {
        double sitaHalf=Math.acos(q4.w);
        float nx=(float) (q4.x/Math.sin(sitaHalf));
        float ny=(float) (q4.y/Math.sin(sitaHalf));
        float nz=(float) (q4.z/Math.sin(sitaHalf));

        return new float[]{(float) Math.toDegrees(sitaHalf*2),nx,ny,nz};
    }
}
