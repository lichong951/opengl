package top.lc951.bnst.clp;

import static top.lc951.bnst.clp.Constant_clp.CURR_BOAT_V;
import static top.lc951.bnst.clp.Constant_clp.head_Angle;
import static top.lc951.bnst.clp.Constant_clp.head_Angle_A;
import static top.lc951.bnst.clp.Constant_clp.head_Angle_Max;

/**
 * Created by lichong on 2017/7/24.
 *
 * @ Email lichongmac@163.com
 */

public class RotateThread extends Thread {
    public RotateThread()
    {
        this.setName("RotateThread");
    }

    public void run()
    {
        while(Constant_clp.threadFlag)
        {
            SpeedForControl.angleY=(SpeedForControl.angleY+6)%360;

            if(CURR_BOAT_V==0)
            {
                if(head_Angle<=head_Angle_Max&&KeyThread.upFlag)
                {
                    head_Angle=head_Angle+head_Angle_A;
                    if(head_Angle==head_Angle_Max)
                    {
                        KeyThread.upFlag=false;
                    }
                }
                else if(head_Angle>=-head_Angle_Max&&!KeyThread.upFlag)
                {
                    head_Angle=head_Angle-head_Angle_A;
                    if(head_Angle==-head_Angle_Max)
                    {
                        KeyThread.upFlag=true;
                    }
                }
            }
            else
            {
                if(head_Angle<4)
                {
                    head_Angle=head_Angle+head_Angle_A;
                }
                else
                {
                    head_Angle=head_Angle-head_Angle_A;
                }
            }

            try
            {
                Thread.sleep(60);
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
