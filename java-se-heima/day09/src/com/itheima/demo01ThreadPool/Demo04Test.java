package com.itheima.demo01ThreadPool;

import java.util.Scanner;
import java.util.concurrent.*;

/*
    线程池的练习
    需求: 使用线程池方式执行任务,返回1-n的和
    分析: 因为需要返回求和结果,所以使用Callable方式的任务
    步骤:
        1.获取一个线程池
        2.使用Scanner获取用户键盘输入一个整数
        3.使用线程池执行获取1-n和的线程任务,获取和
        4.把和取出
 */
public class Demo04Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //1.获取一个线程池
        ExecutorService es = Executors.newFixedThreadPool(3);
        //2.使用Scanner获取用户键盘输入一个整数
        System.out.println("请输入一个整数:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //3.使用线程池执行获取1-n和的线程任务,获取和
        Future<Integer> f = es.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                //计算1-n的和
                int sum = 0;
                for (int i = 1; i <=n ; i++) {
                    sum+=i;
                }
                return sum;
            }
        });
        //4.把和取出
        System.out.println(f.get());
    }
}
