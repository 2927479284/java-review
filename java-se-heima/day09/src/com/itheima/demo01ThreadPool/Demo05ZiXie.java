package com.itheima.demo01ThreadPool;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 自写
 */
public class Demo05ZiXie {

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(10);//创建一个新的线程池子

        //1.实现Runnable 接口的线程
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("我是实现runnable接口的线程");
            }
        });

        //2.实现第二种线程的例子(带返回值)
        Future<String> submit = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "张三李四王五赵六";
            }
        });
        System.out.println(submit.get());

        //2.1通过键盘获取用户输入的值并打印（输出结果为String）
        Future<Object> submit1 = executorService.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入数据进行打印：");
                return scanner.next();
            }
        });
        System.out.println("用户输入的值："+submit1.get());
    }
}
