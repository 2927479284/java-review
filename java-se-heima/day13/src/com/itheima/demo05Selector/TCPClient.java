package com.itheima.demo05Selector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

/*
    创建3个线程,模拟三个人,每个线程访问服务器的一个端口号
 */
public class TCPClient {
    public static void main(String[] args) {
        new Thread(()->{
            //使用死循环轮询连接服务器
            while (true){
                try {
                    //创建客户端SocketChannel对象
                    SocketChannel socket= SocketChannel.open();
                    //使用connect方法,根据服务器的ip地址和端口号连接服务器
                    boolean b1 = socket.connect(new InetSocketAddress("localhost", 7777));
                    System.out.println(b1);
                    System.out.println("客户端连接服务器7777端口成功,结束轮询...");
                    socket.close();
                    break;
                } catch (IOException e) {
                    System.out.println("客户端连接7777端口失败,睡眠2秒钟,继续轮询连接...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(()->{
            //使用死循环轮询连接服务器
            while (true){
                try {
                    //创建客户端SocketChannel对象
                    SocketChannel socket= SocketChannel.open();
                    //使用connect方法,根据服务器的ip地址和端口号连接服务器
                    boolean b1 = socket.connect(new InetSocketAddress("localhost", 8888));
                    System.out.println(b1);
                    System.out.println("客户端连接服务器8888端口成功,结束轮询...");
                    socket.close();
                    break;
                } catch (IOException e) {
                    System.out.println("客户端连接8888端口失败,睡眠2秒钟,继续轮询连接...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(()->{
            //使用死循环轮询连接服务器
            while (true){
                try {
                    //创建客户端SocketChannel对象
                    SocketChannel socket= SocketChannel.open();
                    //使用connect方法,根据服务器的ip地址和端口号连接服务器
                    boolean b1 = socket.connect(new InetSocketAddress("localhost", 9999));
                    System.out.println(b1);
                    System.out.println("客户端连接服务器9999端口成功,结束轮询...");
                    socket.close();
                    break;
                } catch (IOException e) {
                    System.out.println("客户端连接9999端口失败,睡眠2秒钟,继续轮询连接...");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
