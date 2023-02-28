package com.itheima.demo03volatileVisible;

/*
    高并发问题一_不可见性(重点)
 */
public class MyThread extends Thread{
    //定义一个静态的成员变量,供所有的线程使用
    public static volatile int a = 0;

    @Override
    public void run() {
        System.out.println("Thread-0线程开始执行线程任务了,睡醒2秒钟,等待主线程先执行!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread-0线程2秒钟之后,睡醒了,把变量a的值修改为1");
        /*
            变量a被volatile关键字修饰
            作用:当变量a的值被改变之后,会使所有的变量a的副本都失效,其他线程想要使用变量a的值,必须从新获取
         */
        a=1;
        System.out.println("Thread-0线程执行线程任务结束了!"+a);
    }
}
