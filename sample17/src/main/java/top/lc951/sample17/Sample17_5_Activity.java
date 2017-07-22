package top.lc951.sample17;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import top.lc951.sample17._5.MySurfaceView;

public class Sample17_5_Activity extends AppCompatActivity {
    MySurfaceView surfaceView;
    public static void actionActivity(Context context){
            context.startActivity(new Intent(context, Sample17_5_Activity.class));
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);//去掉标题
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);//去掉标头
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//强制横屏

        surfaceView = new MySurfaceView(this);
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
}
