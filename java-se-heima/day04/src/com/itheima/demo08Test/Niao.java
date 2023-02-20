package com.itheima.demo08Test;

public class Niao implements Fly {
    @Override
    public void fly() {
        System.out.println("小麻雀在飞翔!");
    }

    @Override
    public String toString() {
        return "我的宠物是一只小麻雀!";
    }
}
