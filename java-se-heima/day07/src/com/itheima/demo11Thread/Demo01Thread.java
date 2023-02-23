package com.itheima.demo11Thread;

/*
    匿名内部类的方式实现多线程程序(重点)
    作用:简化代码,不用在定义子类|实现类了
        把子类继承父类,重写父类中的方法,创建子类对象,合成一步完成
        把实现类实现接口,重写接口中的方法,创建实现类对象,合成一步完成
    格式:new 爹(亲爹==>父类,干爹==>接口)
        new 父类|接口(){
            重写父类|接口中的方法
        };
    记住:匿名内部类最终产生的是一个子类|实现类对象
 */
public class Demo01Thread {
    public static void main(String[] args) {
        //父类: Thread
        //new MyThread().start();
        new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }.start();

        //接口: Runnable接口
        //Runnable r = new RunnaleImpl();
        //new Thread(r).start();
        //多态 接口 = 匿名实现类对象
        Runnable r = new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        new Thread(r).start();

        //new Thread(new RunnaleImpl()).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
    }
}
