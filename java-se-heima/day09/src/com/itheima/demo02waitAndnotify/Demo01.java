package com.itheima.demo02waitAndnotify;

/*
    需求:
        使用线程一调用wait方法,进入到无限等待状态
        使用线程二调用notify方法,唤醒等待的线程一
 */
public class Demo01 {
    public static void main(String[] args) throws InterruptedException {
        //定义一个锁对象,供两个线程使用
        String lock = "我是一个锁";

        //使用线程一调用wait方法,进入到无限等待状态
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程一开始执行线程任务了");
                //同步代码块
                synchronized (lock){
                    System.out.println("使用线程一调用wait方法,进入到无限等待状态");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("线程一被线程二唤醒了,会继续执行run方法!");
            }
        }).start();

        //让程序睡眠10秒钟
        Thread.sleep(10000);

        //使用线程二调用notify方法,唤醒等待的线程一
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程二开始执行线程任务了");
                //同步代码块
                synchronized (lock){
                    System.out.println("使用线程二调用notify方法,唤醒等待的线程一");
                    lock.notify();
                }
                System.out.println("线程二执行线程任务结束了");
            }
        }).start();
    }
}
