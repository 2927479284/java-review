package com.itheima.demo10Lock;

import java.util.concurrent.locks.ReentrantLock;

/*
    卖票案例:创建3个线程,卖同100张票
    出现了线程安全问题:卖出了重复的票和不存在的票
    解决线程安全问题的第三种方式:使用Lock锁
    java.util.concurrent.locks.Lock接口,是JDK1.5之后出现的
        Lock锁比同步代码块和同步方法使用起来更广泛。
    Lock接口中的成员方法:
        void lock()获取锁。
        void unlock() 释放锁。
    java.util.concurrent.locks.ReentrantLock类 implements Lock接口
    Lock锁的使用步骤:
        1.在成员位置创建ReentrantLock对象
        2.在访问共享数据的代码前调用lock方法,获取锁对象
        3.在访问共享数据的代码后调用unlock方法,释放锁对象
    原理:
        使用lock方法和unlock方法把一段代码锁住,只让一个线程进入执行
 */
public class RunnableImpl implements Runnable {
    //定义一个供3个线程共享的票源
    private int ticket = 100;
    //1.在成员位置创建ReentrantLock对象
    private ReentrantLock l = new ReentrantLock();

    //线程任务:卖票==>票依次减少
    @Override
    public void run() {
        //增加一个死循环:让线程重复卖票
        while (true){
            //2.在访问共享数据的代码前调用lock方法,获取锁对象
            l.lock();
                //对票进行判断大于0在卖票
                if(ticket>0){
                    //卖出每张票需要10毫秒
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"现在正在卖第"+ticket+"张票!");
                    ticket--;
                }
            //3.在访问共享数据的代码后调用unlock方法,释放锁对象
            l.unlock();
            if(ticket<=0){
                break;
            }
        }
    }
}
