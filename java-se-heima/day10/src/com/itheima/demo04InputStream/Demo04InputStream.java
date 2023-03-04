package com.itheima.demo04InputStream;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

/**
 * 测试循环指定字节读取文件
 */
public class Demo04InputStream {

    public static void main(String[] args) throws Exception{
        InputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator.DESKTOP-31RFSET\\Desktop\\java-review\\java-se-heima\\day10\\b.txt");
        byte[] bytes = new byte[1];
        while (fileInputStream.read(bytes)!=-1){
            //String s = Arrays.toString(bytes);//无法进行字节转换
            String s = new String(bytes);
            System.out.println(s);
        }
    }
}
