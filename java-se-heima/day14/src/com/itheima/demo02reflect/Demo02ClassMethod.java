package com.itheima.demo02reflect;

/*
    Class类中的一些方法:
        String getSimpleName() 获取类名
        String getName()  获取全类名(包名+类名)
        ClassLoader getClassLoader() 返回该类的类加载器。
    注意:数据库
        当我们使用Class.forName方法,获取class文件对象的时候,会执行类中的静态代码块
 */
public class Demo02ClassMethod {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取Person类的class文件对象
        Class clazz = Class.forName("com.itheima.demo02reflect.Person");

        String simpleName = clazz.getSimpleName();
        System.out.println(simpleName);//Person

        String name = clazz.getName();
        System.out.println(name);//com.itheima.demo02reflect.Person

        ClassLoader classLoader = clazz.getClassLoader();
        System.out.println(classLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2
    }
}
