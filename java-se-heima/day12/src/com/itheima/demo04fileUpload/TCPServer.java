package com.itheima.demo04fileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    文件上传的服务器端(重点)
        读取客户端上传的文件,把文件写入到服务器的硬盘保存,给客户端回写"上传成功"
    文件上传就是文件的复制
        数据源: 客户端上传的文件
        目的地: 服务器的硬盘  d:\\upload\\1.jpg
    详细的步骤:
        1.判断d盘有没有upload文件夹,没有则创建
        2.创建服务器ServerSocket对象,构造方法中绑定指定的端口号
        3.使用ServerSocket对象中的方法accpet,监听并获取客户端Socket对象
        4.使用Socket对象中的方法getInputStream,获取网络字节输入流InputStream对象
        5.创建本地字节输出流FileOutputStream对象,构造方法中绑定要写入的目的地
        6.使用络字节输入流InputStream对象中的方法read,读取客户端上传的文件
        7.使用本地字节输出流FileOutputStream对象中的方法write,把读取到的文件保存到服务器硬盘上
        8.使用Socket对象中的方法getOutputStream,获取网络字节输出流OutputStream对象
        9.使用网络字节输出流OutputStream对象中的方法write,给客户端回写"上传成功"
        10.释放资源(fos,Socket,ServerSocket)
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1.判断d盘有没有upload文件夹,没有则创建
        File file = new File("d:\\upload");
        if(!file.exists()){
            file.mkdir();
        }
        //2.创建服务器ServerSocket对象,构造方法中绑定指定的端口号
        ServerSocket server = new ServerSocket(9999);
        //3.使用ServerSocket对象中的方法accpet,监听并获取客户端Socket对象
        System.out.println("-----------服务器已经启动,等待客户端上传文件-----------");
        Socket socket = server.accept();
        //4.使用Socket对象中的方法getInputStream,获取网络字节输入流InputStream对象
        InputStream is = socket.getInputStream();
        //5.创建本地字节输出流FileOutputStream对象,构造方法中绑定要写入的目的地
        FileOutputStream fos = new FileOutputStream("d:\\upload\\1.jpg");
        //6.使用络字节输入流InputStream对象中的方法read,读取客户端上传的文件
        byte[] bytes = new byte[1024];
        int len = 0;
        System.out.println("1111111111111111111111111111111111");
        while ((len = is.read(bytes))!=-1){
            //7.使用本地字节输出流FileOutputStream对象中的方法write,把读取到的文件保存到服务器硬盘上
            fos.write(bytes,0,len);
        }
        System.out.println("2222222222222222222222222222222222");
        //8.使用Socket对象中的方法getOutputStream,获取网络字节输出流OutputStream对象
        OutputStream os = socket.getOutputStream();
        //9.使用网络字节输出流OutputStream对象中的方法write,给客户端回写"上传成功"
        os.write("上传成功".getBytes());
        //10.释放资源(fos,Socket,ServerSocket)
        fos.close();
        socket.close();
        server.close();
    }
}
