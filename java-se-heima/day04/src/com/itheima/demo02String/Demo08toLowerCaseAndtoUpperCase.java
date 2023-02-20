package com.itheima.demo02String;

/*
    lower:小写
    upper:大写
    12.String toLowerCase()  把字符串中所有的英文字符转换为小写 "ABC123你好"==>"abc123你好"
    13.String toUpperCase()  把字符串中所有的英文字符转换为大写 "abc123你好"==>"ABC123你好"
 */
public class Demo08toLowerCaseAndtoUpperCase {
    public static void main(String[] args) {
        System.out.println("AAAaaaBBBbbb123你好".toLowerCase());//aaaaaabbbbbb123你好
        System.out.println("AAAaaaBBBbbb123你好".toUpperCase());//AAAAAABBBBBB123你好
    }
}
