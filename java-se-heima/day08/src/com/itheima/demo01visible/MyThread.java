package com.itheima.demo01visible;

/*
    高并发问题一_不可见性(重点)
 */
public class MyThread extends Thread{
    //定义一个静态的成员变量,供所有的线程使用
    public static int a = 0;

    @Override
    public void run() {
        System.out.println("Thread-0线程开始执行线程任务了,睡醒2秒钟,等待主线程先执行!");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread-0线程2秒钟之后,睡醒了,把变量a的值修改为1");
        a=1;
        System.out.println("Thread-0线程执行线程任务结束了!"+a);
    }
}
