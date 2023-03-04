package com.itheima.demo06reverseStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 测试转换流
 */
public class Demo05Test {

    public static void main(String[] args) throws Exception{

        InputStreamReader gbk = new InputStreamReader(
                new FileInputStream(
                        "C:\\Users\\Administrator.DESKTOP-31RFSET\\Desktop\\java-review\\java-se-heima\\day11\\gbk.txt"),
                "GBK");
        int len = 0;
        while ((len = gbk.read())!=-1){
            System.out.println((char) len);
        }
        gbk.close();
    }
}
