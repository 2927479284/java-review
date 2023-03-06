package com.itheima.demo10Test;

import java.lang.reflect.Method;

/*
    注解和反射的综合案例一(重点)
    需求:模拟Junit中的@Test注解
        方法上添加@Test注解,就可以使用Junit运行方法
        方法上没有添加@Test注解,就不可以使用Junit运行方法
    分析:
        1.自定义一个主键MyTest(添加元注解a.只能用在方法上,b.运行期有效)
        2.定义一个测试类,在类中定义多个测试方法,部分方法上使用MyTest注解
        3.获取测试类的class文件对象
        4.使用class文件对象中的方法newInstance实例化对象
        5.使用class文件对象中的方法getMethods,获取测试类中所有的成员方法,返回一个Method数组
        6.遍历数组,获取每一个Method对象
        7.判断Method对象上是否有MyTest注解
        8.Method对象上MyTest注解,使用invoke,运行Method方法
 */
public class Demo01Test {
    public static void main(String[] args) throws Exception {
        //3.获取测试类的class文件对象
        Class clazz = Class.forName("com.itheima.demo10Test.Test");
        //4.使用class文件对象中的方法newInstance实例化对象
        Object obj = clazz.newInstance();
        //5.使用class文件对象中的方法getMethods,获取测试类中所有的成员方法,返回一个Method数组
        Method[] methods = clazz.getMethods();
        //6.遍历数组,获取每一个Method对象
        for (Method method : methods) {
            //7.判断Method对象上是否有MyTest注解
            if(method.isAnnotationPresent(MyTest.class)){
                //8.Method对象上MyTest注解,使用invoke,运行Method方法
                method.invoke(obj);
            }
        }
    }
}
