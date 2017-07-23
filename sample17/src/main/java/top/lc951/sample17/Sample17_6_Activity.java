package top.lc951.sample17;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;

import top.lc951.sample17._6.MySurfaceView_6;

public class Sample17_6_Activity extends AppCompatActivity {
    MySurfaceView_6 surfaceView;
    public static void actionActivity(Context context){
            Intent intent =new Intent(context,Sample17_6_Activity.class);
            context.startActivity(intent);
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);//去掉标头
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//强制横屏

        surfaceView = new MySurfaceView_6(this);
        setContentView(surfaceView);
    }
    @Override
    protected void onPause() {
        super.onPause();
        surfaceView.onPause();
        surfaceView.flag=false;
    }

    @Override
    protected void onResume() {
        super.onResume();
        surfaceView.onResume();
        surfaceView.flag=true;
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
