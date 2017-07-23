package top.lc951.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sample18_1(View view){
        Sample18_1_Activity.actionActivity(this);
    }
     public void sample18_2(View view){
        Sample18_2_Activity.actionActivity(this);
    }
    public void sample18_3(View view){
        Sample18_3_Activity.actionActivity(this);
    }


}
