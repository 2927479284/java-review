package com.itheima.demo07payTicket;

public class Demo02PayTicket {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread t0 = new MyThread();
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t0.start();
        t1.start();
        t2.start();


    }
}
