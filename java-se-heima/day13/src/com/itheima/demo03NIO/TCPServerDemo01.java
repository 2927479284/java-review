package com.itheima.demo03NIO;


import java.net.InetSocketAddress;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/**
 *     创建NIO服务器端:同步非阻塞服务器
 *     SelectableChannel configureBlocking(boolean block)
 *         设置服务器的阻塞模式 true:阻塞(默认)  false:非阻塞
 */
public class TCPServerDemo01 {

    public static void main(String[] args) throws Exception{
        ServerSocketChannel open = ServerSocketChannel.open();
        ServerSocketChannel serverSocket = open.bind(new InetSocketAddress(8080));
        //设置当前服务器为非阻塞式
        serverSocket.configureBlocking(false);
        //增加循环判断是否连接成功
        while (true) {
            System.out.println("服务器已经启动成功,等待客户端连接....");
            SocketChannel socket = serverSocket.accept();
            if (socket != null) {
                System.out.println("有客户端连接服务器,循环结束");
                socket.close();
                break;
            }
            System.out.println("暂时没有客户端连接，执行别的代码" );
            Thread.sleep(3000);
        }
        serverSocket.close();

    }
}
