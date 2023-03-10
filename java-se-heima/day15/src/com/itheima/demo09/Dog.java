package com.itheima.demo09;

/**
 * 狗类实现动物接口
 */
public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}
