package com.itheima.demo06Selector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
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

            //Selector的selectedKeys()方法:表示当前客户端已连接的通道的集合
            Set<SelectionKey> selectionKeys = selector.selectedKeys();
            System.out.println("已连接的通道的集合数量为:"+selectionKeys.size());

            //遍历selectionKeys集合,获取每一个SelectionKey对象
            Iterator<SelectionKey> it = selectionKeys.iterator();
            while (it.hasNext()){
                SelectionKey selectionKey = it.next();
                //取出SelectionKey中存储的ServerSocketChannel服务器对象
                ServerSocketChannel channel = (ServerSocketChannel)selectionKey.channel();
                //使用ServerSocketChannel对象,处理监听到的ACCEPT事件(获取请求服务器的客户端SocketChannel对象)
                SocketChannel socketChannel = channel.accept();
                //使用SocketChannel对象中的方法read,读取客户端发送的数据
                ByteBuffer buffer = ByteBuffer.allocate(1024);
                int len = socketChannel.read(buffer);
                System.out.println("服务器读取到客户端发送的数据:"+new String(buffer.array(),0,len));

                //处理完集合中对应的SelectionKey,就需要把已经处理完的SelectionKey从集合中移除
                it.remove();//使用迭代器删除集合中元素的方法,不会抛出迭代器的并发修改异常
            }

            System.out.println("本次监听之后,添加一个睡眠,睡眠2秒钟,再次获取客户端的请求...");
            Thread.sleep(2000);
        }
    }
}
