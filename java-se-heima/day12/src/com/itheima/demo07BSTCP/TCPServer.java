package com.itheima.demo07BSTCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    BS版本的TCP案例
    B:浏览器(作为客户端)
    S:服务器
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建一个服务器ServerSocket对象,和系统要指定的端口号
        ServerSocket server = new ServerSocket(8080);
        //使用ServerSocket对象中的方法accept,监听并获取客户端Socket对象
        Socket socket = server.accept();
        //使用Socket对象中的方法getInputStream对象,获取网络字节输入流InputStream对象
        InputStream is = socket.getInputStream();
        //使用网络字节输入流InputStream对象中的方法read,读取客户端发送的信息
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        //释放资源
        socket.close();
        server.close();
    }
}
