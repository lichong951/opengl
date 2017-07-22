package top.lc951.sample11;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import top.lc951.sample11._9.MySurfaceView;

public class Sample11_9_Activity extends AppCompatActivity {
    MySurfaceView mview;
    public static void actionActivity(Context context){
        context.startActivity(new Intent(context, Sample11_9_Activity.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mview = new MySurfaceView(this);
        mview.requestFocus();//获取焦点
        mview.setFocusableInTouchMode(true);//设置为可触控
        setContentView(mview);
    }
    @Override
    protected void onResume() {
        super.onResume();
        mview.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mview.onPause();
    }
}
