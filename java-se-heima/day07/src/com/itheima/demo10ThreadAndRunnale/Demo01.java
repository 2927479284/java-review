package com.itheima.demo10ThreadAndRunnale;

public class Demo01 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        //a.类继承了Thread,在run方法中设置什么任务,创建子类对象就只能执行什么任务了(耦合性强)
        mt.start();//只能执行打印"哈哈"的任务

        //创建Thread类对象的目的:传递不同的Runnable接口的实现类对象(传递不同的任务),执行不同的任务
        //new Thread(new RunnableImpl()).start();//传递RunnableImpl对象,执行打印"呵呵"的任务
        new Thread(new RunnableImpl2()).start();//传递RunnableImpl2对象,执行打印"嘿嘿"的任务
    }
}
