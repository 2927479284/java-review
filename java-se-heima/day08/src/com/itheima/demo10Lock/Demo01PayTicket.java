package com.itheima.demo10Lock;

public class Demo01PayTicket {
    public static void main(String[] args) {
        Runnable run = new RunnableImpl();
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t0.start();
        t1.start();
        t2.start();
    }
}
