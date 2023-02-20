package com.itheima.demo07Test;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼!");
    }

    @Override
    public String toString() {
        return "我的宠物是一只猫!";
    }
}
