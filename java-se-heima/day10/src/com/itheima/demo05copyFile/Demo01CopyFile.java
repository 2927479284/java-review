package com.itheima.demo05copyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    文件复制
        数据源: 要读取的的文件  c:\\1.jpg
        目的地: 写入的文件的位置 d:\\1.jpg
    分析:
        1.创建FileInputStream对象,构造方法中绑定要读取的数据源
        2.创建FileOutputStream对象,构造方法中绑定要写入的目的地
        3.使用FileInputStream对象中的方法read,以字节的方式读取文件
        4.使用FileOutputStream对象中的方法write,把读取到的字节写入到目的
        5.释放资源(先开的后关)
 */
public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        //测试复制文件的时间
        long s = System.currentTimeMillis();
        //copyFile01();
        copyFile02();
        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时:"+(e-s)+"毫秒!");
    }

    /*
        一次读取多个字节,写入多个字节的方式复制文件
        全球通史.txt 5,155,785 字节 复制文件共耗时:76毫秒!
        缘起.mp4  64.8 MB (67,995,218 字节) 复制文件共耗时:1092毫秒!
        748m.rar 748 MB (785,042,177 字节) 复制文件共耗时:1517毫秒!
     */
    private static void copyFile02() throws IOException {
        //1.创建FileInputStream对象,构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("c:\\748m.rar");
        //2.创建FileOutputStream对象,构造方法中绑定要写入的目的地
        FileOutputStream fos = new FileOutputStream("d:\\748m.rar");
        //3.使用FileInputStream对象中的方法read,以字节的方式读取文件
        byte[] bytes = new byte[1024*200];
        int len = 0;
        while ((len = fis.read(bytes))!=-1){
            //4.使用FileOutputStream对象中的方法write,把读取到的字节写入到目的
            fos.write(bytes,0,len);//写每次读取的有效字节
        }
        //5.释放资源(先开的后关)
        fos.close();
        fis.close();
    }

    /*
        一次读取一个字节,写入一个字节的方式复制文件
        1.jpg 161,548 字节  复制文件共耗时:2207毫秒!
        全球通史.txt 5,155,785 字节 复制文件共耗时:40505毫秒!
     */
    private static void copyFile01() throws IOException {
        //1.创建FileInputStream对象,构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("c:\\全球通史.txt");
        //2.创建FileOutputStream对象,构造方法中绑定要写入的目的地
        FileOutputStream fos = new FileOutputStream("d:\\全球通史.txt");
        //3.使用FileInputStream对象中的方法read,以字节的方式读取文件
        int len = 0;
        while ((len=fis.read())!=-1){
            //4.使用FileOutputStream对象中的方法write,把读取到的字节写入到目的
            fos.write(len);
        }
        //5.释放资源(先开的后关)
        fos.close();
        fis.close();
    }

}
