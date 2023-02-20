package com.itheima.demo02String;

/*
    contains:包含
    2.boolean contains(String s)  判断字符串中是否包含指定的字符串;包含返回true,不包含返回false
	"abcabc"==>"abc" true   "abcabc"==>"aaa" false
 */
public class Demo02contains {
    public static void main(String[] args) {
        boolean b1 = "你好我好大家好才是真的好Hello".contains("hello");
        System.out.println("b1:"+b1);//b1:false

        boolean b2 = "你好我好大家好才是真的好Hello".contains("Hello");
        System.out.println("b2:"+b2);//b2:true
    }
}
