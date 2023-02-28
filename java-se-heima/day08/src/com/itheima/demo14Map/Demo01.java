package com.itheima.demo14Map;

public class Demo01 {
    public static void main(String[] args) {
        //开启1000个线程,每个线程往集合中存储100000个数据
        for (int i = 0; i < 1000; i++) {
            new MyThread().start();
        }
    }
}
