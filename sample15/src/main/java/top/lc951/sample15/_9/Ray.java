package top.lc951.sample15._9;

/**
 * Created by lichong on 2017/7/19.
 *
 * @ Email lichongmac@163.com
 */

class Ray {
    Point3 start;//起始位置
    Vector3 dir;//光线方向
    public Ray(){
        start = new Point3();
        dir = new Vector3();
    }
    //设置光线起始位置的方法
    public void setStart(Point3 start){
        this.start.x = start.x;
        this.start.y = start.y;
        this.start.z = start.z;
    }
    //设置光线发射方向的方法
    public void setDir(Vector3 dir){
        this.dir.x = dir.x;
        this.dir.y = dir.y;
        this.dir.z = dir.z;
    }
}
