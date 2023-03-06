package com.itheima.demo02reflect;

/*
    获取class文件对象的方式(重点)
    注意:
        class文件对象是由类加载器创建的,我们可以使用三种方式获取class文件对象,获取的都是同一个
    ------------------------------------------------------------------------------
    1.可以使用Object类中的方法getClass
        Class<?> getClass() 返回此 Object 的运行时类。
    2.java会为每种数据类型,都赋予一个class属性,这个属性返回的就是class文件对象
        基本数据类型(4类8种):int.class;double.class;char.class,boolean.class
        引用数据类型:String.class;Student.class;int[].class;ArrayList.class;接口.class
   3.可以使用class类中的静态方法forName获取
        static Class<?> forName(String className) 返回与带有给定字符串名的类或接口相关联的 Class 对象
        参数:
            String className:传递全类名(包名+类名),可以确定类的唯一性
            "com.itheima.demo01init.Person"
            "com.itheima.demo02reflect.Person"
 */
public class Demo01Reflect {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.可以使用Object类中的方法getClass
        Person p = new Person();
        Class c1 = p.getClass();
        System.out.println(c1);//class com.itheima.demo02reflect.Person

        //2.java会为每种数据类型,都赋予一个class属性,这个属性返回的就是class文件对象
        //System.out.println(int.class);
        //System.out.println(double.class);
        //System.out.println(String.class);
        Class c2 = Person.class;
        System.out.println(c2);//class com.itheima.demo02reflect.Person

        //3.可以使用class类中的静态方法forName获取
        Class c3 = Class.forName("com.itheima.demo02reflect.Person");
        System.out.println(c3);//class com.itheima.demo02reflect.Person

        //class文件对象是由类加载器创建的,我们可以使用三种方式获取class文件对象,获取的都是同一个
        System.out.println(c1==c2);//true 引用数据类型==号比较的是对象的地址值
        System.out.println(c1==c3);//true
        System.out.println(c2==c3);//true
    }
}
