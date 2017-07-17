package top.lc951.sample12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sample12_1(View view){
        Sample12_1_Activity.actionActivity(this);

    }
    public void sample12_2(View view){
        Sample12_2_Activity.actionActivity(this);

    }
   public void sample12_3(View view){
        Sample12_3_Activity.actionActivity(this);

    }

}
