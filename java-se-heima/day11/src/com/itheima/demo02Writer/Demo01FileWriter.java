package com.itheima.demo02Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    使用字符输出流基本步骤(重点)
    1.创建FileWriter对象,构造方法中绑定要写入的目的地(文件,文件路径)
    2.使用FileWriter对象中的方法write,把数据以字符的方式写入到[内存缓冲区中]
    3.使用FileWriter对象中的方法flush,把内存缓冲区中的数据刷新到文件中
    4.释放资源(会自动调用flush方法刷新数据)
 */
public class Demo01FileWriter {
    public static void main(String[] args) throws IOException {
        //1.创建FileWriter对象,构造方法中绑定要写入的目的地(文件,文件路径)
        FileWriter fw = new FileWriter("day11\\2.txt");
        //2.使用FileWriter对象中的方法write,把数据以字符的方式写入到[内存缓冲区中]
        //void write(int c)写入单个字符。
        fw.write(97);
        //3.使用FileWriter对象中的方法flush,把内存缓冲区中的数据刷新到文件中
        fw.flush();
        //4.释放资源(会自动调用flush方法刷新数据)
        fw.close();
    }
}
