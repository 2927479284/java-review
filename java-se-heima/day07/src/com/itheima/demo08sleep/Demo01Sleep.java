package com.itheima.demo08sleep;

/*
    Thread类的静态方法:
    static void sleep(long millis)
          在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），线程睡醒了继续执行
 */
public class Demo01Sleep {
    public static void main(String[] args) {
        System.out.println("让以下程序睡眠5秒钟之后在执行...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("5秒钟到了,程序开始执行!");
    }
}
