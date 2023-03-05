package com.itheima.demo04fileUpload;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 上传客户端
 */
public class TCPClientFileTest {
    public static void main(String[] args) throws Exception{
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\xiaoyong\\Desktop\\1111.png");
        Socket socket = new Socket("127.0.0.1", 8080);
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fileInputStream.read(bytes)) !=-1) {
            outputStream.write(bytes,0,len);
        }
        socket.shutdownOutput();
        while ((len = inputStream.read(bytes)) !=-1) {
            System.out.println(new String(bytes,0,len));
        }
        fileInputStream.close();
        socket.close();
        outputStream.close();
        inputStream.close();



    }
}
