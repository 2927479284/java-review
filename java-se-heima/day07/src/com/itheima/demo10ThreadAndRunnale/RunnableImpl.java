package com.itheima.demo10ThreadAndRunnale;

//b.类实现了Runnable接口,还可以在继承其他的类
public class RunnableImpl extends Person implements Runnable {
    @Override
    public void run() {
        System.out.println("呵呵");
    }
}
