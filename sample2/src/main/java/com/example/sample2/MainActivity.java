package com.example.sample2;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.sample2.permissions.PermissionsUtils;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PermissionsUtils.verifyStoragePermissions(this);
    }

    public void sample2_2(View view) {
        Sample2_2Activity.actionActivity(this);
    }

    public void sample2_3(View view) {
        Sample2_3Activity.actionActivity(this);
    }

    public void sample2_4(View view) {
        Sample2_4Activity.actionActivity(this);
    }

}
