package top.lc951.sample16;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;

import top.lc951.sample16._6.Constant_6;
import top.lc951.sample16._6.MySurfaceView;

import static android.os.Build.VERSION_CODES.N;

public class Sample16_6_Activity extends AppCompatActivity {
    MySurfaceView surfaceView;
    public static void actionActivity(Context context){
        context.startActivity(new Intent(context, Sample16_6_Activity.class));
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
        surfaceView = new MySurfaceView(this);
        setContentView(surfaceView);
    }
    @Override
    protected void onResume() {
        super.onResume();
        surfaceView.onResume();
        Constant_6.flag=true;
    }

    @Override
    protected void onPause() {
        super.onPause();
        surfaceView.onPause();
        Constant_6.flag=false;
    }
    @Override
    public boolean onKeyDown(int keyCode,KeyEvent e)
    {
        switch(keyCode)
        {
            case 4:
                System.exit(0);
                break;
        }
        return true;
    }

}
