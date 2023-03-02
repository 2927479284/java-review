package com.itheima.demo01ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    使用线程池执行Runnable接口的线程任务(重点)
    1.使用线程池工厂类Executors中的静态方法newFixedThreadPool创建一个包含指定线程数量的线程池
    2.创建一个Runnable接口的实现类,重写run方法,设置线程任务(匿名内部类)
    3.使用线程池ExecutorService中的方法submit,提交线程任务(Runnable接口的实现类),执行线程任务
        submit方法会[自动]从线程池中取出一个线程,执行线程任务,执行完毕[自动]把线程归还给线程池
 */
public class Demo01ThreadPool {
    public static void main(String[] args) {
        //1.使用线程池工厂类Executors中的静态方法newFixedThreadPool创建一个包含指定线程数量的线程池
        ExecutorService es = Executors.newFixedThreadPool(3);

        //3.使用线程池ExecutorService中的方法submit,提交线程任务(Runnable接口的实现类),执行线程任务
        es.submit(new RunnableImpl());//pool-1-thread-1线程开始执行线程任务了!
        es.submit(new RunnableImpl());//pool-1-thread-2线程开始执行线程任务了!
        es.submit(new RunnableImpl());//pool-1-thread-2线程开始执行线程任务了!
        es.submit(new RunnableImpl());//pool-1-thread-3线程开始执行线程任务了!

        //线程任务:可以使用匿名内部类
        es.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程开始执行线程任务了!");
            }
        });

        /*
            void shutdown() 用于销毁线程池,线程池一旦销毁,就不能在使用了
         */
        //es.shutdown();

        //es.submit(new RunnableImpl());//RejectedExecutionException:拒绝执行异常
    }
}
