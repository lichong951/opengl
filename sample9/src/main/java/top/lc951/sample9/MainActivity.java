package top.lc951.sample9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sample9_1(View view){
        Sample9_1_Activity.actionActivity(this);

    }
    public void sample9_2(View view){
        Sample9_2_Activity.actionActivity(this);

    }
    public void sample9_3(View view){
        Sample9_3_Activity.actionActivity(this);

    }
    public void sample9_4(View view){
        Sample9_4_Activity.actionActivity(this);

    }

}
