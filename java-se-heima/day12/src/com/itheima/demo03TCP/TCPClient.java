package com.itheima.demo03TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
    创建TCP通信的客户端:
    作用:和服务器经过3次握手建立一个连接通路,给服务器发送数据,读取服务器发送的数据
    表示客户端的类:
        java.net.Socket:此类实现客户端套接字（也可以就叫“套接字”）。套接字是两台机器间通信的端点。
        套接字:封装了IP地址和端口号的网络单位
    构造方法:
        Socket(InetAddress address, int port)
        Socket(String host, int port)
        参数:
            InetAddress address|String host:传递服务器的IP地址
            int port:传递服务器的端口号
    成员方法:
        OutputStream getOutputStream()返回此套接字的输出流。
        InputStream getInputStream() 返回此套接字的输入流。
    -----------------------------------------------------------------------------------
    注意:
        1.当我们使用Socket构造方法创建对象的时候,就会根据服务器的ip地址和端口号和服务器进行三次握手,建立连接
            服务器已经启动,并且IP地址和端口号书写无误,握手成功
            服务器没有启动,或者IP地址和端口号书写有误,握手失败,会抛出连接异常
                ConnectException: Connection refused: connect
        2.客户端和服务器之间进行数据交互,必须使用Socket中提供的网络流对象,数据源和目的地分别客户端和服务器
            不能使用自己创建的流对象
            new FileInputStream("day12\\1.txt"); 数据源只能本地文件
            new FileOutputStream("day12\\1.txt");目的地只能本地文件
   -----------------------------------------------------------------------------
   创建客户端的步骤:(重点)
    1.创建Socket客户端对象,构造方法中传递服务器的ip地址和端口号
    2.使用Socket对象中的方法getOutputStream,获取网络字节输出流OutputStream
    3.使用网络字节输出流OutputStream对象中的方法write,给服务器发送数据
    4.使用Socket对象中的方法getInputStream,获取网络字节输入流InputStream
    5.使用网络字节输入流InputStream对象中的方法read,读取服务器发送的数据
    6.释放资源(Socket)
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //1.创建Socket客户端对象,构造方法中传递服务器的ip地址和端口号
        Socket socket = new Socket("127.0.0.1",8888);
        //2.使用Socket对象中的方法getOutputStream,获取网络字节输出流OutputStream
        OutputStream os = socket.getOutputStream();
        //3.使用网络字节输出流OutputStream对象中的方法write,给服务器发送数据
        System.out.println("①客户端给服务器发送数据:你好服务器");
        os.write("你好服务器".getBytes());
        //4.使用Socket对象中的方法getInputStream,获取网络字节输入流InputStream
        InputStream is = socket.getInputStream();
        //5.使用网络字节输入流InputStream对象中的方法read,读取服务器发送的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println("④客户端读取服务器的数据:"+new String(bytes,0,len));
        //6.释放资源(Socket)
        socket.close();
    }
}
