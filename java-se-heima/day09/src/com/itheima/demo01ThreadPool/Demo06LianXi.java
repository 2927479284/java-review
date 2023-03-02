package com.itheima.demo01ThreadPool;


import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 练习题
 *     需求: 使用线程池方式执行任务,返回1-n的和
 *     分析: 因为需要返回求和结果,所以使用Callable方式的任务
 *     步骤:
 *         1.获取一个线程池
 *         2.使用Scanner获取用户键盘输入一个整数
 *         3.使用线程池执行获取1-n和的线程任务,获取和
 *         4.把和取出
 */
public class Demo06LianXi {

    public static void main(String[] args)  throws Exception{
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的值：");
        Integer next = scanner.nextInt();

        Future<Integer> submit = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Integer sum = 0;
                for (int i = 0; i <= next; i++) {
                    sum = sum+i;
                }
                return sum;
            }
        });
        System.out.println("计算的总值："+submit.get());
    }
}
