package top.lc951.sample12;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import top.lc951.sample12._2.MySurfaceView;


public class Sample12_2_Activity extends AppCompatActivity {
    MySurfaceView mview;
    //屏幕对应的宽度和高度
    public static float WIDTH;
    public static float HEIGHT;
    public static void actionActivity(Context context){
        context.startActivity(new Intent(context, Sample12_2_Activity.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置为全屏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN ,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //获得系统的宽度以及高度
        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        if(dm.widthPixels>dm.heightPixels)
        {
            WIDTH=dm.widthPixels;
            HEIGHT=dm.heightPixels;
        }
        else
        {
            WIDTH=dm.heightPixels;
            HEIGHT=dm.widthPixels;
        }
        //设置为横屏模式
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        mview = new MySurfaceView(this);
        mview.requestFocus();//获取焦点
        mview.setFocusableInTouchMode(true);//设置为可触控
        setContentView(mview);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mview.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mview.onPause();
    }
}
