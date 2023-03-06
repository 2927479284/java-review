
package com.itheima.demo01init;

/*
    类的初始化:类什么时候会进入到内存中
    只要类进入到内存中:那么类加载器就已经为类创建好class文件对象,就可以使用反射技术了
 */
public class Demo01 {
    public static void main(String[] args) {
        //1.使用java.exe命令运行某一个类的时候
        //2.创建某一个类对象的时候
        //new Person();
        //3.创建一个类子类对象的时候
        //new Student();
        //4.访问一个类中的静态成员变量的时候
        //System.out.println(Person.a);
        //5.访问一个类中的静态成员方法的时候
        Person.show();
        //6.使用反射方式来强制创建某个类或接口对应的java.lang.Class对象
    }
}
