package com.itheima.demo03OutputStream;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 字节输出流测试
 */
public class Demo05OutPutStreamTest {

    public static void main(String[] args) throws IOException {
        OutputStream outputStrea = null;
        try {
            outputStrea = new FileOutputStream("C:\\Users\\Administrator.DESKTOP-31RFSET\\Desktop\\测试File\\aa.txt");
            outputStrea.write(99);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("文件写出出现BUG");
        }finally {
            outputStrea.close();
        }

    }
}
