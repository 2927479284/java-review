package com.itheima.demo02NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/*
    创建NIO服务器端:同步阻塞服务器
    实现步骤:
        1.使用ServerSocketChannel类中的方法open,获取ServerSocketChannel对象
        2.使用ServerSocketChannel对象中的方法bind,给服务器绑定指定的端口号
        3.使用ServerSocketChannel对象中的方法accpet,监听并获取客户端SocketChannel对象
        4.释放资源
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1.使用ServerSocketChannel类中的方法open,获取ServerSocketChannel对象
        ServerSocketChannel server = ServerSocketChannel.open();
        //2.使用ServerSocketChannel对象中的方法bind,给服务器绑定指定的端口号
        server.bind(new InetSocketAddress(8888));
        //3.使用ServerSocketChannel对象中的方法accpet,监听并获取客户端SocketChannel对象
        System.out.println("服务器已经启动,等待客户端连接....");
        SocketChannel socket = server.accept();//accpet方法默认是阻塞的方法
        System.out.println("有客户端连接服务器...");
        //4.释放资源
        socket.close();
        server.close();
    }
}
