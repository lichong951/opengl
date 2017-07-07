package com.example.sample2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by lichong on 2017/7/7.
 * 需要在java 命令下运行，单独编译后运行 【未亲测】
 */

public class Sample2_9_Server {
    static ServerSocket sSocket;
    public static void main(String[] args)
    {
        try
        {
            sSocket=new ServerSocket(8877);
            System.out.println("监听8877接口......");
            while(true)
            {
                Socket socket=sSocket.accept();
                DataInputStream diStream=new DataInputStream(socket.getInputStream());
                DataOutputStream dotStream=new DataOutputStream(socket.getOutputStream());
                System.out.println("客户端信息："+diStream.readUTF());
                dotStream.writeUTF("成功连接服务器端");
                diStream.close();
                dotStream.close();
                socket.close();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
