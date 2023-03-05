package com.itheima.demo05setFileName;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/*
    自定义一个文件的名称
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\upload");
        if(!file.exists()){
            file.mkdir();
        }
        ServerSocket server = new ServerSocket(9999);
        System.out.println("-----------服务器已经启动,等待客户端上传文件-----------");
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();

        /*
            文件上传自定义文件名称命名规则(了解-扩展)
            目的:让文件的名称不重复,防止文件被覆盖
            规则:域名+毫秒值+随机数
         */
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
        server.close();
    }
}
