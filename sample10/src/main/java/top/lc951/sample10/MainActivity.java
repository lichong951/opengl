package top.lc951.sample10;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sample10_1(View view){
        Sample10_1_Activity.actionActivity(this);
    }
        public void sample10_1a(View view){
        Sample10_1a_Activity.actionActivity(this);
    }
        public void sample10_2(View view){
        Sample10_2_Activity.actionActivity(this);
    }

    public void sample10_3(View veiw ){
        Sample10_3_Activity.actionActivity(this);

    }
    public void sample10_4(View veiw ){
        Sample10_4_Activity.actionActivity(this);

    }

}
