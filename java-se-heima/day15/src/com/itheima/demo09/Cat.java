package com.itheima.demo09;

/**
 * 猫类实现动物接口
 */
public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
