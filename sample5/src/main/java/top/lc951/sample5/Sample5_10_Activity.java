package top.lc951.sample5;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ToggleButton;

import top.lc951.sample5._10.MySurfaceView;
import top.lc951.sample5.cube.MatrixState;

import static top.lc951.sample5.cube.Constant.ratio;

public class Sample5_10_Activity extends AppCompatActivity {
    private MySurfaceView mGLSurfaceView;
    public static void actionActivity(Context context){
        context.startActivity(new Intent(context, Sample5_10_Activity.class));
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
        //切换到主界面
        setContentView(R.layout.activity_sample5_10);
        //初始化GLSurfaceView
        mGLSurfaceView = new MySurfaceView(this);
        mGLSurfaceView.requestFocus();//获取焦点
        mGLSurfaceView.setFocusableInTouchMode(true);//设置为可触控
        //将自定义的GLSurfaceView添加到外层LinearLayout中
        LinearLayout ll=(LinearLayout)findViewById(R.id.main_liner);
        ll.addView(mGLSurfaceView);
        //控制是否打开背面剪裁的ToggleButton
        ToggleButton tb=(ToggleButton)this.findViewById(R.id.ToggleButton01);
        tb.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener()
                {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
                    {
                        if(isChecked)
                        {
                            //视角不合适导致变形
                            //调用此方法计算产生透视投影矩阵
                            MatrixState.setProjectFrustum(-ratio*0.7f, ratio*0.7f, -0.7f, 0.7f, 1, 10);
                            //调用此方法产生摄像机9参数位置矩阵
                            MatrixState.setCamera(0,0.5f,4,0f,0f,0f,0f,1.0f,0.0f);
                        }
                        else
                        {
                            //视角合适不变形
                            //调用此方法计算产生透视投影矩阵
                            MatrixState.setProjectFrustum(-ratio, ratio, -1, 1, 20, 100);
                            //调用此方法产生摄像机9参数位置矩阵
                            MatrixState.setCamera(0,8f,45,0f,0f,0f,0f,1.0f,0.0f);
                        }
                    }
                }
        );

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
