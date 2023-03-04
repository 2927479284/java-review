package com.itheima.demo05copyFile;


import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 自写测试文件复制
 */
public class Demo02CopyFile {
    public static void main(String[] args) throws Exception{
        long start = System.currentTimeMillis();
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator.DESKTOP-31RFSET\\Desktop\\java-review\\java-se-heima\\day10\\百度、阿里、腾讯、京东等面试题01.mp4");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\百度、阿里、腾讯、京东等面试题01.mp4");
        byte[] bytes = new byte[1024];//1字节读取 读取10MB文件需要30秒
        while (fileInputStream.read(bytes)!=-1){
            fileOutputStream.write(bytes);
        }
        fileInputStream.close();
        fileOutputStream.close();
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000+" 秒执行结束");
    }
}
