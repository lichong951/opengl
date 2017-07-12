package top.lc951.sample7;

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
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.RadioButton;

import top.lc951.sample7._2.MySurfaceView;

public class Sample7_2_Activity extends AppCompatActivity {
    private MySurfaceView mGLSurfaceView;

    public static void actionActivity(Context context) {
        context.startActivity(new Intent(context, Sample7_2_Activity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置为全屏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //设置为横屏模式
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        //切换到主界面
        setContentView(R.layout.activity_sample7_2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

//初始化GLSurfaceView
        mGLSurfaceView = new MySurfaceView(this);
        mGLSurfaceView.requestFocus();//获取焦点
        mGLSurfaceView.setFocusableInTouchMode(true);//设置为可触控
        //将自定义的GLSurfaceView添加到外层LinearLayout中
        LinearLayout ll=(LinearLayout)findViewById(R.id.main_liner);
        ll.addView(mGLSurfaceView);

        //为RadioButton添加监听器及SxT选择代码
        RadioButton rab = (RadioButton) findViewById(R.id.edge);
        rab.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        //GL_CLAMP_TO_EDGE模式下
                        if (isChecked) {
                            mGLSurfaceView.currTextureId = mGLSurfaceView.textureCTId;
                        }
                    }
                }
        );
        rab = (RadioButton) findViewById(R.id.repeat);
        rab.setOnCheckedChangeListener(
                new OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        //GL_REPEAT模式下
                        if (isChecked) {
                            mGLSurfaceView.currTextureId = mGLSurfaceView.textureREId;
                        }
                    }
                }
        );


        //为RadioButton添加监听器及SxT选择代码
        RadioButton rb = (RadioButton) findViewById(R.id.x11);
        rb.setOnCheckedChangeListener(
                new OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {//设置为纹理坐标SxT=1x1
                            mGLSurfaceView.trIndex = 0;
                        }
                    }
                }
        );
        rb = (RadioButton) findViewById(R.id.x42);
        rb.setOnCheckedChangeListener(
                new OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {//设置为纹理坐标SxT=4x2
                            mGLSurfaceView.trIndex = 1;
                        }
                    }
                }
        );
        rb = (RadioButton) findViewById(R.id.x44);
        rb.setOnCheckedChangeListener(
                new OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {//设置为纹理坐标SxT=4x4
                            mGLSurfaceView.trIndex = 2;
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
