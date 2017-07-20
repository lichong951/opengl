package top.lc951.sample16._2;

/**
 * Created by lichong on 2017/7/20.
 *
 * @ Email lichongmac@163.com
 */

class Vector3f {
    float x;
    float y;
    float z;

    public Vector3f(float x,float y,float z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public void add(Vector3f temp)
    {
        this.x+=temp.x;
        this.y+=temp.y;
        this.z+=temp.z;
    }
}
