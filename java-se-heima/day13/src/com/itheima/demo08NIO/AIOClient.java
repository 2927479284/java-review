package com.itheima.demo08NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.concurrent.Future;

/*
    创建AIO客户端
    1.使用AsynchronousSocketChannel类中的方法open,获取AIO客户端对象
    2.使用AsynchronousSocketChannel对象中的方法connect,根据服务器的ip地址和端口号连接服务器
 */
public class AIOClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        //1.使用AsynchronousSocketChannel类中的方法open,获取AIO客户端对象
        AsynchronousSocketChannel socket = AsynchronousSocketChannel.open();
        Future<Void> future = socket.connect(new InetSocketAddress("localhost", 8888));
        System.out.println(future.isDone());

        //让程序睡眠5秒钟,等待客户端连接服务器成功
        Thread.sleep(12000);

        //给服务器发送数据
        if(future.isDone()){
            socket.write(ByteBuffer.wrap("你好服务器".getBytes()));
        }
        //释放资源
        socket.close();
    }
}
