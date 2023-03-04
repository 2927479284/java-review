package com.itheima.demo04InputStream;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 自写测试输入流 读取文件
 */
public class Demo03InputStream {

    public static void main(String[] args) throws Exception {


        InputStream inputStream = new FileInputStream("C:\\Users\\Administrator.DESKTOP-31RFSET\\Desktop\\java-review\\java-se-heima\\day10\\b.txt");
        byte[] bytes = new byte[100];

        int read = inputStream.read(bytes);
        System.out.println(read);//5 读出的是有效字节个数
        System.out.println(new String(bytes));

        int read1 = inputStream.read(bytes);
        System.out.println(read1);//-1
        System.out.println(new String(bytes));

        int read2 = inputStream.read(bytes);
        System.out.println(read2);//-1
        System.out.println(new String(bytes));

    }
}
