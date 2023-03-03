package com.itheima.demo03OutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
    写换行:使用换行符号
    注意:
        回车符\r和换行符\n ：
        回车符：回到一行的开头（return）。换行符：下一行（newline）。
    系统中的换行：
        Windows系统里，每行结尾是 回车+换行 ，即\r\n；
        Unix系统里，每行结尾只有 换行 ，即\n；
        Mac系统里，每行结尾是 回车 ，即\r。从 Mac OS X开始与Linux统一。
 */
public class Demo04OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("day10\\4.txt",true);
        for (int i = 1; i <= 10; i++) {
            fos.write(("hello"+i+"\r\n").getBytes());
        }
        fos.close();
    }
}
