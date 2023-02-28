package com.itheima.demo13Map;

public class Demo01Map {
    public static void main(String[] args) throws InterruptedException {
        //创建MyThread对象,调用start方法,开启一个新的线程执行run方法
        MyThread mt = new MyThread();
        mt.start();

        //主线程在开启新的线程之后,会继续执行main方法中的代码
        //3.使用main线程往集合中添加1000个元素
        System.out.println("主线程开始往集合中添加1000个元素!");
        for (int i = 1000; i < 2000; i++) {
            MyThread.map.put(i,i);//[1000-1000,1001-1001...1999-1999]
            //增加睡眠1毫秒的目的,提高线程安全问题出现的概率
            Thread.sleep(1);
        }
        System.out.println("主线程添加1000个元素完毕,睡眠3秒钟,等待Thread-0线程执行完毕!");
        Thread.sleep(3000);
        System.out.println("两个线程都执行完毕,打印集合的长度:"+ MyThread.map.size());
        System.out.println(MyThread.map);
    }
}
