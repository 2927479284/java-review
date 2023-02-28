package com.itheima.demo06AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

/*
    AtomicInteger解决变量的原子性
 */
public class MyThread extends Thread{
    //1.定义多线程共享的静态变量money,使用AtomicInteger类型
    public static AtomicInteger money=new AtomicInteger(0);

    @Override
    public void run() {
        //2.Thread-0线程把money的值增加1000
        System.out.println("Thread-0线程开始执行线程任务,增加money的值!");
        for (int i = 0; i < 1000; i++) {
            money.getAndIncrement();//money++;
            //增加两个线程抢夺cpu的概率
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread-0线程执行线程任务结束!");
    }
}
