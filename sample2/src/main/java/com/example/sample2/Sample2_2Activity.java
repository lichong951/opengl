package com.example.sample2;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

public class Sample2_2Activity extends AppCompatActivity {
    MediaPlayer mp; // 声明MediaPlayer的引用
    AudioManager am; // 声明AudioManager的引用\
    private int maxVolume; // 最大音量值
    private int currVolume; // 当前音量值
    private int stepVolume; // 每次调整的音量幅度

    public static void actionActivity(Context context) {
        context.startActivity(new Intent(context, Sample2_2Activity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample2_2);
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

        mp = new MediaPlayer(); // 创建MediaPlayer实例对象
        try {
            //把工程OpenGL——Test／mediaFiles／gsls.map3拷贝到android设备/sdcard目录下
            mp.setDataSource("/sdcard/gsls.mp3"); // 为MediaPlayer设置要播放文件资源
            mp.prepare(); // MediaPlayer进行缓冲准备
        } catch (Exception e) {
            e.printStackTrace();
        }
        am = (AudioManager) this.getSystemService(Context.AUDIO_SERVICE); // 获取AudioManager对象引用
// 获取最大音乐音量
        maxVolume = am.getStreamMaxVolume(AudioManager.STREAM_MUSIC);

// 每次调整的音量大概为最大音量的1/6
        stepVolume = maxVolume / 6;

        Button bstart = (Button) this.findViewById(R.id.Button01); // 获取开始按钮
        bstart.setOnClickListener // 为开始按钮添加监听器
                (new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.start(); // 调用MediaPlayer的start方法来播放音乐
                        Toast.makeText(getBaseContext(), "开始播放'高山流水曲'",
                                Toast.LENGTH_LONG).show();
                    }
                });
        Button bpause = (Button) this.findViewById(R.id.Button02); // 获取暂停按钮
        bpause.setOnClickListener // 为暂停按钮添加监听器
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.pause(); // 调用MediaPlayer的pause方法暂停播放音乐
                        Toast.makeText(getBaseContext(), "暂停播放'高山流水曲'",
                                Toast.LENGTH_LONG).show();
                    }
                });

        Button bstop = (Button) this.findViewById(R.id.Button03); // 获取停止按钮
        bstop.setOnClickListener // 为停止按钮添加监听器
                (new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp.stop(); // 调用MediaPlayer的stop方法停止播放音乐
                        try {
                            mp.prepare();//进入准备状态
                        } catch (IllegalStateException e) {//捕获异常
                            e.printStackTrace();
                        } catch (IOException e) {//捕获异常
                            e.printStackTrace();
                        }
                        Toast.makeText(getBaseContext(), "停止播放'高山流水曲'",
                                Toast.LENGTH_LONG).show();
                    }
                });
        Button bUp = (Button) this.findViewById(R.id.Button04); // 获取增大音量按钮
        bUp.setOnClickListener // 为增大音量按钮添加监听器
                (new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // 获取当前音量
                        currVolume = am.getStreamVolume(AudioManager.STREAM_MUSIC);
                        //增加音量，但不超过最大音量值
                        int tmpVolume = currVolume + stepVolume; //临时音量
                        currVolume = tmpVolume < maxVolume ? tmpVolume:maxVolume;
                        am.setStreamVolume(AudioManager.STREAM_MUSIC, currVolume,
                                AudioManager.FLAG_PLAY_SOUND);
                        Toast.makeText(getBaseContext(), "增大音量",
                                Toast.LENGTH_SHORT).show();
                    }
                });

        Button bDown = (Button) this.findViewById(R.id.Button05); // 获取减小音量按钮
        bDown.setOnClickListener // 为减小音量按钮添加监听器
                (new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // 获取当前音量
                        currVolume = am.getStreamVolume(AudioManager.STREAM_MUSIC);
                        //减小音量，但不小于0
                        int tmpVolume = currVolume - stepVolume; //临时音量
                        currVolume = tmpVolume > 0 ? tmpVolume:0;
                        am.setStreamVolume(AudioManager.STREAM_MUSIC, currVolume,
                                AudioManager.FLAG_PLAY_SOUND);
                        Toast.makeText(getBaseContext(), "减小音量",
                                Toast.LENGTH_SHORT).show();
                    }
                });

    }

}
