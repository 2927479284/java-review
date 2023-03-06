package com.itheima.demo04reflect;

/*
    使用反射技术获取实现类所实现的所有接口(了解_扩展)
    java.lang.Class类
    Class<?>[] getInterfaces()确定此对象所表示的类或接口实现的接口。
 */
public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取接口实现类AandBImpl的class文件对象
        Class clazz = Class.forName("com.itheima.demo04reflect.AandBImpl");
        Class[] interfaces = clazz.getInterfaces();
        for (Class in : interfaces) {
            System.out.println(in);
            /*
                interface com.itheima.demo04reflect.A
                interface com.itheima.demo04reflect.B
             */
        }
        Class c2 = Class.forName("java.util.ArrayList");
        Class[] interfaces2 = c2.getInterfaces();
        for (Class in : interfaces2) {
            System.out.println(in);
            /*
                interface java.util.List
                interface java.util.RandomAccess
                interface java.lang.Cloneable
                interface java.io.Serializable
             */
        }
    }
}
