package com.itheima.demo09Runnable;

public class Demo02RunnableImpl implements  Runnable{

    @Override
    public void run() {
        System.out.println("实现runnable接口run方法调用成功");
        System.out.println("子线程名字："+Thread.currentThread().getName()+" 正在执行");
    }
}
