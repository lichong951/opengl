package top.lc951.sample16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sample16_1(View view){
        Sample16_1_Activity.actionActivity(this);
    }
    public void sample16_2(View view){
        Sample16_2_Activity.actionActivity(this);
    }
    public void sample16_3(View view){
        Sample16_3_Activity.actionActivity(this);
    }
    public void sample16_4(View view){
        Sample16_4_Activity.actionActivity(this);
    }
    public void sample16_5(View view){
        Sample16_5_Activity.actionActivity(this);
    }
    public void sample16_6(View view){
        Sample16_6_Activity.actionActivity(this);
    }

}
