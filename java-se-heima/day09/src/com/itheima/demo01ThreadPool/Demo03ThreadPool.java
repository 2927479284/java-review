package com.itheima.demo01ThreadPool;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.*;

/*
    java.util.concurrent.Callable<V>接口:是一个含有泛型的接口,用于设置线程任务
        Callable 接口类似于 Runnable,但是 Runnable 不会返回结果 Callable有返回结果
    在实现接口的同时,需要指定接口的泛型
        指定接口的泛型的Integer类型,那么call方法就可以返回一个Integer类型的值
        指定接口的泛型的String类型,那么call方法就可以返回一个String类型的值
        ...
    使用线程池执行Callable接口的线程任务(重点)
        Future<T> submit(Callable<T> task)
            提交一个返回值的任务用于执行，返回一个表示任务的未决结果的 Future。
    java.util.concurrent.Future<V>接口
        V get() 用于获取Callable接口中call方法的返回值
    ----------------------------------------------------------------------
    使用步骤
    1.使用线程池工厂类Executors中的静态方法newFixedThreadPool创建一个包含指定线程数量的线程池
    2.使用线程池中的方法submit,提交Callable接口的线程任务,执行线程任务
    3.获取Callable接口的返回值
 */
public class Demo03ThreadPool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //1.使用线程池工厂类Executors中的静态方法newFixedThreadPool创建一个包含指定线程数量的线程池
        ExecutorService es = Executors.newFixedThreadPool(3);
        //2.使用线程池中的方法submit,提交Callable接口的线程任务,执行线程任务
        Future<Integer> f1 = es.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                //返回一个1-100之间的随机数
                Random r = new Random();
                int a = r.nextInt(100) + 1;
                return a;
            }
        });
        //3.获取Callable接口的返回值
        //System.out.println(f1);//java.util.concurrent.FutureTask@14ae5a5
        System.out.println(f1.get());

        Future<String> f2 = es.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("请输入一个字符串:");
                String s = new Scanner(System.in).next();
                return s;
            }
        });
        System.out.println(f2.get());
    }
}
