package top.lc951.sample11._1;

import java.util.ArrayList;
import java.util.List;

import static top.lc951.sample11._1.MySurfaceView.UNIT_SIZE;

/**
 * Created by lichong on 2017/7/16.
 *
 * @ Email lichongmac@163.com
 */

class TreeGroup {
    TreeForDraw tfd;
    List<SingleTree> alist=new ArrayList<SingleTree>();

    public TreeGroup(MySurfaceView mv)
    {
        tfd=new TreeForDraw(mv);
        alist.add(new SingleTree(0,0,0,this));
        alist.add(new SingleTree(8*UNIT_SIZE,0,0,this));
        alist.add(new SingleTree(5.7f*UNIT_SIZE,5.7f*UNIT_SIZE,0,this));
        alist.add(new SingleTree(0,-8*UNIT_SIZE,0,this));
        alist.add(new SingleTree(-5.7f*UNIT_SIZE,5.7f*UNIT_SIZE,0,this));
        alist.add(new SingleTree(-8*UNIT_SIZE,0,0,this));
        alist.add(new SingleTree(-5.7f*UNIT_SIZE,-5.7f*UNIT_SIZE,0,this));
        alist.add(new SingleTree(0,8*UNIT_SIZE,0,this));
        alist.add(new SingleTree(5.7f*UNIT_SIZE,-5.7f*UNIT_SIZE,0,this));
    }
    public void calculateBillboardDirection()
    {
        //计算列表中每个树木的朝向
        for(int i=0;i<alist.size();i++)
        {
            alist.get(i).calculateBillboardDirection();
        }
    }

    public void drawSelf(int texId)
    {//绘制列表中的每个树木
        for(int i=0;i<alist.size();i++)
        {
            alist.get(i).drawSelf(texId);
        }
    }
}
