package top.lc951.sample8;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sample8_1(View view){
        Sample8_1_Activity.actionActivity(this);
    }
    public void sample8_2(View view){
        Sample8_2_Activity.actionActivity(this);
    }
    public void sample8_3(View view){
        Sample8_3_Activity.actionActivity(this);
    }
    public void sample8_4(View view){
        Sample8_4_Activity.actionActivity(this);
    }

}
