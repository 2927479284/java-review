package com.itheima.demo05BufferedStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
    BufferedReader特有的方法:
        String readLine() 读取一个文本行。
        通过下列字符之一即可认为某行已终止：换行 ('\n')、回车 ('\r') 或回车后直接跟着换行(\r\n)。
        包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null
 */
public class Demo05readLine {
    public static void main(String[] args) throws IOException {
        //1.创建BufferedReaderd对象,构造方法中传递FileReader对象
        BufferedReader br = new BufferedReader(new FileReader("day11\\a.txt"));
        //2.使用BufferedReader对象中的方法read|readLine,以字符的方式读取文件
       /*
            我们发现使用readLine方法读取数据是一个重复的过程,所以我们可以使用循环优化
            不知道文件中有多少行数据,使用while循环
            while循环结束的条件:readLine方法返回null结束
        */
       String line;
       while ((line=br.readLine())!=null){
           System.out.print(line);
       }

       /*
        readLine方法读取文件,不会把文件中回车换行符号也读取出来
        你好1你好2你好3
        注意:文件中有null,仅仅是一个字符串"null",不是默认的null,可以读取出来
        你好1你好2null你好3
     */

        //3.释放资源
        br.close();
    }

    /*
        String line = br.readLine();
        System.out.println(line);//你好1

        line = br.readLine();
        System.out.println(line);//你好2

        line = br.readLine();
        System.out.println(line);//你好3

        line = br.readLine();
        System.out.println(line);//null
     */
}
