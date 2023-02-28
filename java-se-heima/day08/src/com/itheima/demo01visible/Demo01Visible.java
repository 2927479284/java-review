package com.itheima.demo01visible;

public class Demo01Visible {
    public static void main(String[] args) throws InterruptedException {
        //创建Thread的子类对象
        MyThread mt = new MyThread();
        //调用start方法,开启一个新的线程,执行run方法
        mt.start();

        //主线程在开启Thread-0线程之后,会继续执行main方法中的代码
        System.out.println("主线程,执行一个死循环");
        while (true){
            if(MyThread.a==1){
                System.out.println("主线程判断变量a的值==1,结束死循环!");
                break;
            }
            //Thread.sleep(10);
            //System.out.println("主线程在执行死循环!");
        }
    }
}
