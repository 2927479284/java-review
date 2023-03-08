package com.itheima.demo05test;

import com.itheima.demo02.Person;

import java.util.Date;

public class Demo01Person {
    public static void main(String[] args) {
        //使用demo02包中的Person类创建对象
        Person p1 = new Person();

        //使用demo03包中的Person类创建对象:全类名
        com.itheima.demo03.Person p2 = new com.itheima.demo03.Person();

        //使用demo04包中的Person类创建对象:全类名
        com.itheima.demo04.Person p3 = new com.itheima.demo04.Person();

        Date d1 = new Date();
        java.sql.Date d2 = new java.sql.Date(0L);
    }
}
