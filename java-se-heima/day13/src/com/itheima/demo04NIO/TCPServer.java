package com.itheima.demo04NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/*
    创建NIO服务器端:
    客户端连接服务器成功:读取客户端发送的数据,给客户端发送数据
    SocketChannel类中的成员方法
        int read(ByteBuffer dst)  读取客户端发送的数据
        int write(ByteBuffer src)  给客户端发送数据
 */
public class TCPServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        //1.使用ServerSocketChannel类中的方法open,获取ServerSocketChannel对象
        ServerSocketChannel server = ServerSocketChannel.open();
        //2.使用ServerSocketChannel对象中的方法bind,给服务器绑定指定的端口号
        server.bind(new InetSocketAddress(8888));

        //设置服务器的阻塞模式
        server.configureBlocking(false);

        //增加一个死循环:轮询监听客户端的请求
        while (true){
            //3.使用ServerSocketChannel对象中的方法accpet,监听并获取客户端SocketChannel对象
            System.out.println("服务器已经启动,等待客户端连接....");
            SocketChannel socket = server.accept();//accpet方法(非阻塞模式,不在等待客户端)
            //增加一个判断,判断socket对象的值是否为null,不是null说明有客户端连接服务器
            if(socket!=null){
                System.out.println("有客户端连接服务器,读取客户端发送的数据...");
                ByteBuffer buffer = ByteBuffer.allocate(1024);
                int len = socket.read(buffer);
                String msg = new String(buffer.array(),0,len);
                System.out.println("②服务器读取客户端发送的数据为:"+msg);

                System.out.println("③服务器给客户端发送:收到,谢谢");
                socket.write(ByteBuffer.wrap("收到,谢谢".getBytes()));
                System.out.println("服务器读写数据完,结束轮询...");
                //4.释放资源
                socket.close();
                break;
            }

            //没有客户端连接服务器:干点其他的事情(睡眠2秒钟),再继续轮询,监听获取客户端对象
            System.out.println("没有客户端连接服务器:干点其他的事情(睡眠2秒钟),再继续轮询,监听获取客户端对象...");
            Thread.sleep(2000);
        }

        server.close();
    }
}
