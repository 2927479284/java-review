package com.itheima.demo13Map;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/*
    需求:
        1.创建一个被多个线程共享使用静态的HashMap集合对象
        2.使用Thread-0线程往集合中添加1000个元素
        3.使用main线程往集合中添加1000个元素
        4.统计集合的长度
 */
public class MyThread extends Thread {
    //1.创建一个被多个线程共享使用静态的HashMap集合对象
    /*
        HashMap集合:是一个多线程不安全的集合
     */
    //public static HashMap<Integer,Integer> map = new HashMap<>();

    /*
        java.util.Hashtable<K,V>:JDK1.0时期的集合,是最早期的双列集合
        不像新的 collection 实现，Hashtable 是同步的
        Hashtable集合底层采用了synchronized悲观锁,可以保证多线程的安全,但是效率低下
     */
    //public static Hashtable<Integer,Integer> map = new Hashtable<>();

    /*
        java.util.concurrent.ConcurrentHashMap<K,V><E>集合
        是JDK1.5之后出现的
        ConcurrentHashMap集合底层采用了CAS机制乐观锁,可以保证多线程的安全,效率比Hashtable高
     */
    public static ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap<>();

    @Override
    public void run() {
        //2.使用Thread-0线程往集合中添加1000个元素
        System.out.println("Thread-0线程,执行线程任务了,开始往集合中添加1000个元素!");
        for (int i = 0; i < 1000; i++) {
            map.put(i,i);//[0-0,1-1,2-2,3-3...999-999]
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
