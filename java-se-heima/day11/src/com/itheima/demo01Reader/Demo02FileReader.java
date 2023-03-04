package com.itheima.demo01Reader;

import java.io.FileReader;
import java.io.IOException;

/*
    使用字符输入流读取文件的步骤(重点)
    1.创建FileReader对象,构造方法中绑定要读取的数据源(文件,文件路径)
    2.使用FileReader对象中的方法read,以字符的方式读取文件
    3.释放资源(关闭该流并释放与之关联的所有资源)
    -----------------------------------------------------
    String类的构造方法:
        String(char[] value) 把字符数组转换为字符串
        String(char[] value, int offset, int count) 把字符数组的一部分转换为字符串
            int offset:开始索引
            int count:转换个数
 */
public class Demo02FileReader {
    public static void main(String[] args) throws IOException {
        //1.创建FileReader对象,构造方法中绑定要读取的数据源(文件,文件路径)
        FileReader fr = new FileReader("day11\\1.txt");
        //2.使用FileReader对象中的方法read,以字符的方式读取文件
        //int read() 读取单个字符并返回
        /*int len = 0;//每次读取到字符
        while ((len=fr.read())!=-1){
            System.out.print((char)len);//你好a
        }*/

        //int read(char[] cbuf)一次读取多个字符
        char[] chars = new char[1024];
        int len = 0;//每次读取字符的有效个数
        while ((len=fr.read(chars))!=-1){
            System.out.println(new String(chars,0,len));//你好a
        }

        //3.释放资源(关闭该流并释放与之关联的所有资源)
        fr.close();
    }
}
