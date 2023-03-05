package com.itheima.demo04fileUpload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 上传服务
 */
public class TCPServerFileTest
{
    public static void main(String[] args) throws Exception{
/*        File file = new File("F:\\Snipaste_2023-03-05_20-56-51.png");
        if (!file.exists()){
            file.c
        }*/
        FileOutputStream fileOutputStream = new FileOutputStream("F:\\1111.png");
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();//读取图片
        OutputStream outputStream = socket.getOutputStream();//发送消息
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = inputStream.read())!=-1){
            fileOutputStream.write(bytes,0,len);
        }
        outputStream.write("收到图片，成功上传到F盘".getBytes());
        fileOutputStream.close();
        inputStream.close();
        outputStream.close();
        socket.close();
    }
}
