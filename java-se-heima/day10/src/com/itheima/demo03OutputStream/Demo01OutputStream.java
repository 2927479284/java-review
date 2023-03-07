package com.itheima.demo03OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/*
    字节输出流的基本使用(重点)
    1.创建FileOutputStream对象,构造方法中传递要写入的目的地(文件,文件路径)
    2.使用FileOutputStream对象中的方法write,把内存中字节写入到文件中
    3.释放资源(a.关闭此输出流并b.释放与此流相关联的任何系统资源)
 */
public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        //1.创建FileOutputStream对象,构造方法中传递要写入的目的地(文件,文件路径)
        //FileOutputStream fos = new FileOutputStream("f:\\day10\\1.txt");//FileNotFoundException: f:\day10\1.txt (系统找不到指定的路径。)
        FileOutputStream fos = new FileOutputStream("day10\\1.txt");
        //2.使用FileOutputStream对象中的方法write,把内存中字节写入到文件中
        //public abstract void write(int b) 一次写一个字节
        fos.write(97);
        //3.释放资源(a.关闭此输出流并b.释放与此流相关联的任何系统资源)
        fos.close();
    }
}
