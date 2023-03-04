package com.itheima.demo06reverseStream;

import java.io.FileReader;
import java.io.IOException;

/*
    使用FileReader读取GBK编码的文件:会出现乱码,编码和解码不一致导致
    GBK编码:一个中文占用2个字节
    UTF-8编码:一个中文占用3个字节
    FileReader流对象只能读取IDEA默认编码UTF-8编码的文件
 */
public class Demo01FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day11\\gbk.txt");
        int len = 0;
        while ((len=fr.read())!=-1){
            System.out.print((char)len);//��� 乱码
        }
        fr.close();
    }
}
