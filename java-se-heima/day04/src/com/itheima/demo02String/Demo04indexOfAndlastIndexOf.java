package com.itheima.demo02String;

/*
    index:索引
    last:最后
    5.int indexOf(String str) 从前往后在字符串中查找另外一个字符串,找到了返回字符串对应的索引,找不到返回-1
    6.int lastIndexOf(String s)  从后往前在字符串中查找另外一个字符串,找到了返回字符串对应的索引,找不到返回-1
        "abc你好abc我好abc大家好":在字符串中查找"abc"
        indexOf:0   lastIndexOf:10
        "abc你好abc我好abc大家好":在字符串中查找"我好"
        indexOf:8   lastIndexOf:8
 */
public class Demo04indexOfAndlastIndexOf {
    public static void main(String[] args) {
        System.out.println("abc你好abc我好abc大家好".indexOf("abc"));//0
        System.out.println("abc你好abc我好abc大家好".lastIndexOf("abc"));//10
        System.out.println("abc你好abc我好abc大家好".indexOf("我好"));//8
        System.out.println("abc你好abc我好abc大家好".lastIndexOf("我好"));//8
        System.out.println("abc你好abc我好abc大家好".indexOf("赵四"));//-1
        System.out.println("abc你好abc我好abc大家好".lastIndexOf("赵四"));//-1
    }
}
