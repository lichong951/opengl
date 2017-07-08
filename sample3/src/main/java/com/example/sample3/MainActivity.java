package com.example.sample3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sample3_1(View view) {
        Sample3_1_Activity.actionActivity(this);

    }
    public void sample3_2(View view) {
        Sample3_2_Activity.actionActivity(this);

    }

}
