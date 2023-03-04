package com.itheima.demo06reverseStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
    OutputStreamWriter:字符转换输出流
    作用: 编码 字符==>查询编码表==>字节
    使用步骤:
        1.创建OutputStreamWriter对象,构造方法中传递FileOutputStream对象和指定的编码表名称
        2.使用OutputStreamWriter对象中的方法write,把数据写入到内存缓冲区中(编码:字符==>字节)
        3.使用OutputStreamWriter对象中的方法flush,把内存缓冲区中的数据刷新到文件中(fos写字节到文件中)
        4.释放资源(会先调用flush刷新文件)
 */
public class Demo03OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        //write_GBK();
        write_UTF8();
    }

    /*
        使用OutputStreamWriter写UTF-8编码的文件
     */
    private static void write_UTF8() throws IOException {
        //1.创建OutputStreamWriter对象,构造方法中传递FileOutputStream对象和指定的编码表名称
        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day11\\utf-82.txt"),"UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day11\\utf-83.txt"));//不写编码表默认IDEA编码UTF-8
        //2.使用OutputStreamWriter对象中的方法write,把数据写入到内存缓冲区中
        osw.write("你好");
        //3.使用OutputStreamWriter对象中的方法flush,把内存缓冲区中的数据刷新到文件中
        osw.flush();
        //4.释放资源(会先调用flush刷新文件)
        osw.close();
    }

    /*
        使用OutputStreamWriter写GBK编码的文件
     */
    private static void write_GBK() throws IOException {
        //1.创建OutputStreamWriter对象,构造方法中传递FileOutputStream对象和指定的编码表名称
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day11\\gbk2.txt"),"gbk");
        //2.使用OutputStreamWriter对象中的方法write,把数据写入到内存缓冲区中
        osw.write("你好");
        //3.使用OutputStreamWriter对象中的方法flush,把内存缓冲区中的数据刷新到文件中
        osw.flush();
        //4.释放资源(会先调用flush刷新文件)
        osw.close();
    }
}
