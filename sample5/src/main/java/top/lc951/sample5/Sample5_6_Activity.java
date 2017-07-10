package top.lc951.sample5;

import android.content.Context;
import android.content.Intent;
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
import android.widget.PopupWindow;
import android.widget.RadioButton;

import top.lc951.sample5.cube.Constant;
import top.lc951.sample5.points_or_lines.MySurfaceView;

public class Sample5_6_Activity extends AppCompatActivity {

    private MySurfaceView mGLSurfaceView;
    RadioButton rb0;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;

    public static void actionActivity(Context context) {
        context.startActivity(new Intent(context, Sample5_6_Activity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 设置为全屏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //初始化GLSurfaceView
        mGLSurfaceView = new MySurfaceView(this);
        setContentView(R.layout.activity_sample5_6);
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

        bindViews();

    }

    private void bindViews() {
        //将自定义的SurfaceView添加到外层LinearLayout中
        LinearLayout ll = (LinearLayout) findViewById(R.id.main_liner);
        ll.addView(mGLSurfaceView);
        mGLSurfaceView.requestFocus();// 获取焦点
        mGLSurfaceView.setFocusableInTouchMode(true);// 设置为可触控

        rb0 = (RadioButton) findViewById(R.id.RadioButton00);
        rb1 = (RadioButton) findViewById(R.id.RadioButton01);
        rb2 = (RadioButton) findViewById(R.id.RadioButton02);
        rb3 = (RadioButton) findViewById(R.id.RadioButton03);
        // GL_POINTS RadioButton添加监听器
        rb0.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) {
                    Constant.CURR_DRAW_MODE = Constant.GL_POINTS;
                    rb1.setChecked(false);
                    rb2.setChecked(false);
                    rb3.setChecked(false);
                }
            }
        });

// GL_LINES RadioButton添加监听器
        rb1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) {
                    Constant.CURR_DRAW_MODE = Constant.GL_LINES;
                    rb0.setChecked(false);
                    rb2.setChecked(false);
                    rb3.setChecked(false);
                }
            }
        });
        // GL_LINE_STRIP RadioButton添加监听器
        rb2.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) {
                    Constant.CURR_DRAW_MODE = Constant.GL_LINE_STRIP;
                    rb0.setChecked(false);
                    rb1.setChecked(false);
                    rb3.setChecked(false);
                }
            }
        });

        // GL_LINE_LOOP RadioButton添加监听器
        rb3.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView,
                                         boolean isChecked) {
                if (isChecked) {
                    Constant.CURR_DRAW_MODE = Constant.GL_LINE_LOOP;
                    rb0.setChecked(false);
                    rb1.setChecked(false);
                    rb2.setChecked(false);
                }
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
