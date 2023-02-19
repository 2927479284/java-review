package com.itheima.demo07Calendar;

import java.util.Calendar;
import java.util.Date;

public class Demo02Calendar {
    public static void main(String[] args) {
        show04();
    }

    /*
        Date getTime() 把日历对象转换为日期Date对象
     */
    private static void show04() {
        //获取Calendar对象
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);//Fri Mar 18 16:18:00 CST 2022
    }

    /*
        void add(int field, int amount)  把日历字段增加|减少指定的值
        参数:
            int field:传递日历字段(年,月,日...)
            int amount:增加|减少指定的值
                正数:增加
                负数:减少
     */
    private static void show03() {
        //获取Calendar对象
        Calendar c = Calendar.getInstance();
        //把2022年增加5年
        c.add(Calendar.YEAR,5);
        //把3月增加3月
        c.add(Calendar.MONTH,3);
        //把日-10天
        c.add(Calendar.DATE,-10);

        //获取年
        int year = c.get(Calendar.YEAR);
        System.out.println(year+"年");//2027年

        //获取月
        int month = c.get(Calendar.MONTH);
        System.out.println((month+1)+"月");//6月

        //获取日
        int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date+"日");//8日
    }

    /*
        void set(int field, int value) 将给定的日历字段设置为给定值。
            参数:
                int field:传递日历字段(年,月,日...)
                int value:设置的值
        void set(int year, int month, int date) 可以同时设置年月日
     */
    private static void show02() {
        //获取Calendar对象
        Calendar c = Calendar.getInstance();
        //把年设置为2008年
        c.set(Calendar.YEAR,2008);
        //把月份设置为8月
        c.set(Calendar.MONTH,7);
        //把日设置为8日
        c.set(Calendar.DATE,8);

        c.set(9999,8,9);

        //获取年
        int year = c.get(Calendar.YEAR);
        System.out.println(year+"年");//2008年

        //获取月
        int month = c.get(Calendar.MONTH);
        System.out.println((month+1)+"月");

        //获取日
        int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date+"日");

    }

    /*
        int get(int field) 返回给定日历字段的值。
        参数:
            int field:传递日历字段(年,月,日...)
     */
    private static void show01() {
        //获取Calendar对象
        Calendar c = Calendar.getInstance();
        //获取年
        //int year = c.get(1);
        int year = c.get(Calendar.YEAR);
        System.out.println(year+"年");//2022年

        //获取月
        int month = c.get(Calendar.MONTH);
        System.out.println((month+1)+"月");

        //获取日
        //int date = c.get(Calendar.DATE);
        int date = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(date+"日");
    }
}
