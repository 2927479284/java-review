package com.itheima.demo07getThreadName;

/*
    获取线程的名称
    线程是有名字的
        主线程:main
        新的线程:Thread-0,Thread-1,Thread-2
    1.可以使用Thread类中的方法getName获取线程的名称
        String getName() 返回该线程的名称。
    2.可以使用Thread类中的[静态方法],先获取到当前正在执行的线程(Thread对象)
        static Thread currentThread() 返回对当前正在执行的线程对象的引用。
      在通过当前的线程Thread对象,在调用getName方法获取名称
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        //String name = getName();
        //System.out.println(name);

        //Thread t = Thread.currentThread();
        //String name = t.getName();
        //System.out.println(name);
        //链式编程
        System.out.println(Thread.currentThread().getName());
    }
}
