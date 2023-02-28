package com.itheima.demo14Map;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/*
    比较ConcurrentHashMap和Hashtable的效率
    Hashtable和ConcurrentHashMap有什么区别：
    Hashtable采用的synchronized——悲观锁，效率更低。
    ConcurrentHashMap：采用的CAS 机制——乐观锁，效率更高。
 */
public class MyThread extends Thread{
    //创建一个被多个线程共享使用静态的Hashtable集合(ConcurrentHashMap集合)对象
    //public static Hashtable<Integer,Integer> map = new Hashtable<>();
    public static ConcurrentHashMap<Integer,Integer> map = new ConcurrentHashMap<>();

    @Override
    public void run() {
        //每个线程往集合中存储100000个数据
        long s = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            map.put(i,i);
        }
        long e = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName()+"线程往集合中添加10万个数据耗时:"+(e-s)+"毫秒!");
    }
}
