package com.example.sample2_4from_9server;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Sample2_4FromActivity extends AppCompatActivity {
    ContentResolver cr;

    public static void actionActivity(Context context) {
        context.startActivity(new Intent(context, Sample2_4FromActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample2_4_from);
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

        cr = this.getContentResolver();
//初始化查询按钮
        Button b = (Button) this.findViewById(R.id.Button01);

        b.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String stuname = "Android";
                        Cursor cur = cr.query(
                                Uri.parse("content://com.example.sample2.provider.student/stu"),
                                new String[]{"sno", "stuname", "sage", "sclass"},
                                "stuname=?",
                                new String[]{stuname},
                                "sage ASC"
                        );
                        //如果Cursor为null 检查content：／／xxxxxx.xxx.xxxxx/stu是否正确
                        while (cur.moveToNext()) {
                            String sno = cur.getString(0);
                            String sname = cur.getString(1);
                            int sage = cur.getInt(2);
                            String sclass = cur.getString(3);
                            appendMessage(sno + "\t" + sname + "\t\t" + sage + "\t" + sclass);
                        }
                        cur.close();
                    }
                });

    }

    public void appendMessage(String msg) {    //向文本区中添加文本
        EditText et = (EditText) this.findViewById(R.id.EditText02);
        et.append(msg + "\n");
    }
}
