package top.lc951.sample6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sample6_1(View view) {
        Sample6_1_Activity.actionActivity(this);
    }
   public void sample6_2(View view) {
        Sample6_2_Activity.actionActivity(this);
    }
   public void sample6_3(View view) {
        Sample6_3_Activity.actionActivity(this);
    }
   public void sample6_4(View view) {
        Sample6_4_Activity.actionActivity(this);
    }
   public void sample6_5(View view) {
        Sample6_5_Activity.actionActivity(this);
    }


}
