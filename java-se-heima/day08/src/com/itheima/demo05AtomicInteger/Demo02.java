package com.itheima.demo05AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class Demo02 {

    public static void main(String[] args) {

        AtomicInteger atomicInteger = new AtomicInteger(10);
        System.out.println(atomicInteger.get());


        int andIncrement = atomicInteger.getAndIncrement();//相当于i++ 先返回值在++
        System.out.println(andIncrement);//0
        System.out.println(atomicInteger.get());//1
    }
}
