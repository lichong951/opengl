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

import top.lc951.sample7._3.MySurfaceView;

public class Sample7_3_Activity extends AppCompatActivity {
    private MySurfaceView mGLSurfaceView;

    public static void actionActivity(Context context){
        context.startActivity(new Intent(context, Sample7_3_Activity.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置为全屏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN ,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //设置为横屏模式
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //切换到主界面

        setContentView(R.layout.activity_sample7_3);
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

//为RadioButton添加监听器
        RadioButton rb=(RadioButton)findViewById(R.id.Radi01);
        rb.setOnCheckedChangeListener(
                new OnCheckedChangeListener()
                {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView,boolean isChecked)
                    {
                        if(isChecked)
                        {
                            mGLSurfaceView.currenttexId32 = mGLSurfaceView.texId[0];
                            mGLSurfaceView.currenttexId256 = mGLSurfaceView.texId[4];
                        }
                    }
                }
        );
        rb=(RadioButton)findViewById(R.id.Radi02);
        rb.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener()
                {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
                    {
                        if(isChecked)
                        {
                            mGLSurfaceView.currenttexId32 = mGLSurfaceView.texId[1];
                            mGLSurfaceView.currenttexId256 = mGLSurfaceView.texId[5];
                        }
                    }
                }
        );
        rb=(RadioButton)findViewById(R.id.Radi03);
        rb.setOnCheckedChangeListener(
                new OnCheckedChangeListener()
                {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView,boolean isChecked)
                    {
                        if(isChecked)
                        {
                            mGLSurfaceView.currenttexId32 = mGLSurfaceView.texId[2];
                            mGLSurfaceView.currenttexId256 = mGLSurfaceView.texId[6];
                        }
                    }
                }
        );
        rb=(RadioButton)findViewById(R.id.Radi04);
        rb.setOnCheckedChangeListener(
                new OnCheckedChangeListener()
                {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView,boolean isChecked)
                    {
                        if(isChecked)
                        {
                            mGLSurfaceView.currenttexId32 = mGLSurfaceView.texId[3];
                            mGLSurfaceView.currenttexId256 = mGLSurfaceView.texId[7];
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
