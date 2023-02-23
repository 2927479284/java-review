package com.itheima.demo08sleep;

public class Demo02Sleep {
    public static void main(String[] args) throws InterruptedException {
        //秒表:一秒钟执行一次
        /*for (int i = 1; i <=60 ; i++) {
            System.out.println(i);
            //睡眠1秒钟,在继续执行
            Thread.sleep(1000);
        }*/

        for (int i = 60; i >=1 ; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
