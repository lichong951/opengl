package top.lc951.sample15._9;

/**
 * Created by lichong on 2017/7/19.
 *
 * @ Email lichongmac@163.com
 */

class Intersection {
    int numHits;//有正的相交时间相交物体的数目
    HitInfo[] hit=new HitInfo[8];//交点列表，以后可能需要多于8个交点

    public Intersection(){
        for(int i=0; i<8; i++){//初始化HitInfo数组
            hit[i]=new HitInfo();
        }
    }
    public void set(Intersection inter){
        for(int i=0; i<8; i++){//复制一份，绝不可以直接给引用
            this.hit[i].set(inter.hit[i]);
        }

        this.numHits = inter.numHits;
    }
}
