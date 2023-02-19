package com.itheima.demo03equals;

import java.util.Random;

/*
    boolean equals(Object obj) 指示其他某个对象是否与此对象“相等”。
    equals方法的底层源码:
        public boolean equals(Object obj) {
            return (this == obj);
        }
        this是谁:哪个对象调用的方法,方法中的this就是哪个对象
        obj:传递的参数
        ==:比较运算符
        基本数据类型:==号比较的是值 10==20
        引用数据类型:==号比较的是对象的地址值  aa11==bb22
 */
public class Demo02Equals {
    public static void main(String[] args) {
        Person p1 = new Person("张三",18);
        Person p2 = new Person("李四",18);
        System.out.println(p1);//com.itheima.demo03equals.Person@140e19d
        System.out.println(p2);//com.itheima.demo03equals.Person@17327b6
        //Person默认继承了Object类,所以可以使用继承自Object类的equals方法
        boolean b1 = p1.equals(p1);
        System.out.println("b1:"+b1);
        System.out.println("----------------");
        boolean b2 = p1.equals(null);
        System.out.println("b2:"+b2);
        System.out.println("----------------");
        Random r = new Random();
        boolean b3 = p1.equals(r);
        System.out.println("b3:"+b3);
        System.out.println("----------------");
        boolean b4 = p1.equals(p2);
        System.out.println("b4:"+b4);
        System.out.println("----------------");
        Person p3 = new Person("王五",18);
        Person p4 = new Person("王五",18);
        System.out.println(p3);//com.itheima.demo03equals.Person@131245a
        System.out.println(p4);//com.itheima.demo03equals.Person@16f6e28
        boolean b5 = p3.equals(p4);
        System.out.println("b5:"+b5);//b5:true
    }
}
