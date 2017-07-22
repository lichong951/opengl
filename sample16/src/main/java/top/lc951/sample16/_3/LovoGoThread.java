package top.lc951.sample16._3;


import java.util.ArrayList;


/**
 * Created by lichong on 2017/7/20.
 *
 * @ Email lichongmac@163.com
 */

public class LovoGoThread extends Thread {
    ArrayList<RigidBody> al;//控制列表
    boolean flag=true;//线程控制标志位

    public LovoGoThread(ArrayList<RigidBody> al)
    {
        this.al=al;
    }

    public void run()
    {
        while(flag)
        {
            int size=al.size();
            for(int i=0;i<size;i++)
            {
                al.get(i).go(al);
            }
            try
            {
                sleep(20);
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}