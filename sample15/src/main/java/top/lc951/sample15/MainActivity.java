package top.lc951.sample15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sample15_1(View view){

        Sample15_1_Activity.actionActivity(this);
    }
   public void sample15_2(View view){

        Sample15_2_Activity.actionActivity(this);
    }
   public void sample15_3(View view){

        Sample15_3_Activity.actionActivity(this);
    }
   public void sample15_4(View view){

        Sample15_4_Activity.actionActivity(this);
    }


}
