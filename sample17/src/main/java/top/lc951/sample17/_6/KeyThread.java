package top.lc951.sample17._6;
import static top.lc951.sample17._6.Constant.keyFlag;

/**
 * Created by lichong@7moor.com on 2017/7/23.
 */

 class KeyThread extends Thread {
    MySurfaceView_6 mv;
    public KeyThread(MySurfaceView_6 mv)
    {
        this.mv=mv;
    }
    public void run()
    {
        while(keyFlag)
        {
            if((MySurfaceView_6.keyState&0x1)!=0)
            {//有UP键按下
                mv.slideFB(1);
            }
            else if((MySurfaceView_6.keyState&0x2)!=0)
            {//有down键按下
                mv.slideFB(-1);
            }
            if((MySurfaceView_6.keyState&0x4)!=0)
            {//有left键按下
                mv.slideLR(-1);
            }
            else if((MySurfaceView_6.keyState&0x8)!=0)
            {//有right键按下
                mv.slideLR(1);
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
