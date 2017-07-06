package com.example.lichong.opengl_test;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    SoundPool sp; // 声明SoundPool的引用
    HashMap<Integer, Integer> hm; // 声明一个HashMap来存放声音文件
    int currStreamId;// 当前正播放的streamId
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = (TextView) findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());

        initSoundPool(); // 初始化声音池的方法

        Button b1 = (Button) this.findViewById(R.id.Button01); // 获取播放按钮
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playSound(1, 0); // 播放1号声音资源，且播放一次
                // 提示播放即时音效
                Toast.makeText(getBaseContext(), "播放即时音效", Toast.LENGTH_SHORT)
                        .show();
            }
        });
        Button b2 = (Button) this.findViewById(R.id.Button02); // 获取停止按钮
        b2.setOnClickListener // 为停止按钮添加监听器
                (new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sp.stop(currStreamId); // 停止正在播放的某个声音
                        // 提示停止播放
                        Toast.makeText(getBaseContext(), "停止播放即时音效", Toast.LENGTH_SHORT)
                                .show();
                    }
                });


    }

    private void playSound(int sound, int loop) {
        AudioManager am = (AudioManager) this
                .getSystemService(Context.AUDIO_SERVICE);
        // 获取当前音量
        float streamVolumeCurrent = am
                .getStreamVolume(AudioManager.STREAM_MUSIC);

        // 获取系统最大音量
        float streamVolumeMax = am
                .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        // 计算得到播放音量
        float volume = streamVolumeCurrent / streamVolumeMax;
        // 调用SoundPool的play方法来播放声音文件
        currStreamId = sp.play(hm.get(sound), volume, volume, 1, loop, 1.0f);
    }

    private void initSoundPool() {
        sp = new SoundPool(4, AudioManager.STREAM_MUSIC, 0); // 创建SoundPool对象
        hm = new HashMap<>(); // 创建HashMap对象
        hm.put(1, sp.load(this, R.raw.musictest, 1)); // 加载声音文件musictest并且设置为1号声音放入hm中
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
