package com.itheima.demo07NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/*
    创建AIO的服务器端
        1.使用AsynchronousServerSocketChannel类中的方法open,获取AIO服务器对象
        2.使用AsynchronousServerSocketChannel对象中的方法bind,给服务器绑定指定的端口号
        3.使用AsynchronousServerSocketChannel对象中的方法accpet,监听客户端的请求
        4.释放资源
 */
public class AIOServler {
    public static void main(String[] args) throws IOException, InterruptedException {
        //1.使用AsynchronousServerSocketChannel类中的方法open,获取AIO服务器对象
        AsynchronousServerSocketChannel server = AsynchronousServerSocketChannel.open();
        //2.使用AsynchronousServerSocketChannel对象中的方法bind,给服务器绑定指定的端口号
        server.bind(new InetSocketAddress(8888));
        //3.使用AsynchronousServerSocketChannel对象中的方法accpet,监听客户端的请求
        System.out.println("accept方法开始执行了....");
        server.accept(null, new CompletionHandler<AsynchronousSocketChannel, Object>() {
            @Override
            public void completed(AsynchronousSocketChannel socket, Object attachment) {
                /*
                    read方法:是一个阻塞的方法,客户端没有发送数据,则此方法会一直阻塞等待客户端发送数据
                    使用AsynchronousSocketChannel对象中的方法read,读取客户端发送的数据
                    Future<Integer> read(ByteBuffer dst) 读取客户端发送的数据
                    Future接口中的方法get:取出服务器读取到的客户端发送的数据
                        V get() 等待计算完成，然后检索其结果。
                 */
                System.out.println("客户端连接服务器成功,执行completed方法,读取客户端发送的数据...");
                ByteBuffer buffer = ByteBuffer.allocate(1024);
                Future<Integer> future = socket.read(buffer);
                try {
                    Integer len = future.get();
                    System.out.println("服务器读取到客户端发送的数据为:"+new String(buffer.array(),0,len));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void failed(Throwable exc, Object attachment) {
                System.out.println("客户端连接服务器成功,执行failed方法!");
            }
        });
        System.out.println("accpet方法执行结束了...");

        /*
            AIO中的accept方法是一个非阻塞的方法,不会一直等待客户端的连接,往后执行
            增加一个死循环,目的:不让程序结束(实际工作中:可以干一些有意义的事情)
         */
        while (true){
            System.out.println("休息2秒钟,干点其他的事情,等待客户端访问服务器...");
            Thread.sleep(2000);
        }

        //4.释放资源(不关闭)
    }
}
