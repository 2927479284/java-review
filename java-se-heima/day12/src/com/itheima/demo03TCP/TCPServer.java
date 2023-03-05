package com.itheima.demo03TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    创建TCP通信的服务器端
    作用:接收客户端的请求,和客户端经过3次握手建立连接通路;读取客户端发送的数据,给客户端发送数据
    表示服务器的类:
        java.net.ServerSocket:此类实现服务器套接字。
    构造方法:
        ServerSocket(int port) 创建绑定到特定端口的服务器套接字。
    成员方法:
        Socket accept() 侦听并接受到此套接字的连接。
        服务器调用accpet方法,就会处于监听状态,有客户端连接服务器,获取到客户端Socket对象
    服务器实现步骤(重点)
        1.创建服务器ServerSocket对象,构造方法绑定指定的端口号
        2.使用ServerSocket对象中的方法accpet,监听并获取客户端Socket对象
        3.使用Socket对象中的方法getInputStream,获取网络字节输入流InputStream
        4.使用网络字节输入流InputStream中的方法read,读取客户端发送的数据
        5.使用Socket对象中的方法getOutputStream,获取网络字节输出流OutputStream
        6.使用网络字节输出流OutputStream中的方法write,给客户端发送数据
        7.释放资源(Socket对象,ServerSocket对象)
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1.创建服务器ServerSocket对象,构造方法绑定指定的端口号
        ServerSocket server = new ServerSocket(8888);
        //2.使用ServerSocket对象中的方法accpet,监听并获取客户端Socket对象
        System.out.println("---------------------服务器已经启动,等待客户端连接----------------------------");
        Socket socket = server.accept();
        //3.使用Socket对象中的方法getInputStream,获取网络字节输入流InputStream
        InputStream is = socket.getInputStream();
        //4.使用网络字节输入流InputStream中的方法read,读取客户端发送的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println("②服务器读取客户端发送的数据:"+new String(bytes,0,len));
        //5.使用Socket对象中的方法getOutputStream,获取网络字节输出流OutputStream
        OutputStream os = socket.getOutputStream();
        //6.使用网络字节输出流OutputStream中的方法write,给客户端发送数据
        System.out.println("③服务器给客户端发送数据:收到,谢谢");
        os.write("收到,谢谢".getBytes());
        //7.释放资源(Socket对象,ServerSocket对象)
        socket.close();
        server.close();
    }
}
