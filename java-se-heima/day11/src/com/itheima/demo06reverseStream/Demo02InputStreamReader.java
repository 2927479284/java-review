package com.itheima.demo06reverseStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    InputStreamReader:字符转换输入流
    作用: 解码 字节==>查询指定编码表==>字符
    使用步骤:
        1.创建InputStreamReader对象,构造方法中传递FileInputStream对象和指定的编码表名称
        2.使用InputStreamReader对象中的方法read,以指定的编码读取文件
        3.释放资源
    注意:
        构造方法中指定的编码表名称和文件的编码必须相同,否则出现乱码
 */
public class Demo02InputStreamReader {
    public static void main(String[] args) throws IOException {
        //read_GBK();
        read_UTF8();
    }

    /*
        使用InputStreamReader读取UTF-8编码的文件
     */
    private static void read_UTF8() throws IOException {
        //1.创建InputStreamReader对象,构造方法中传递FileInputStream对象和指定的编码表名称
        //InputStreamReader isr = new InputStreamReader(new FileInputStream("day11\\utf-8.txt"),"GBK");//浣犲ソ
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day11\\utf-8.txt"),"utf-8");//你好
        //2.使用InputStreamReader对象中的方法read,以指定的编码读取文件
        int len = 0;
        while ((len=isr.read())!=-1){
            System.out.print((char)len);
        }
        //3.释放资源
        isr.close();
    }

    /*
        使用InputStreamReader读取GBK编码的文件
     */
    private static void read_GBK() throws IOException {
        //1.创建InputStreamReader对象,构造方法中传递FileInputStream对象和指定的编码表名称
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day11\\gbk.txt"),"GBK");
        //2.使用InputStreamReader对象中的方法read,以指定的编码读取文件
        int len = 0;
        while ((len=isr.read())!=-1){
            System.out.print((char)len);
        }
        //3.释放资源
        isr.close();
    }
}
