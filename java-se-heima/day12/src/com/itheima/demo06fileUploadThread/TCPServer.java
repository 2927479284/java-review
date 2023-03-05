package com.itheima.demo06fileUploadThread;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*
   多线程版本服务器(了解-扩展)
        1.定义一个死循环,轮询监听客户端的请求
        2.有客户端请求服务器,使用accpet方法获取到请求的客户端Socket对象
        3.有一个客户端请求服务器,开启一个新的线程,完成文件上传
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\upload");
        if(!file.exists()){
            file.mkdir();
        }
        ServerSocket server = new ServerSocket(9999);
        System.out.println("-----------服务器已经启动,等待客户端上传文件-----------");

        //1.定义一个死循环,轮询监听客户端的请求
        while (true){
            //2.有客户端请求服务器,使用accpet方法获取到请求的客户端Socket对象
            Socket socket = server.accept();

            //3.有一个客户端请求服务器,开启一个新的线程,完成文件上传
            new Thread(()->{
                try {
                    InputStream is = socket.getInputStream();
                    String fileName = "itheima"+System.currentTimeMillis()+new Random().nextInt(99999)+".jpg";

                    //FileOutputStream fos = new FileOutputStream("d:\\upload\\1.jpg");
                    FileOutputStream fos = new FileOutputStream("d:\\upload\\"+fileName);
                    byte[] bytes = new byte[1024];
                    int len = 0;
                    while ((len = is.read(bytes))!=-1){
                        fos.write(bytes,0,len);
                    }
                    OutputStream os = socket.getOutputStream();
                    os.write("上传成功".getBytes());
                    fos.close();
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

        }

        //服务器不用关闭
        //server.close();
    }
}
