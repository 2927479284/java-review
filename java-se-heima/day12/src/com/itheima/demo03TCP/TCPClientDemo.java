package com.itheima.demo03TCP;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 自写tcp客户端
 */
public class TCPClientDemo {

    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1", 8080);
        OutputStream outputStream = socket.getOutputStream();
        System.out.println("一号客户端准备发送消息");
        outputStream.write("①号客户端向服务器问好".getBytes());
        outputStream.close();
        socket.close();
    }
}
