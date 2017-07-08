package top.lc951.sample5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sample5_1(View view) {
        Sample5_1_Activity.actionActivity(this);

    }
    public void sample5_2(View view) {
        Sample5_2_Activity.actionActivity(this);

    }
public void sample5_3(View view) {
        Sample5_3_Activity.actionActivity(this);

    }


}
