package com.itheima.demo11List;

import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

/*
    需求:
        1.创建一个被多个线程共享使用静态的ArrayList集合对象
        2.使用Thread-0线程往集合中添加1000个元素
        3.使用main线程往集合中添加1000个元素
        4.统计集合的长度
 */
public class MyThread extends Thread {
    //1.创建一个被多个线程共享使用静态的ArrayList集合对象
    /*
        ArrayList集合:是一个多线程不安全的集合
     */
    //public static ArrayList<Integer> set = new ArrayList<>();

    /*
        java.util.Vector<E>:JDK1.0时期的集合,是最早期的单列集合
        与新 collection 实现不同，Vector 是同步的。
        Vector集合底层采用了synchronized悲观锁,可以保证多线程的安全,但是效率低下
     */
    //public static Vector<Integer> set = new Vector<>();

    /*
        java.util.concurrent.CopyOnWriteArrayList<E>集合 implements List<E>接口
        是JDK1.5之后出现的
        CopyOnWriteArrayList集合底层采用了CAS机制乐观锁,可以保证多线程的安全,效率比Vector高
     */
    public static CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

    @Override
    public void run() {
        //2.使用Thread-0线程往集合中添加1000个元素
        System.out.println("Thread-0线程,执行线程任务了,开始往集合中添加1000个元素!");
        for (int i = 0; i < 1000; i++) {
            list.add(i);//[0,1,2,3...999]
            //增加睡眠1毫秒的目的,提高线程安全问题出现的概率
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread-0线程,添加1000个元素完毕,执行线程任务结束了!");
    }
}
