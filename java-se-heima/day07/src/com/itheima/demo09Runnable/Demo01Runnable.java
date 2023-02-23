package com.itheima.demo09Runnable;

/*
    多线程程序创建的第二种方式:实现Runnable接口(重点)
    java.lang.Runnable接口
        Runnable 接口应该由那些打算通过某一线程执行其实例的类来实现。
        类必须定义一个称为 run 的无参数方法。
    java.lang.Thread类 implements Runnable接口
    Thread类的构造法方法:
        Thread(Runnable target) 传递Runnable接口的实现类对象
    实现步骤:
        1.创建一个实现类,实现Runnable接口
        2.在实现类中重写Runnable接口中的run方法,设置线程任务
        3.创建Runnable接口的实现类对象
        4.创建Thread对象,构造方法中传递Runnable接口的实现类对象
        5.调用Thread类中的start,开启新的线程,执行run方法
 */
public class Demo01Runnable {
    public static void main(String[] args) {
        //3.创建Runnable接口的实现类对象
        RunnableImpl run = new RunnableImpl();
        //4.创建Thread对象,构造方法中传递Runnable接口的实现类对象
        Thread thread = new Thread(run);
        //5.调用Thread类中的start,开启新的线程,执行run方法
        thread.start();

        //mian线程在开启新的线程之后,会继续执行main方法中的代码
        for (int i = 1; i <= 20; i++) {
            System.out.println(Thread.currentThread().getName()+"==>"+i);
        }
    }
}
