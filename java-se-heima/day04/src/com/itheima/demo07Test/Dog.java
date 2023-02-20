package com.itheima.demo07Test;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃肉!");
    }

    @Override
    public String toString() {
        return "我的宠物是一只狗!";
    }
}
