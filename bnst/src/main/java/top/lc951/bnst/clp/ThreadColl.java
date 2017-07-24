package top.lc951.bnst.clp;

import static top.lc951.bnst.clp.MyGLSurfaceView.angleForSpecFrame;
import static top.lc951.bnst.clp.MyGLSurfaceView.bxForSpecFrame;
import static top.lc951.bnst.clp.MyGLSurfaceView.bzForSpecFrame;

/**
 * Created by lichong on 2017/7/24.
 *
 * @ Email lichongmac@163.com
 */
//定时检查可以撞飞的部件，如交通筒灯部件，是否被碰撞的线程
public class ThreadColl extends Thread {
    MyGLSurfaceView surface;

    public boolean flag=true;

    public ThreadColl(MyGLSurfaceView surface)
    {
        this.surface=surface;
        this.setName("ThreadColl");
    }

    public void run()
    {
        while(flag)
        {
            for(KZBJForControl kzbjfcTemp:surface.kzbjList)
            {
                if(!kzbjfcTemp.state)
                {
                    kzbjfcTemp.checkColl(bxForSpecFrame, bzForSpecFrame, angleForSpecFrame);
                }
                kzbjfcTemp.go();
            }
            try
            {
                Thread.sleep(50);//50
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
