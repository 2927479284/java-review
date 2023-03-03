package com.itheima.demo04InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/*
    使用字节输入流一次读取多个字节(重点)
    int read(byte[] b)
          从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。
    明确两件事情:
        1.方法的参数byte[] b字节数组是做什么用的?
            存储读取到的多个字节
            数组的长度的,一般定义为1024(1kb),或者1024的整数倍
        2.方法的返回值int是什么?
            每次读取到有效字节个数
    String类的构造方法:
        String(byte[] bytes):查询编码表,把字节数组,转换为字符串
        String(byte[] bytes, int offset, int length):查询编码表,把字节数组一部分,转换为字符串
            int offset:开始索引
            int length:转换的个数
 */
public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day10\\b.txt");

        /*
            我们发现使用read方法,一次读取多个字节,是一个重复的过程,所以可以使用循环优化
            不知道文件中有多少数据,使用while循环
            循环结束的条件,read方法返回-1
         */
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len=fis.read(bytes))!=-1){
            //System.out.println(Arrays.toString(bytes));//[65, 66, 67, 68, 69, 0, 0, 0,... 0]
            //System.out.println(new String(bytes));//"ABCDE 1019个空格"
            System.out.println(new String(bytes,0,len));//"ABCDE" 把读取的有效字节转换为字符串
        }


        fis.close();
    }

    /*
        int len = fis.read(bytes);
        System.out.println(len);//2
        System.out.println(Arrays.toString(bytes));//[65, 66]
        System.out.println(new String(bytes));//AB

        len = fis.read(bytes);
        System.out.println(len);//2
        System.out.println(new String(bytes));//CD

        len = fis.read(bytes);
        System.out.println(len);//1
        System.out.println(new String(bytes));//ED

        len = fis.read(bytes);
        System.out.println(len);//-1
        System.out.println(new String(bytes));//ED
     */
}
