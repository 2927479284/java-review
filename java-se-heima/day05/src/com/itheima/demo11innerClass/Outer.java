package com.itheima.demo11innerClass;

public class Outer {
    //外部类的成员变量
    int a = 10;

    //外部类成员方法
    public void show(){
        System.out.println("外部类Outer的成员方法show");
    }

    //定义成员内部类
    public class Inner{
        //内部类成员变量
        int b = 20;
        //内部类成员方法
        public void method(){
            System.out.println("内部类Inner成员方法method!");

            //在内部类中可以直接使用外部的成员变量和成员方法
            System.out.println(a);
            show();
        }
    }
}
