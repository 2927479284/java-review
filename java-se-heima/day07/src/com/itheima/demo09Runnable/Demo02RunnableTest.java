package com.itheima.demo09Runnable;

public class Demo02RunnableTest {


    public static void main(String[] args) {
        Demo02RunnableImpl demo02Runnable = new Demo02RunnableImpl();
        Thread thread = new Thread(demo02Runnable);

        thread.start();
        System.out.println("主线程名字："+Thread.currentThread().getName()+" 正在执行");
    }
}
