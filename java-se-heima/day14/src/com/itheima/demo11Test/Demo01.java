package com.itheima.demo11Test;

import java.lang.reflect.Method;

/*
    注解和反射的综合案例二(重点)
    需求:测试方法运行所需的时间上限
         方法运行超出了设置的时间上限,打印false
         方法运行没有超出了设置的时间上限,打印true
    分析:
        1.定义一个设置时间上限的注解TimeLimit
            a.只能用于方法上b.运行期有效c.添加一个long类型的属性,记录时间
        2.定义一个测试类,在测试类的方法上使用TimeLimit注解,给注解的属性设置方法运行的时间
        3.获取测试类的class文件对象
        4.使用class文件对象中的方法newInstance实例化对象
        5.使用class文件对象中的方法getMethod,获取要测试的方法Method对象
        6.使用注解解析技术,获取Method方法上TimeLimit注解的属性值(time = 10000)
        7.使用Method对象中的invoke运行run方法,并记录方法运行的时间
        8.使用设置的时间上限和运行的时间比较
            运行时间>设置的时间上限:打印false
            运行时间<=设置的时间上限:打印true
 */
public class Demo01 {
    public static void main(String[] args) throws Exception {
        //3.获取测试类的class文件对象
        Class clazz = Class.forName("com.itheima.demo11Test.Test");
        //4.使用class文件对象中的方法newInstance实例化对象
        Object obj = clazz.newInstance();
        //5.使用class文件对象中的方法getMethod,获取要测试的方法Method对象
        Method runMethod = clazz.getMethod("run");
        //6.使用注解解析技术,获取Method方法上TimeLimit注解的属性值(time = 10000)
        TimeLimit timeLimit = runMethod.getAnnotation(TimeLimit.class);
        long time = timeLimit.time();
        //7.使用Method对象中的invoke运行run方法,并记录方法运行的时间
        long s = System.currentTimeMillis();
        runMethod.invoke(obj);
        long e = System.currentTimeMillis();
        long runTime = e-s;
        //8.使用设置的时间上限和运行的时间比较
        if(runTime>time){
            //运行时间>设置的时间上限:打印false
            System.out.println(false);
        }else{
            //运行时间<=设置的时间上限:打印true
            System.out.println(true);
        }
    }
}
