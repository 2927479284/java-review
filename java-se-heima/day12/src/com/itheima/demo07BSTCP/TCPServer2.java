package com.itheima.demo07BSTCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
    BS版本的TCP案例
    B:浏览器(作为客户端)
    S:服务器
    ③服务器根据客户端的请求信息,把客户端要的文件的路径解析出来(day12/web/index.html),根据文件的路径读取index.html文件,把文件发送到客户端浏览器页面中显示出来
    1.把网络字节输入流InputStream,转换字符缓冲输入流BufferedReader
    BufferedReader br = new BufferedReader(new InputStreamReader(is));
    2.使用readLine方法,读取第一行文本 "GET /day12/web/index.html HTTP/1.1"
    3.使用String类中的方法split,根据空格切割字符  String[]  arr[1] "/day12/web/index.html"
    4.使用String类中的方法subString(1) "day12/web/index.html"
    5.创建本地字节输入流,根据文件的路径"day12/web/index.html",读取文件
    6.使用网络字节输出流,把读取到index.html文件,发送到客户端浏览器上显示

 */
public class TCPServer2 {
    public static void main(String[] args) throws IOException {
        //创建一个服务器ServerSocket对象,和系统要指定的端口号
        ServerSocket server = new ServerSocket(8080);
        //使用ServerSocket对象中的方法accept,监听并获取客户端Socket对象
        Socket socket = server.accept();
        //使用Socket对象中的方法getInputStream对象,获取网络字节输入流InputStream对象
        InputStream is = socket.getInputStream();
        //1.把网络字节输入流InputStream,转换字符缓冲输入流BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        //2.使用readLine方法,读取第一行文本 "GET /day12/web/index.html HTTP/1.1"
        String line = br.readLine();
        //3.使用String类中的方法split,根据空格切割字符  String[]  arr[1] "/day12/web/index.html"
        String[] arr = line.split(" ");
        //4.使用String类中的方法subString(1) "day12/web/index.html"
        String path = arr[1].substring(1);
        System.out.println(path);
        //5.创建本地字节输入流,根据文件的路径"day12/web/index.html",读取文件
        FileInputStream fis = new FileInputStream(path);
        //6.使用网络字节输出流,把读取到index.html文件,发送到客户端浏览器上显示
        OutputStream os = socket.getOutputStream();

        //增加以下三行代码的目的:告之客户端浏览器,写回的是html类型的文件,让客户端以网页的形式显示文件,而不是文本
        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("Content-Type:text/html\r\n".getBytes());
        os.write("\r\n".getBytes());

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len=fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }

        //释放资源
        socket.close();
        server.close();
    }
}
