package com.itheima.demo11innerClass;

/*
    成员内部类的使用格式:定义在外部类的内部==>需要通过外部类来找到内部类
        外部类名.内部类名 变量名 = new 外部类对象().new 内部类对象();
        变量名.内部类的成员变量
        变量名.内部类的成员方法
 */
public class Demo01 {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        System.out.println(oi.b);//20
        oi.method();//内部类Inner成员方法method!
    }
}
