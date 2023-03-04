package com.itheima.demo06reverseStream;

import java.io.*;

/*
    练习：转换文件编码
        将GBK编码的文本文件，转换为UTF-8编码的文本文件。
    思路:
        [你好]文件(GBK)==>转换流读取(GBK)==>你好==>转换流写入(UTF-8)==>[你好]文件(UTF-8)
    步骤:
        1.创建InputStreamReader对象,构造方法中传递FileInputStream对象和GBK编码表名称
        2.创建OutputStreamWriter对象,构造方法中传递FileOutputStream对象和UTF-8编码表名称
        3.使用InputStreamReader对象中的方法read,以GBK编码读取文件
        4.使用OutputStreamWriter对象中的方法write,以UTF-8编码写入文件
        5.释放资源
 */
public class Demo04Test {
    public static void main(String[] args) throws IOException {
        //1.创建InputStreamReader对象,构造方法中传递FileInputStream对象和GBK编码表名称
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day11\\gbk.txt"),"GBK");
        //2.创建OutputStreamWriter对象,构造方法中传递FileOutputStream对象和UTF-8编码表名称
        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day11\\utf-84.txt"),"UTF-8");
        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day11\\utf-84.txt"));
        FileWriter osw = new FileWriter("day11\\utf-85.txt");
        //3.使用InputStreamReader对象中的方法read,以GBK编码读取文件
        int len = 0;
        while ((len= isr.read())!=-1){
            //4.使用OutputStreamWriter对象中的方法write,以UTF-8编码写入文件
            osw.write(len);
        }
        //5.释放资源
        osw.close();
        isr.close();
    }
}
