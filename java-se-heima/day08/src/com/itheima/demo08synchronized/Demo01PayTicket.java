package com.itheima.demo08synchronized;

import java.util.Date;

public class Demo01PayTicket {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        Date date = new Date(l);
        System.out.println("开始执行时间:"+date);
        Runnable run = new RunnableImpl();
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t0.start();
        t1.start();
        t2.start();

        System.out.println("结束执行时间:"+date);
    }
}
