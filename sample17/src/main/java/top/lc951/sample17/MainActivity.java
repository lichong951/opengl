package top.lc951.sample17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sample17_1(View view){
        Sample17_1_Activity.actionActivity(this);
    }
    public void sample17_2(View view){
        Sample17_2_Activity.actionActivity(this);
    }
    public void sample17_3(View view){
        Sample17_3_Activity.actionActivity(this);
    }
    public void sample17_4(View view){
        Sample17_4_Activity.actionActivity(this);
    }
   public void sample17_5(View view){
        Sample17_5_Activity.actionActivity(this);
    }

}
