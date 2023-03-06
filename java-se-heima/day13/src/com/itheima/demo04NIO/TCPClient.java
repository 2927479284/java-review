package com.itheima.demo04NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/*
    创建NIO的客户端
    客户端连接服务器成功:给服务器发送数据,读取服务器发送的数据
    SocketChannel类中的成员方法
        int write(ByteBuffer src)  给服务器发送数据
        int read(ByteBuffer dst)  读取服务器发送的数据
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
                boolean b = socket.connect(new InetSocketAddress("localhost", 8888));
                System.out.println(b);//true:连接服务器成功
                System.out.println("客户端连接服务器成功,给服务器发送数据...");

                System.out.println("①客户端给服务器发送:你好服务器");
                //ByteBuffer buffer = ByteBuffer.wrap("你好服务器".getBytes());
                socket.write(ByteBuffer.wrap("你好服务器".getBytes()));

                ByteBuffer buffer = ByteBuffer.allocate(1024);
                int len = socket.read(buffer);
                String msg = new String(buffer.array(),0,len);
                System.out.println("②客户端读取服务器发送的数据为:"+msg);
                System.out.println("客户端读写数据完毕,结束轮询...");
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
