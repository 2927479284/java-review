package com.itheima.demo02reflect;

/*
    java.lang.Class类
        ClassLoader getClassLoader() 返回该类的类加载器。
    java.lang.ClassLoader
        类加载器是负责加载类的对象。
        ClassLoader getParent() 返回委托的父类加载器。
    类加载器的继承关系
        AppClassLoader  extends ExtClassLoader  extends BootstrapClassLoader(C语言) extends ClassLoader
 */
public class Demo03ClassLoader {
    public static void main(String[] args) {
        //获取Person类的class文件对象
        Class clazz = Person.class;

        //获取AppClassLoader
        ClassLoader c1 = clazz.getClassLoader();
        System.out.println(c1);//sun.misc.Launcher$AppClassLoader@18b4aac2

        ClassLoader c2 = c1.getParent();
        System.out.println(c2);//sun.misc.Launcher$ExtClassLoader@4554617c

        ClassLoader c3 = c2.getParent();
        System.out.println(c3);//null
    }
}
