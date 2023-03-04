package com.itheima.demo01Reader;

import java.io.FileReader;
import java.io.Reader;

/**
 * 自写测试reader 字符输入流
 */
public class Demo03Reader {

    public static void main(String[] args) throws Exception{
        Reader fileReader = new FileReader("C:\\Users\\Administrator.DESKTOP-31RFSET\\Desktop\\java-review\\java-se-heima\\day11\\1.txt");
//        int read = fileReader.read();//返回的是当前字符的字节
//        System.out.println(read);//20320
//        System.out.println((char) read);//你
        /**
         * 第一种读法
         */
/*        int len = 0;
        while ((len = fileReader.read())!=-1){
            System.out.println((char) len);
        }*/

        /**
         * 第二种
         */
        char[] chars = new char[1024];
        int len1 = 0;//这里返回的是字符的个数 指定一次性读1024 但这里有效个数为3
        while ((len1 = fileReader.read(chars))!=-1){
            System.out.println((new String(chars,0,len1)));
        }

        fileReader.close();

    }
}
