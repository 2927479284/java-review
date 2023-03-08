package com.itheima.demo02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
    java中的转义字符(了解)
    \ 反斜杠
    可以把普通的字符,转换为有特殊含义的字符
    可以把有特殊含义的字符,转换为普通字符
 */
public class Demo01 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("t");//t

        System.out.println("你好t我好t大家好");//你好t我好t大家好
        System.out.println("你好t我好t大家好");//你好t我好t大家好
        System.out.println("你好t我好t大家好");//你好t我好t大家好

        //使用转义字符,把普通的t,转换为有特殊含义的制表符(tab)
        System.out.println("你好\t我好\t大家好");
        System.out.println("你好\t我好\t大家好");
        System.out.println("你好\t我好\t大家好");

        //使用转义字符,把有特殊含义的',转换为普通的'
        char c = '\'';
        System.out.println(c);//'

        //使用转义字符,把有特殊含义的\,转换为普通的\
        FileInputStream fis = new FileInputStream("D:\\aaa\\a.txt");
    }
}
