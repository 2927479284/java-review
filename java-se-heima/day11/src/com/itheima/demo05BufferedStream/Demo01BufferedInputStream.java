package com.itheima.demo05BufferedStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    BufferedInputStream:字节缓冲输入流(重点)
    使用步骤:
    1.创建BufferedInputStream对象,构造方法中传递FileInputStream对象
    2.使用BufferedInputStream对象中的方法read,以字节的方式读取文件
    3.释放资源
 */
public class Demo01BufferedInputStream {
    public static void main(String[] args) throws IOException {
        //1.创建BufferedInputStream对象,构造方法中传递FileInputStream对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day11\\a.txt"));
        //2.使用BufferedInputStream对象中的方法read,以字节的方式读取文件
        //int read() 一次读取一个字节
        /*int len = 0;
        while ((len=bis.read())!=-1){
            System.out.print((char)len);
        }*/

        //int read(byte[] b)  一次读取多个字节
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len=bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

        //3.释放资源
        bis.close();
    }
}
