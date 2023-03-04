package com.itheima.demo05BufferedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
    BufferedWriter:字符缓冲输出流(重点)
    使用步骤:
        1.创建BufferedWriter对象,构造方法中传递FileWriter
        2.使用BufferedWriter对象中的方法write,把数据写入到内存缓冲区中
        3.使用BufferedWriter对象中的方法flush,把内存缓冲区中的数据刷新到文件中
        4.释放资源(会先调用flush方法,刷新数据)
    特有的成员方法:
        void newLine() 写入一个行分隔符。写换行,会根据系统不同,而写不同的换行符号
 */
public class Demo06BufferedWriter {
    public static void main(String[] args) throws IOException {
        //1.创建BufferedWriter对象,构造方法中传递FileWriter
        BufferedWriter bw = new BufferedWriter(new FileWriter("day11\\6.txt",true));
        //2.使用BufferedWriter对象中的方法write,把数据写入到内存缓冲区中
        for (int i = 1; i <=3 ; i++) {
            bw.write("hello"+i);
            //bw.write("\r\n");
            bw.newLine();//会根据系统不同,而写不同的换行符号
        }
        //3.使用BufferedWriter对象中的方法flush,把内存缓冲区中的数据刷新到文件中
        bw.flush();
        //4.释放资源(会先调用flush方法,刷新数据)
        bw.close();
    }
}
