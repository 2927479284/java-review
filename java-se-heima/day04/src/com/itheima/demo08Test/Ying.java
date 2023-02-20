package com.itheima.demo08Test;

public class Ying implements Fly {
    @Override
    public void fly() {
        System.out.println("鹰击长空!");
    }

    @Override
    public String toString() {
        return "我的宠物是一只鹰!";
    }
}
