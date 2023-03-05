package com.itheima.demo06fileUploadThread;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * 上传服务
 */
public class TCPServerFileTestThread
{
    public static void main(String[] args) throws Exception{
/*        File file = new File("F:\\Snipaste_2023-03-05_20-56-51.png");
        if (!file.exists()){
            file.c
        }*/
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true){
            Socket socket = serverSocket.accept();
            new Thread(()->{
                try {
                    Random random = new Random(10);
                    String fileName = System.currentTimeMillis() +random.nextInt() + ".jpg";
                    FileOutputStream fileOutputStream = new FileOutputStream("F:\\"+fileName);
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
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }).start();

        }

    }
}
