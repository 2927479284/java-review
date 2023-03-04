package com.itheima.demo05BufferedStream;

import java.io.*;

/*
    复制文件测试缓冲流的效率
 */
public class Demo03CopyFile {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        //copyFile01();
        copyFile02();
        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时:"+(e-s)+"毫秒!");
    }

    /*
        使用缓冲的字节输入流和字节输出流:一次读写一个字节复制文件
        全球通史.txt 4.91 MB (5,155,785 字节) 复制文件共耗时:449毫秒!
     */
    private static void copyFile02() {
        try( BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:\\全球通史.txt"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:\\全球通史.txt"));) {
            int len = 0;
            while ((len=bis.read())!=-1){
                bos.write(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
        使用基本的字节输入流和字节输出流:一次读写一个字节复制文件
        全球通史.txt 4.91 MB (5,155,785 字节)  复制文件共耗时:39733毫秒!
     */
    private static void copyFile01() {
        try( FileInputStream fis = new FileInputStream("c:\\全球通史.txt");
             FileOutputStream fos = new FileOutputStream("d:\\全球通史.txt");) {
            int len = 0;
            while ((len=fis.read())!=-1){
                fos.write(len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
