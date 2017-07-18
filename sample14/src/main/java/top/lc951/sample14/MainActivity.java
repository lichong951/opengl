package top.lc951.sample14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sample14_1(View view){
        Sample14_1_Activity.actionActivity(this);

    }
    public void sample14_2(View view){
        Sample14_2_Activity.actionActivity(this);

    }
    public void sample14_3(View view){
        Sample14_3_Activity.actionActivity(this);

    }

}
