package com.example.sample3;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.sample3.triangle.MyTDView;

public class Sample3_1_Activity extends AppCompatActivity {
    MyTDView mview;

    public static void actionActivity(Context context){
        context.startActivity(new Intent(context, Sample3_1_Activity.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置为竖屏模式
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        mview=new MyTDView(this);
        mview.requestFocus();
        mview.setFocusableInTouchMode(true);
        setContentView(mview);

    }
    public void onResume()
    {
        super.onResume();
        mview.onResume();
    }
    @Override
    public void onPause()
    {
        super.onPause();
        mview.onPause();
    }
}
