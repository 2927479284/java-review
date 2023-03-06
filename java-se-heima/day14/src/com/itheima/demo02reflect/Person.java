package com.itheima.demo02reflect;

public class Person {
    //优先加载,只加载一次
    static {
        System.out.println("静态代码块");
    }
}
