package com.itheima.demo01ThreadPool;

//2.创建一个Runnable接口的实现类,重写run方法,设置线程任务(匿名内部类)
public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始执行线程任务了!");
    }
}
