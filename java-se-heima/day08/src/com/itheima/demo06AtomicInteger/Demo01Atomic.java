package com.itheima.demo06AtomicInteger;

public class Demo01Atomic {
    public static void main(String[] args) throws InterruptedException {
        MyThread mt = new MyThread();
        mt.start();

        //主线程在开启新的线程之后,会继续执行main方法中的代码
        //3.main线程把money的值增加1000
        System.out.println("主线程开始增加变量money的值!");
        for (int i = 0; i < 1000; i++) {
            MyThread.money.getAndIncrement();//MyThread.money++;
            //增加睡眠1毫秒的目的,是为了提高问题出现的几率
            Thread.sleep(1);
        }
        System.out.println("主线程增加money值结束,睡眠2秒钟,等待Thread-0线程也执行完毕!");
        Thread.sleep(3000);
        System.out.println("最终两个线程都执行完毕,打印money的值:"+ MyThread.money);
    }
}
