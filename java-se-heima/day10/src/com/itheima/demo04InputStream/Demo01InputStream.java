package com.itheima.demo04InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    字节输入流的基本使用:一次读取一个字节(重点)
    int read() 一次读取文件中的一个字节并返回
    实现步骤:
        1.创建FileInputStream对象,构造方法中传递要读取数据源(文件,文件路径)
        2.使用FileInputStream对象中的方法read,以字节的方式读取文件
        3.释放资源(关闭此输入流并释放与该流关联的所有系统资源)
    注意:
        1.读取文件的流不会创建文件,没有文件抛出FileNotFoundException:文件找不到异常
        //FileInputStream fis = new FileInputStream("day10\\aa.txt");//FileNotFoundException: day10\aa.txt (系统找不到指定的文件。)
        2.读取文件的流只能读取文件,不能读取文件夹,拒绝访问
        //FileInputStream fis = new FileInputStream("day10");//FileNotFoundException: day10 (拒绝访问。)
 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        //1.创建FileInputStream对象,构造方法中传递要读取数据源(文件,文件路径)
        FileInputStream fis = new FileInputStream("day10\\a.txt");
        //2.使用FileInputStream对象中的方法read,以字节的方式读取文件
        //int read() 一次读取文件中的一个字节并返回

        /*
            我们发现读取文件是一个重复的过程,所以可以使用循环优化
            我们不知道文件中有多少数据,使用while循环
            while循环什么时候结束,read方法读取到-1的时候结束
            while循环的布尔表达式:((len=fis.read())!=-1)含义
                1.fis.read():读取一个字节
                2.len=fis.read():把读取到的字节赋值给变量len
                3.(len=fis.read())!=-1:判断变量len是否为-1
                    不是-1:执行循环体,打印变量len的值
                    是-1:结束while循环
         */
        int len = 0;
        while ((len=fis.read())!=-1){
            System.out.print((char)len);
        }

        //3.释放资源(关闭此输入流并释放与该流关联的所有系统资源)
        fis.close();
    }

    /*
        int len = fis.read();
        System.out.println(len);//97 a

        len = fis.read();
        System.out.println(len);//98 b

        len = fis.read();
        System.out.println(len);//99 c

        len = fis.read();
        System.out.println(len);//-1
     */
}
