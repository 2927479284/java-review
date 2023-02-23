package com.itheima.demo10ThreadAndRunnale;

//a.类继承了Thread类,就不能在继承其他的类了
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("哈哈");
    }
}
