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
import android.widget.RadioButton;

import top.lc951.sample5._11.MySurfaceView;

public class Sample5_11_Activity extends AppCompatActivity {
    private MySurfaceView mGLSurfaceView;
    public static void actionActivity(Context context){
        context.startActivity(new Intent(context, Sample5_11_Activity.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 设置为全屏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //设置为横屏
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

// 初始化GLSurfaceView
        mGLSurfaceView = new MySurfaceView(this);
        // 切换到主界面
        setContentView(R.layout.activity_sample5_11);
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

        bindView();
    }

    private void bindView() {
        //将自定义的SurfaceView添加到外层LinearLayout中
        LinearLayout ll=(LinearLayout)findViewById(R.id.main_liner);
        ll.addView(mGLSurfaceView);
        mGLSurfaceView.requestFocus();// 获取焦点
        mGLSurfaceView.setFocusableInTouchMode(true);// 设置为可触控

        RadioButton rb = (RadioButton) findViewById(R.id.RadioButton01);

        // RadioButton添加监听器
        rb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                mGLSurfaceView.setCwOrCcw(isChecked);
            }
        });
        rb = (RadioButton) findViewById(R.id.RadioButton03);
        // RadioButton添加监听器
        rb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                mGLSurfaceView.setCullFace(isChecked);
            }
        });
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
