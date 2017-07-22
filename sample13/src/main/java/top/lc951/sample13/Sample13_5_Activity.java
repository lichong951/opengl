package top.lc951.sample13;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import top.lc951.sample13._5.GameSurfaceView_5;

public class Sample13_5_Activity extends AppCompatActivity {
    GameSurfaceView_5 gameView;
    public static void actionActivity(Context context){
        context.startActivity(new Intent(context, Sample13_5_Activity.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gameView = new GameSurfaceView_5(this);
        setContentView(gameView);
        gameView.requestFocus();//获取焦点
        gameView.setFocusableInTouchMode(true);//设置为可触控
    }
    @Override
    protected void onResume() {
        super.onResume();
        gameView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        gameView.onPause();
    }
}
