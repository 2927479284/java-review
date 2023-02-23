package com.itheima.demo06Thread;

//1.创建一个类继承Thread类
public class MyThread extends Thread{
    //2.在子类中重写Thread类中的run方法,设置线程任务
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("run==>"+i);
        }
    }
}
