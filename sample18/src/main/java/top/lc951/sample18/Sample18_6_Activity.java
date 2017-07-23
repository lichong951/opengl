package top.lc951.sample18;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;

import top.lc951.sample18._6.Constant_6;
import top.lc951.sample18._6.MySurfaceView_6;
import top.lc951.sample18._6.RotateUtil;

public class Sample18_6_Activity extends AppCompatActivity {
    //SensorManager对象引用
    SensorManager mySensorManager;

    Sensor mySensor;    //传感器类型

    MySurfaceView_6 mySurfaceView;


    public static void actionActivity(Context context) {
        Intent intent = new Intent(context, Sample18_6_Activity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //全屏
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        //设置为屏模式
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        //获得SensorManager对象
        mySensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        //姿态传感器
        mySensor = mySensorManager.getDefaultSensor(Sensor.TYPE_ORIENTATION);


        mySurfaceView = new MySurfaceView_6(this);
        this.setContentView(mySurfaceView);
        //获取焦点
        mySurfaceView.requestFocus();
        //设置为可触控
        mySurfaceView.setFocusableInTouchMode(true);
    }

    private SensorEventListener mySensorListener =
            new SensorEventListener() {//开发实现了SensorEventListener接口的传感器监听器
                @Override
                public void onAccuracyChanged(Sensor sensor, int accuracy) {
                }

                @Override
                public void onSensorChanged(SensorEvent event) {
                    float[] values = event.values;//获取三个轴方向上的值

                    float directionDotXYZ[] = RotateUtil.getDirectionDot
                            (
                                    new double[]{values[0], values[1], values[2]}
                            );
                    //标准化xy位移量
                    double mLength = directionDotXYZ[0] * directionDotXYZ[0] +
                            directionDotXYZ[1] * directionDotXYZ[1];
                    mLength = Math.sqrt(mLength);

                    if (mLength == 0) {
                        return;
                    }
                    if (directionDotXYZ[2] < 0) {
                        Constant_6.SPANX = (float) ((directionDotXYZ[1] / mLength) * 0.08f);
                        Constant_6.SPANZ = (float) ((directionDotXYZ[0] / mLength) * 0.08f);
                    } else {
                        Constant_6.SPANX = (float) ((directionDotXYZ[1] / mLength) * 0.08f);
                        Constant_6.SPANZ = -(float) ((directionDotXYZ[0] / mLength) * 0.08f);
                    }
                }
            };

    @Override
    protected void onResume() {                        //重写onResume方法
        mySensorManager.registerListener(            //注册监听器
                mySensorListener,                    //监听器对象
                mySensor,    //传感器类型
                SensorManager.SENSOR_DELAY_NORMAL        //传感器事件传递的频度
        );

        super.onResume();
    }

    @Override
    protected void onPause() {                                    //重写onPause方法
        mySensorManager.unregisterListener(mySensorListener);    //取消注册监听器
        super.onPause();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent e) {
        switch (keyCode) {
            case 4:
                System.exit(0);
                break;
        }
        return true;
    }
}
