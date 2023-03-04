package com.itheima.demo05BufferedStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
    BufferedReader:字符缓冲输入流(重点)
    使用步骤:
      1.创建BufferedReaderd对象,构造方法中传递FileReader对象
      2.使用BufferedReader对象中的方法read|readLine,以字符的方式读取文件
      3.释放资源
 */
public class Demo04BufferedReader {
    public static void main(String[] args) throws IOException {
        //1.创建BufferedReaderd对象,构造方法中传递FileReader对象
        BufferedReader br = new BufferedReader(new FileReader("day11\\a.txt"));
        //2.使用BufferedReader对象中的方法read|readLine,以字符的方式读取文件
        //int read()读取单个字符。
        /*int len = 0;
        while ((len=br.read())!=-1){
            System.out.print((char)len);
        }*/

        //int read(char[] cbuf)将字符读入数组。
        char[] chars = new char[1024];
        int len = 0;
        while ((len=br.read(chars))!=-1){
            System.out.print(new String(chars,0,len));
        }

        /*
            read方法读取文件,会把文件中回车换行符号也读取出来
            你好1
            你好2
            你好3
         */

        //3.释放资源
        br.close();
    }
}
