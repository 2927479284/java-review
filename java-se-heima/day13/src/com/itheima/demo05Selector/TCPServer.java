package com.itheima.demo05Selector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.util.Set;

/*
    选择器Selector_服务器端实现多路注册
    实现步骤:
        1.创建3个ServerSocketChannel服务器对象
        2.为3个ServerSocketChannel对象绑定不同的端口号
        3.设置3个ServerSocketChannel对象为非阻塞模式(想把3个服务器注册到同一个选择器上,服务器必须为非阻塞模式)
        4.创建Selector选择器对象
        5.使用3个ServerSocketChannel对象中的方法register,把3个服务器注册到同一个选择器上
 */
public class TCPServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        //1.创建3个ServerSocketChannel服务器对象
        ServerSocketChannel channel01 = ServerSocketChannel.open();
        ServerSocketChannel channel02 = ServerSocketChannel.open();
        ServerSocketChannel channel03 = ServerSocketChannel.open();
        //2.为3个ServerSocketChannel对象绑定不同的端口号
        channel01.bind(new InetSocketAddress(7777));
        channel02.bind(new InetSocketAddress(8888));
        channel03.bind(new InetSocketAddress(9999));
        //3.设置3个ServerSocketChannel对象为非阻塞模式
        channel01.configureBlocking(false);
        channel02.configureBlocking(false);
        channel03.configureBlocking(false);
        //4.创建Selector选择器对象
        Selector selector = Selector.open();
        //5.使用3个ServerSocketChannel对象中的方法register,把3个服务器注册到同一个选择器上
        channel01.register(selector, SelectionKey.OP_ACCEPT);
        channel02.register(selector, SelectionKey.OP_ACCEPT);
        channel03.register(selector, SelectionKey.OP_ACCEPT);

        //Selector的keys()方法:表示已注册通道的集合
        Set<SelectionKey> keys = selector.keys();
        System.out.println("已注册通道的集合数量为:"+keys.size());

        //增加一个死循环,轮询监听客户端的连接
        while (true){
            //Selector的select()方法:表示(本次)有几个客户端连接服务器,如果没有客户端连接服务器,此方法会阻塞
            int select = selector.select();
            System.out.println("本次连接服务器的客户端数量:"+select);

            //Selector的selectedKeys()方法:示当前客户端已连接的通道的集合
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            System.out.println("已连接的通道的集合数量为:"+selectionKeys.size());

            System.out.println("本次监听之后,添加一个睡眠,睡眠2秒钟,再次获取客户端的请求...");
            Thread.sleep(2000);
        }
    }
}
