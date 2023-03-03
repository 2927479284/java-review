package com.itheima.demo03OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    1.续写(追加写):使用两个参数的构造方法
        FileOutputStream(File file, boolean append)
        FileOutputStream(String name, boolean append)
        参数:
            File file,String name:传递写入数据的目的地
            boolean append:续写开关
                true:可以续写,创建对象,文件已经存在,不会覆盖,在文件的末尾继续写数据
                false:不可以续写,创建对象,文件已经存在,会创建一个空白文件,把之前的文件覆盖,在新文件中写数据
 */
public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        //创建FileOutputStream对象,构造方法中传递写入的目的地和续写开关
        FileOutputStream fos = new FileOutputStream("day10\\3.txt",true);
        //使用write方法往文件中写数据
        byte[] bytes = "hello".getBytes();
        fos.write(bytes);
        //释放资源
        fos.close();
    }
}
