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
import android.widget.TextView;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Sample2_9ClientActivity extends AppCompatActivity {

    public static void actionActivity(Context context){
        context.startActivity(new Intent(context, Sample2_9ClientActivity.class));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample2_9_client);
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

        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener
                (
                        new View.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                connectServer();
                            }
                        }
                );

    }
    //连接服务器端的方法
    public void connectServer()
    {
        String serverIp="192.168.0.103";
        try
        {
            Socket socket=new Socket(serverIp,8877);
            DataInputStream din=new DataInputStream(socket.getInputStream());
            DataOutputStream dout=new DataOutputStream(socket.getOutputStream());
            EditText et=(EditText)this.findViewById(R.id.et);
            String tempStr=et.getText().toString();
            dout.writeUTF(tempStr);
            TextView tv=(TextView)this.findViewById(R.id.tv);
            tv.setText(din.readUTF());
            din.close();
            dout.close();
            socket.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
