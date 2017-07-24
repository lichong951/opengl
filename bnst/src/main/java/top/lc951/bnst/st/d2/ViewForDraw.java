package top.lc951.bnst.st.d2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import top.lc951.bnst.st.xc.Constant_xc;

/**
 * Created by lichong on 2017/7/24.
 *
 * @ Email lichongmac@163.com
 */

public class ViewForDraw extends SurfaceView
        implements SurfaceHolder.Callback  //实现生命周期回调接口
{
    MyActivity activity;
    Paint paint;//画笔
    boolean flag;
    MySFView curr;

    public ViewForDraw(MyActivity activity)
    {
        super(activity);
        this.setKeepScreenOn(true);
        this.activity = activity;
        //设置生命周期回调接口的实现者
        this.getHolder().addCallback(this);
        //初始化画笔
        paint = new Paint();//创建画笔
        paint.setAntiAlias(true);//打开抗锯齿
    }

    public void initThread()
    {
        flag=true;
        new Thread()
        {
            {
                this.setName("VFD Thread");
            }
            public void run()
            {
                while(flag)
                {
                    repaint();
                    try
                    {
                        Thread.sleep(40);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }

    public void draw2(Canvas canvas)
    {
        if(canvas==null)
        {
            return;
        }
        canvas.clipRect
                (
                        new Rect
                                (
                                        0,
                                        0,
                                        (int) Constant_xc.SCREEN_WIDTH,
                                        (int)Constant_xc.SCREEN_HEIGHT
                                )
                );

        curr.onDraw(canvas);
    }

    public void surfaceChanged(SurfaceHolder arg0, int arg1, int arg2, int arg3)
    {

    }

    public void surfaceCreated(SurfaceHolder holder) {//创建时被调用
        repaint();
    }

    public void surfaceDestroyed(SurfaceHolder arg0) {//销毁时被调用

    }

    public void repaint()
    {
        SurfaceHolder holder=this.getHolder();
        Canvas canvas = holder.lockCanvas();//获取画布
        try{
            synchronized(holder){
                draw2(canvas);//绘制
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            if(canvas != null){
                holder.unlockCanvasAndPost(canvas);
            }
        }
    }

    //屏幕触控事件
    @Override
    public boolean onTouchEvent(MotionEvent e)
    {
        if(curr==null)
        {
            return false;
        }

        return curr.onTouchEvent(e);
    }
}
