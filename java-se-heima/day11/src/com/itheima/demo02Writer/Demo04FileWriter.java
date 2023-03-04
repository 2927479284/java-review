package com.itheima.demo02Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    和字节流一模一样
    续写:使用两个参数的构造方法
        FileWriter(File file, boolean append)
        FileWriter(String fileName, boolean append)
        参数:
            File file,String fileName:写的目的地
            boolean append:续写开关 true:可以续写 false:不可以
    换行:使用换行符号 \r\n(windows)
 */
public class Demo04FileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day11\\5.txt",true);
        for (int i = 1; i <=3 ; i++) {
            fw.write("你好"+i+"\r\n");
        }
        fw.close();
    }
}
