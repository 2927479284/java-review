package com.itheima.demo07getThreadName;

public class Demo01GetThreadName {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
        //多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。
        //mt.start();//IllegalThreadStateException:非常线程状态异常

        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();

        //在main方法,可以主线程的名称
        System.out.println(Thread.currentThread().getName());
    }
}
