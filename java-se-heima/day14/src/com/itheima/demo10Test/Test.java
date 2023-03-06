package com.itheima.demo10Test;

//2.定义一个测试类,在类中定义多个测试方法,部分方法上使用MyTest注解
public class Test {
    @MyTest
    public void show01(){
        System.out.println("show01方法");
    }

    public void show02(){
        System.out.println("show02方法");
    }
    @MyTest
    public void show03(){
        System.out.println("show03方法");
    }
    @MyTest
    public void show04(){
        System.out.println("show04方法");
    }

    public void show05(){
        System.out.println("show05方法");
    }
}
