package com.example.sample2;

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

import com.example.sample2.bullet.MySurfaceView;

public class Sample2_8Activity extends AppCompatActivity {

    public static void actionActivity(Context context){
        context.startActivity(new Intent(context, Sample2_8Activity.class));
    }

    MySurfaceView gameView;//游戏界面
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //全屏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN ,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//设置为横屏
        gameView = new MySurfaceView(this);//创建游戏界面对象


        setContentView(gameView);

    }

}
