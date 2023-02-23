package com.itheima.demo09Runnable;

//1.创建一个实现类,实现Runnable接口
public class RunnableImpl implements Runnable{
    //2.在实现类中重写Runnable接口中的run方法,设置线程任务
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(Thread.currentThread().getName()+"==>"+i);
        }
    }
}
