package top.lc951.sample8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;

import top.lc951.sample8._7.MySurfaceView;

public class Sample8_7_Activity extends AppCompatActivity {
    MySurfaceView mySurfaceView;
    public static void actionActivity(Context context){
            context.startActivity(new Intent(context, Sample8_7_Activity.class));
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置为全屏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN ,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //设置为横屏模式
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        //初始化GLSurfaceView
        mySurfaceView = new MySurfaceView(this);

        //切换到主界面
//切换到主界面
        setContentView(mySurfaceView);

        mySurfaceView.requestFocus();//获取焦点
        mySurfaceView.setFocusableInTouchMode(true);//设置为可触控
    }
    protected void onResume() {
        super.onResume();
        mySurfaceView.onResume();
        mySurfaceView.lightFlag=true;
    }

    @Override
    protected void onPause() {
        super.onPause();
        mySurfaceView.onPause();
        mySurfaceView.lightFlag=false;
    }
    public boolean onKeyDown(int keyCode,KeyEvent e)
    {
        switch(keyCode)
        {
            case 4:
                System.exit(0);
                break;
        }
        return true;
    };
}
