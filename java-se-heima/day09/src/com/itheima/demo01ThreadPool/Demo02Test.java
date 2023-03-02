package com.itheima.demo01ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    综合练习一
        用线程池同时洗衣服和做饭两个任务
    分析:
        1.获取一个线程池
        2.在线程池中取出一个线程,完成洗衣服的任务
        3.在线程池中取出一个线程,完成做饭的任务
 */
public class Demo02Test {
    public static void main(String[] args) {
        //1.获取一个线程池
        ExecutorService es = Executors.newFixedThreadPool(100);
        //2.在线程池中取出一个线程,完成洗衣服的任务
        es.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程执行洗衣服的任务");
            }
        });
        //3.在线程池中取出一个线程,完成做饭的任务
        es.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程执行做饭的任务");
            }
        });
    }
}
