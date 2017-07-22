package top.lc951.sample14;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import top.lc951.sample14._1.MySurfaceView_1;

public class Sample14_1_Activity extends AppCompatActivity {
    private MySurfaceView_1 mGLSurfaceView;

    public static void actionActivity(Context context){
        context.startActivity(new Intent(context, Sample14_1_Activity.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 设置为全屏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // 初始化GLSurfaceView
        mGLSurfaceView = new MySurfaceView_1(this);
        // 切换到主界面
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
}
