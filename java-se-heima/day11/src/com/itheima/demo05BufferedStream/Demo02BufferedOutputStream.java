package com.itheima.demo05BufferedStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    BufferedOutputStream:字节缓冲输出流(重点)
    1.创建BufferedOutputStream对象,构造方法中传递FileOutputStream对象
    2.使用BufferedOutputStream对象中的方法write,把数据写入到[内存缓冲区中]
    3.使用BufferedOutputStream对象中的方法flush,把内存缓冲区中的数据刷新到文件中
    4.释放资源(会先调用flush方法刷新数据)
 */
public class Demo02BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        //1.创建BufferedOutputStream对象,构造方法中传递FileOutputStream对象
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day11\\b.txt"));
        //2.使用BufferedOutputStream对象中的方法write,把数据写入到[内存缓冲区中]
        bos.write("你好".getBytes());
        //3.使用BufferedOutputStream对象中的方法flush,把内存缓冲区中的数据刷新到文件中
        //bos.flush();
        //4.释放资源(会先调用flush方法刷新数据)
        bos.close();
    }
}
