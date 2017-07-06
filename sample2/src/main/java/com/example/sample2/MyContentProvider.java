package com.example.sample2;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
/**
 *
 * 如出现 异常：android.database.sqlite.SQLiteCantOpenDatabaseException: unknown error (code 1294): Could not open database
 * 检查数据库文件目标存放路径为系统默认位置com.example.sample2是你的包名
 * 例如：包名：com.example.sample2
 * 则：com.example.sample2.provider.student
 *      /data/data/com.example.sample2/mydb
 * */
public class MyContentProvider extends ContentProvider {

    private static final UriMatcher um; // 声明Uri匹配引用
    static {
        um = new UriMatcher(UriMatcher.NO_MATCH); // 创建UriMatcher
        //TODO 数据库文件目标存放路径为系统默认位置com.example.sample2是你的包名
        um.addURI("com.example.sample2.provider.student", "stu", 1); // 设置匹配字符串
    }
    SQLiteDatabase sld; // 声明SQLiteDatabase引用

    public MyContentProvider() {
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        return null;
    }

    @Override
    public boolean onCreate() {
        sld = SQLiteDatabase.openDatabase(
                //TODO 数据库文件目标存放路径为系统默认位置com.example.sample2是你的包名
                "/data/data/com.example.sample2/mydb", // 数据库所在路径
                null, // 游标工厂，默认为null
                SQLiteDatabase.OPEN_READWRITE|
                        SQLiteDatabase.CREATE_IF_NECESSARY // 读写、若不存在则创建
        );
        return false;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection,
                        String[] selectionArgs, String sortOrder) {
        switch (um.match(uri)) {// 若匹配成功
            case 1: // 执行操作，获取Cursor对象引用
                Cursor cur = sld.query("student", projection, selection,
                        selectionArgs, null, null, sortOrder);
                return cur; // 返回Cursor对象引用
        }
        return null;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection,
                      String[] selectionArgs) {
        return 0;
    }
}
