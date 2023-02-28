package com.itheima.demo05AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo01 {
    public static void main(String[] args) {
        //使用空参数构造方法,创建AtomicInteger对象
        AtomicInteger ai1 = new AtomicInteger();
        System.out.println(ai1.get());//0

        //使用带参数构造方法,创建AtomicInteger对象
        AtomicInteger ai2 = new AtomicInteger(10);
        System.out.println(ai2.get());//10

        //int getAndIncrement(): i++  以原子方式将当前值加1，注意，这里返回的是自增前的值。
        int a = ai2.getAndIncrement();
        System.out.println("a:"+a);//a:10
        System.out.println(ai2.get());//11

        //int incrementAndGet(): ++i  以原子方式将当前值加1，注意，这里返回的是自增后的值。
        int b = ai2.incrementAndGet();
        System.out.println("b:"+b);//b:12
        System.out.println(ai2.get());//12
    }
}
