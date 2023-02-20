package com.itheima.task;

import java.util.Calendar;

/**
 * 请编写程序，使用Calendar类获取日历对象，并分别获取年、月、日、小时、分、秒，并将它们打印到控制台。
 */
public class task07 {

    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        int year = instance.get(Calendar.YEAR);
        int month = instance.get(Calendar.MONTH);
        int date = instance.get(Calendar.DATE);
        int hour = instance.get(Calendar.HOUR);
        int minute = instance.get(Calendar.MINUTE);
        int second = instance.get(Calendar.SECOND);

        System.out.println("年："+year);
        System.out.println("月："+month);
        System.out.println("日："+date);
        System.out.println("时："+hour);
        System.out.println("分："+minute);
        System.out.println("秒："+second);
    }
}
