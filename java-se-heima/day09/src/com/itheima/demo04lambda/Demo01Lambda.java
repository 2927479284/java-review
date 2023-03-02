package com.itheima.demo04lambda;

/*
    使用Lambda表达式简化多线程匿名内部类
 */
public class Demo01Lambda {
    public static void main(String[] args) {
        //使用匿名内部类的方式,实现多线程程序
        new Thread(()->System.out.println("我被执行了")).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程正在执行线程任务!");
            }
        }).start();

        //使用Lambda表达式,简化匿名内部类,实现多线程程序
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"线程正在执行线程任务!");
        }).start();

        Person[] arr = new Person[3];
    }
}
