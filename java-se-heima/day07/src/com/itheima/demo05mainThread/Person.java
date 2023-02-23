package com.itheima.demo05mainThread;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void run(){
        //打印20次姓名
        for (int i = 1; i <= 20; i++) {
            System.out.println(name+"\t"+i);
        }
    }
}
