package top.lc951.aircraftattack.commonObject;

import java.util.Iterator;

import top.lc951.aircraftattack.core.MatrixState;

import static top.lc951.aircraftattack.game_view.GLGameView.baoZhaList;
import static top.lc951.aircraftattack.game_view.GLGameView.baoZhaXiaoguo2;
import static top.lc951.aircraftattack.game_view.GLGameView.cx;
import static top.lc951.aircraftattack.game_view.GLGameView.cy;
import static top.lc951.aircraftattack.game_view.GLGameView.cz;

/**
 * Created by lichong on 2017/7/25.
 *
 * @ Email lichongmac@163.com
 */

public class DrawBomb {
    float x,y,z;
    float xAngle,yAngle,zAngle;
    int index;//当前播放了第几幅图
    TextureRect recw;//矩形引用
    public DrawBomb(TextureRect recw,float x,float y,float z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
        this.recw=recw;
    }
    public void drawSelf()
    {
        index++;
        if(index>15)
        {
            try
            {
                Iterator<DrawBomb> ite=baoZhaList.iterator();
                while(ite.hasNext())
                {
                    if(ite.next()==this)
                    {
                        ite.remove();
                        return;
                    }
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }

            return;
        }
        calculateBillboardDirection();
        MatrixState.pushMatrix();
        MatrixState.translate(x, y, z);
        MatrixState.rotate(xAngle, 1, 0, 0);
        MatrixState.rotate(yAngle, 0, 1, 0);
        MatrixState.rotate(zAngle, 0, 0, 1);
        MatrixState.scale(index/3%5*0.8f, index/3%5*0.8f, index/3%5*0.8f);
        recw.drawSelf(baoZhaXiaoguo2);// baoZhaTexId[index/3%5]);
        MatrixState.popMatrix();
    }
    public void calculateBillboardDirection()
    {//根据摄像机位置计算爆炸纹理面朝向
        float xspan=x-cx;
        float zspan=z-cz;
        float yspan=y-cy;
        if(zspan<=0)
        {
            yAngle=(float)Math.toDegrees(Math.atan(xspan/zspan));
        }
        else
        {
            yAngle=180+(float)Math.toDegrees(Math.atan(xspan/zspan));
        }

        xAngle=(float)Math.toDegrees(Math.atan(yspan/Math.sqrt(xspan*xspan+zspan*zspan)));
    }
}
