package com.itheima.demo02atomic;

/*
    高并发问题三_非原子性(重点)
    需求:
        1.定义多线程共享的静态变量money
        2.Thread-0线程把money的值增加10000
        3.main线程把money的值增加10000
        4.查看money的最终结果
 */
public class MyThread extends Thread{
    //1.定义多线程共享的静态变量money
    public static int money=0;

    @Override
    public void run() {
        //2.Thread-0线程把money的值增加10000
        System.out.println("Thread-0线程开始执行线程任务,增加money的值!");
        for (int i = 0; i < 10000; i++) {
            money++;
        }
        System.out.println("Thread-0线程执行线程任务结束!");
    }
}
