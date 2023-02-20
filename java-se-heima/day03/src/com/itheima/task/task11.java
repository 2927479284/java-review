package com.itheima.task;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * 请定义一个集合：List<Integer>，并循环向集合中添加1千万个数字，请计算这个循环运行的时间，并打印。
 */
public class task11 {

    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            integers.add(i);
        }
        long end = System.currentTimeMillis();
        long i = end-begin;
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(i));
        int i1 = instance.get(Calendar.SECOND);
        System.out.println("过了多少："+i1+" 秒");
    }
}
