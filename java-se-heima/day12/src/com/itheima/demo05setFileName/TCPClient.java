package com.itheima.demo05setFileName;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
    文件上传的客户端:
        读取本地文件,上传到服务器,读取服务器回写的"上传成功"
    文件的上传就是文件的复制:
        数据源: c:\\1.jpg
        目的地: 服务器
    详细的步骤:
        1.创建本地字节输入流FileInputStream对象,构造方法中绑定要读取数据源
        2.创建客户端Socket对象,构造方法中绑定服务器的ip地址和端口号
        3.使用Socket对象中的方法getOutputStream,获取网络字节输出流OutputStream对象
        4.使用本地字节输入流FileInputStream对象中的方法read,读取要上传的文件
        5.使用网络字节输出流OutputStream对象中的方法write,把读取到的文件上传到服务器(写)
        6.使用Socket对象中的方法getInputStream,获取网络字节输入流InputStream对象
        7.使用网络字节输入流InputStream对象中的方法read,读取服务器回写的"上传成功"
        8.释放资源(fis,Socket)
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //1.创建本地字节输入流FileInputStream对象,构造方法中绑定要读取数据源
        FileInputStream fis = new FileInputStream("c:\\2.jpg");
        //2.创建客户端Socket对象,构造方法中绑定服务器的ip地址和端口号
        Socket socket = new Socket("localhost",9999);
        //3.使用Socket对象中的方法getOutputStream,获取网络字节输出流OutputStream对象
        OutputStream os = socket.getOutputStream();
        //4.使用本地字节输入流FileInputStream对象中的方法read,读取要上传的文件
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes))!=-1){
            //5.使用网络字节输出流OutputStream对象中的方法write,把读取到的文件上传到服务器(写)
            os.write(bytes,0,len);
        }
        /*
            解决:上传完文件之后,给服务器写一个结束标记,告之服务器文件已经上传完毕
            可以使用Socket对象中的方法
                void shutdownOutput() 禁用此套接字的输出流。
                对于 TCP 套接字，任何以前写入的数据都将被发送，并且后跟 TCP 的正常连接终止序列(结束标记)。
         */
        socket.shutdownOutput();

        //6.使用Socket对象中的方法getInputStream,获取网络字节输入流InputStream对象
        InputStream is = socket.getInputStream();
        //7.使用网络字节输入流InputStream对象中的方法read,读取服务器回写的"上传成功"
        while ((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        //8.释放资源(fis,Socket)
        fis.close();
        socket.close();
    }
}
