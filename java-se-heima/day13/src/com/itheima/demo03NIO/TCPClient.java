package com.itheima.demo03NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

/*
    创建NIO的客户端
    客户端实现非阻塞模式
    SelectableChannel configureBlocking​(boolean block) 设置客户端的阻塞模式
    true:阻塞(不写默认)
        connect:连接服务器成功,返回true
        connect:连接服务器失败,抛出连接异常
    false:非阻塞
        connect:连接服务器成功,返回false
        connect:连接服务器失败,返回false
 */
public class TCPClient {
    public static void main(String[] args) {
        //创建一个死循环,让客户端轮询连接服务器
        while (true){
            try {
                //1.使用SocketChannel类中的方法open,获取客户端SocketChannel对象
                SocketChannel socket = SocketChannel.open();

                //设置客户端的阻塞模式为非阻塞,没有意义,分不清有没有连接服务器成功
                //socket.configureBlocking(false);

                //2.使用SocketChannel对象中的方法connect,根据服务器的ip地址和端口号连接服务器(3次握手)
                boolean b = socket.connect(new InetSocketAddress("localhost", 8080));
                System.out.println(b);//true:连接服务器成功
                System.out.println("客户端连接服务器成功,结束轮询...");
                //3.释放资源
                socket.close();
                break;
            } catch (IOException e) {
                System.out.println("客户端连接服务器失败,干点其他事情(睡眠2秒钟),再次轮询连接服务器...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}
