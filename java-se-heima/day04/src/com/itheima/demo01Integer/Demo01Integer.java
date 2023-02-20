package com.itheima.demo01Integer;

import java.net.Inet4Address;

/*
    装箱:int==>Integer
    拆箱:Integer==>int
 */
public class Demo01Integer {
    public static void main(String[] args) {
        //装箱:int==>Integer
        //a.可以使用Integer类的构造方法
        Integer in1 = new Integer(10);
        System.out.println(in1);//10 Integer类重写了Object类的toString方法

        Integer in2 = new Integer("10");
        System.out.println(in2);//10

        //b.可以使用Integer类中的[静态]方法valueOf
        Integer in3 = Integer.valueOf(10);
        System.out.println(in3);//10

        Integer in4 = Integer.valueOf("10");
        System.out.println(in4);

        //注意:以上两个参数是字符串的方法,必须传递字符串类型的整数,否则会抛出数字格式化异常
        //Integer in5 = Integer.valueOf("A");//NumberFormatException: For input string: "A"

        //拆箱:Integer==>int
        //Integer类:int intValue() 以 int 类型返回该 Integer 的值。
        int a = in1.intValue();
        System.out.println(a);//10
    }
}
