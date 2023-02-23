package com.itheima.demo06Thread;

/*
    多线程程序创建的第一种方式:继承Thread类(重点)
    java.lang.Thread类:是一个描述线程的类
        线程 是程序中的执行线程。Java 虚拟机允许应用程序并发地运行多个执行线程。
        每个线程都有一个优先级，高优先级线程的执行优先于低优先级线程。
    实现步骤:
        1.创建一个类继承Thread类
        2.在子类中重写Thread类中的run方法,设置线程任务(开启线程的目的:查杀病毒,清理垃圾,打印20次Hello)
        3.创建Thread类的子类对象
        4.调用继承自Thread类中的start方法,开启一个新的线程,执行run方法
    ---------------------------------------------------------------------------
    void start() 使该线程开始执行；Java 虚拟机调用该线程的 run 方法。
        1).启动start方法后,结果是两个线程并发地运行；
            当前线程（主线程:执行main方法）和
            另一个线程（开启的新线程:执行其 run 方法）。
        2).多次启动一个线程是非法的。特别是当线程已经结束执行后，不能再重新启动。
            一个线程对象只能执行一次start方法

 */
public class Demo01Thread {
    public static void main(String[] args) {
        //3.创建Thread类的子类对象
        MyThread mt = new MyThread();
        //4.调用继承自Thread类中的start方法,开启一个新的线程,执行run方法
        mt.start();

        //主线程在开启新的线程之后,会继续执行main方法中的代码
        for (int i = 1; i <= 20; i++) {
            System.out.println("main==>"+i);
        }
    }
}
