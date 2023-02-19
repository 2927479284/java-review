package com.itheima.demo07Calendar;

import java.util.Calendar;

/*
    Calendar 类是一个抽象类,我们无法直接创建对象使用
        在Calendar类中有一个静态方法getInstace,可以获取Calendar的子类对象
        static Calendar getInstance() 使用默认时区和语言环境获得一个日历。
 */
public class Demo01Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
    }
}
