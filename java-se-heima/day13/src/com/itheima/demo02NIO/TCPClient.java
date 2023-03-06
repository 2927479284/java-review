package com.itheima.demo02NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

/*
    创建NIO的客户端
        1.使用SocketChannel类中的方法open,获取客户端SocketChannel对象
        2.使用SocketChannel对象中的方法connect,根据服务器的ip地址和端口号连接服务器(3次握手)
        3.释放资源
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //1.使用SocketChannel类中的方法open,获取客户端SocketChannel对象
        SocketChannel socket = SocketChannel.open();
        //2.使用SocketChannel对象中的方法connect,根据服务器的ip地址和端口号连接服务器(3次握手)
        boolean b = socket.connect(new InetSocketAddress("localhost", 8888));
        System.out.println(b);//true:连接服务器成功
        //3.释放资源
        socket.close();
    }
}
