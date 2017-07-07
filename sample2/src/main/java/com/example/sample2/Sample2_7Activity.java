package com.example.sample2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class Sample2_7Activity extends AppCompatActivity {
    public static void actionActivity(Context context) {
        context.startActivity(new Intent(context, Sample2_7Activity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample2_7);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        bindViews();
    }

    private void bindViews() {
        Button ok = (Button) this.findViewById(R.id.Button01);    //获取打开Button
        ok.setOnClickListener                                //为打开按钮添加监听器
                (new View.OnClickListener() {
                    public void onClick(View v) {
                        EditText et1 = (EditText) findViewById(R.id.EditText01);
                        //调用loadText方法获取对应文件名的文件
                        String nr = loadText(et1.getText().toString().trim());
                        EditText et2 = (EditText) findViewById(R.id.EditText02);
                        //设置显示框内容
                        et2.setText(nr);
                    }
                });
    }

    public String loadText(String name) {                       //加载assets文件方法
        String nr = null;                                        //内容字符串
        try {    //打开对应名称文件的输入流
            InputStream is = this.getResources().getAssets().open(name);
            int ch = 0;
            //创建字节数组输出流
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            while ((ch = is.read()) != -1) {
                baos.write(ch);
            }                        //读取文件
            byte[] buff = baos.toByteArray();                    //转化为字节数组
            baos.close();                                    //关闭输入输出流
            is.close();                                        //关闭输入输出流
            nr = new String(buff, "utf-8");                    //转码生产新字符串
            nr = nr.replaceAll("\\r\\n", "\n");                //替换换行符等空白字符
        } catch (Exception e) {    //没有找到对应文件，进行提示
            Toast.makeText(getBaseContext(), "对不起，没有找到指定文件。", Toast.LENGTH_LONG).show();
        }
        return nr;                                            //返回内容字符串
    }


}
