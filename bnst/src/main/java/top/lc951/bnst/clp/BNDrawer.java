package top.lc951.bnst.clp;

/**
 * Created by lichong on 2017/7/24.
 * 该类是一个抽象类，所有的3D物体的绘制均继承自该类
 * @ Email lichongmac@163.com
 */

public abstract class BNDrawer {
    public abstract void drawSelf(int[] texId,int dyFlag);
}
