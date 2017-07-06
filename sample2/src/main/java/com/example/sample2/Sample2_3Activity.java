package com.example.sample2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import java.util.Date;

public class Sample2_3Activity extends AppCompatActivity {

    public static void actionActivity(Context context){
        context.startActivity(new Intent(context, Sample2_3Activity.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample2_3);
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

        //获取SharedPreferences引用，存储名称为bn.xml，读写模式为私有
        SharedPreferences sp=this.getSharedPreferences("bn", Context.MODE_PRIVATE);
        String lastLoginTime=sp.getString("time", null);//获取键为“time”的值
        if(lastLoginTime==null)			//若值为空，则为第一次登录本程序
        {  	lastLoginTime="用户您好，欢迎您第一次光临本软件。";    }
        else							//不为空，则修改字符串为上次登录时间
        {  	lastLoginTime="用户您好，您上次进入时间为:"+lastLoginTime;    }
        SharedPreferences.Editor editor=sp.edit();	//修改Preferences文件
        editor.putString("time", new Date().toLocaleString());	//修改键为“time”的值为当前时间
        editor.commit();	//提交修改
        TextView tv=(TextView)this.findViewById(R.id.TextView01);	//获取用来显示的TextView
        tv.setText(lastLoginTime);	//设置显示的字符串
    }

}
