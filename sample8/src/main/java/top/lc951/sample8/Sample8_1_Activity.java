package top.lc951.sample8;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import android.widget.RadioButton;

import top.lc951.sample8._1.MySurfaceView;

public class Sample8_1_Activity extends AppCompatActivity {
    MySurfaceView mySurfaceView;
    public static void actionActivity(Context context){
        context.startActivity(new Intent(context, Sample8_1_Activity.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置为全屏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN ,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //设置为竖屏模式
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //切换到主界面
        setContentView(R.layout.activity_sample8_1);
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
        mySurfaceView = new MySurfaceView(this);
        mySurfaceView.requestFocus();//获取焦点
        mySurfaceView.setFocusableInTouchMode(true);//设置为可触控

        //将自定义的GLSurfaceView添加到外层LinearLayout中
        LinearLayout ll=(LinearLayout)findViewById(R.id.main_liner);
        ll.addView(mySurfaceView);

        //为RadioButton添加监听器及SxT选择代码
        RadioButton rab=(RadioButton)findViewById(R.id.RadioButton01);
        rab.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener()
                {
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
                    {
                        //面填充
                        if(isChecked)
                        {
                            mySurfaceView.drawWhatFlag=true;
                        }
                    }
                }
        );
        rab=(RadioButton)findViewById(R.id.RadioButton02);

        rab.setOnCheckedChangeListener(
                new OnCheckedChangeListener()
                {
                    public void onCheckedChanged(CompoundButton buttonView,boolean isChecked)
                    {
                        //线填充
                        if(isChecked)
                        {
                            mySurfaceView.drawWhatFlag=false;
                        }
                    }
                }
        );

    }
    public boolean onKeyDown(int keyCode,KeyEvent e)
    {
        switch(keyCode)
        {
            case 4:
                System.exit(0);
                break;
        }
        return true;
    };

}
