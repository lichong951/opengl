package top.lc951.sample15._9;

/**
 * Created by lichong on 2017/7/19.
 *
 * @ Email lichongmac@163.com
 */

class Light {
    Point3 pos;//灯光位置

    public Light(){
        pos = new Point3();
    }
    public Light(Point3 pos) {
        this.pos = pos;
    }
}
