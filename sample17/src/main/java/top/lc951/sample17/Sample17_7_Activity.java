package top.lc951.sample17;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;

import top.lc951.sample17._7.MySurfaceView;

public class Sample17_7_Activity extends AppCompatActivity {
    private MySurfaceView mGLSurfaceView;
    public static float screenWidth;//屏幕宽度
    public static float screenHeight;//屏幕高度
    public static void actionActivity(Context context){
            Intent intent =new Intent(context,Sample17_7_Activity.class);
            context.startActivity(intent);
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);//去掉标头
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//强制横屏
        DisplayMetrics dm=new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        screenWidth=dm.widthPixels;			//dm.widthPixels    获取屏幕横向分辨率
        screenHeight=dm.heightPixels;		//dm.heightPixels	获取屏幕竖向分辨率

        mGLSurfaceView = new MySurfaceView(this);
        mGLSurfaceView.requestFocus();//获取焦点
        mGLSurfaceView.setFocusableInTouchMode(true);//设置为可触控

        setContentView(mGLSurfaceView);
    }
    @Override
    protected void onResume() {
        super.onResume();
        mGLSurfaceView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mGLSurfaceView.onPause();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent e)
    {
        if(keyCode==4)
        {
            System.exit(0);
        }
        return false;
    }
}
