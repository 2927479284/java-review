package com.itheima.demo03reflect;

/*
    使用反射技术获取构造方法并实例化对象的简化方式(重点)
    java.lang.Class类
         T newInstance() 创建此 Class 对象所表示的类的一个新实例。
         默认使用空参数构造方法,实例化对象
    实现步骤:
        1.获取Person类的class文件对象
        2.直接使用class文件对象中的方法newInstance实例化对象(省略获取Constructor构造方法这步)
 */
public class Demo02Constructor {
    public static void main(String[] args) throws Exception {
        //1.获取Person类的class文件对象
        Class clazz = Class.forName("com.itheima.demo03reflect.Person");

        //2.直接使用class文件对象中的方法newInstance实例化对象(省略获取Constructor构造方法这步)
        //Object obj = clazz.getConstructor().newInstance();
        Object obj = clazz.newInstance();
        System.out.println(obj);//Person{name='null', age=0, sex='null'}

        //想使用Person特有的方法,需要向下转型
        Person p = (Person)obj;
        p.setName("张三");
        p.setAge(18);
        p.setSex("男");
        System.out.println(p);//Person{name='张三', age=18, sex='男'}
    }
}
