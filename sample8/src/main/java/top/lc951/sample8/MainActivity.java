package top.lc951.sample8;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //设置为横屏模式
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE); setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
    }

    public void sample8_1(View view) {
        Sample8_1_Activity.actionActivity(this);
    }

    public void sample8_2(View view) {
        Sample8_2_Activity.actionActivity(this);
    }

    public void sample8_3(View view) {
        Sample8_3_Activity.actionActivity(this);
    }

    public void sample8_4(View view) {
        Sample8_4_Activity.actionActivity(this);
    }

    public void sample8_5(View view) {
        Sample8_5_Activity.actionActivity(this);
    }

    public void sample8_6(View view) {
        Sample8_6_Activity.actionActivity(this);
    }
    public void sample8_7(View view) {
        Sample8_7_Activity.actionActivity(this);
    }

}
