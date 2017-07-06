package com.example.sample2;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Sample2_4Activity extends AppCompatActivity {
    SQLiteDatabase sld; // 声明SQLiteDatabase引用

    public static void actionActivity(Context context){
        context.startActivity(new Intent(context, Sample2_4Activity.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample2_4);
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
        Button b = (Button) this.findViewById(R.id.Button01); // 获取打开/创建数据库按钮
        b.setOnClickListener( // 为打开/创建按钮添加监听器
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        createOrOpenDatabase(); // 调用方法打开或创建数据库
                    }
                });

        b = (Button) this.findViewById(R.id.Button02);// 获取关闭数据库按钮
        b.setOnClickListener( // 为关闭按钮添加监听器
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        closeDatabase(); // 调用方法关闭数据库
                    }
                });

        b = (Button) this.findViewById(R.id.Button03); // 获取添加记录按钮
        b.setOnClickListener( // 为添加按钮添加监听器
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        insert(); // 调用方法插入记录
                    }
                });
        b = (Button) this.findViewById(R.id.Button04);// 获取删除记录按钮
        b.setOnClickListener( // 为删除按钮添加监听器
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        delete(); // 调用方法删除记录
                    }
                });

        b = (Button) this.findViewById(R.id.Button05); // 获取查询记录按钮
        b.setOnClickListener( // 为查询按钮添加监听器
                new OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        query(); // 调用方法查询记录
                    }
                });
    }

    private void query() {
        try {// 生成查询记录的sql语句
            String sql = "select * from student where sage>?";
            Cursor cur = sld.rawQuery(sql, new String[] { "20" }); // 获取Cursor对象引用
            while (cur.moveToNext()) {// 若存在记录
                String sno = cur.getString(0); // 获取第一列信息
                String sname = cur.getString(1); // 获取第二列信息
                int sage = cur.getInt(2); // 获取第三列信息
                String sclass = cur.getString(3); // 获取第四列信息
                Toast.makeText(
                        getBaseContext(),
                        "查询到的记录为：'" + sno + "'\t'" + sname
                                + "'\t\t'" + sage+ "'\t'" + sclass + "'",
                        Toast.LENGTH_LONG).show();
            }
            cur.close(); // 关闭Cursor
        } catch (Exception e) {
            e.printStackTrace();
        }}


    private void delete() {
        try  {// 生成删除所有记录的sql语句
            String sql = "delete from student;";
            sld.execSQL(sql); // 执行sql语句
            Toast.makeText(getBaseContext(), "成功删除所有记录。",
                    Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void insert() {
        try  {// 生成插入记录的sql语句
            String sql = "insert into student values" +
                    "('001','Android',22,'283')";
            sld.execSQL(sql); // 执行sql语句
            Toast.makeText(getBaseContext(), "成功插入一条记录。",
                    Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void closeDatabase() {
        try {
            sld.close(); // 关闭数据库
            Toast.makeText(getBaseContext(), "成功关闭数据库。",
                    Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void createOrOpenDatabase() {
        try {
            //TODO 数据库文件目标存放路径为系统默认位置com.example.sample2是你的包名
            sld = SQLiteDatabase.openDatabase(
                    "/data/data/com.example.sample2/mydb", // 数据库所在路径
                    null, // 游标工厂，默认为null
                    SQLiteDatabase.OPEN_READWRITE |
                            SQLiteDatabase.CREATE_IF_NECESSARY // 模式为读写，若不存在则创建
            );
            // 生成创建数据库的sql语句
            String sql = "create table if not exists student" +
                    "(sno char(5),stuname varchar(20)," +
                    "sage integer,sclass char(5))";
            sld.execSQL(sql); // 执行sql语句
            Toast.makeText(getBaseContext(), "成功创建数据库。",
                    Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
