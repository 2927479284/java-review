package com.itheima.demo08NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

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
                System.out.println("客户端连接服务器成功,执行completed方法,读取客户端发送的数据...");
                /*
                    read方法:是一个非阻塞的方法,只在我们设置的时间范围内等待客户端发送数据
                    void read(ByteBuffer dst, long timeout, TimeUnit unit, A attachment, CompletionHandler<Integer,? super A> handler)
                    参数
                        ByteBuffer dst - 要传输字节的缓冲区,存储客户端发送的数据
                        long timeout - 完成I / O操作的最长时间  10
                        TimeUnit unit - timeout参数的时间单位
                            TimeUnit.DAYS 天
                            TimeUnit.HOURS 小时
                            TimeUnit.MINUTES  分钟
                            TimeUnit.SECONDS   秒
                        A attachment - 要附加到I / O操作的对象; 可以null
                        CompletionHandler handler - 也是一个回调函数
                            completed:在设置的有效时间范围内,客户端给服务器发送数据,执行completed成功方法
                            failed:在设置的有效时间范围内,客户端没有给服务器发送数据,执行failed失败方法
                 */
                ByteBuffer buffer = ByteBuffer.allocate(1024);
                socket.read(buffer, 10, TimeUnit.SECONDS, null, new CompletionHandler<Integer, Object>() {
                    @Override
                    public void completed(Integer len, Object attachment) {
                        System.out.println("在设置的有效时间范围内,客户端给服务器发送数据,执行completed成功方法");
                        System.out.println("服务器读取客户端发送的数据为:"+new String(buffer.array(),0,len));
                    }

                    @Override
                    public void failed(Throwable exc, Object attachment) {
                        System.out.println("在设置的有效时间范围内,客户端没有给服务器发送数据,执行failed失败方法");
                    }
                });
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
