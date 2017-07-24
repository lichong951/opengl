package top.lc951.bnst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import top.lc951.bnst.st.d2.MyActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void start(View view){
        MyActivity.actionActivity(this);
    }
}
