package com.itheima.demo01Reader;

import java.io.FileInputStream;
import java.io.IOException;

/*
    使用字节输入流读取含有中文的文件
    IDEA中默认的使用的编码表是UTF-8编码表:在UTF-8编码中一个中文占用3个字节
 */
public class Demo01FileInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day11\\1.txt");
        int len = 0;
        while ((len=fis.read())!=-1){
            //出现了乱码:每次读取一个字节,是中文1/3,把1/3个中文查询编码表转换为字符,找不到,就出现了乱码
            System.out.print((char)len);//ä½ å¥½a
        }
        fis.close();
    }
}
