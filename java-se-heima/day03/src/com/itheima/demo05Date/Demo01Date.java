package com.itheima.demo05Date;

import java.util.Date;

/*
    java.util.Date类:是一个表示时间和日期的类
 */
public class Demo01Date {
    public static void main(String[] args) {
        /*
            (重点)Date类的空参数构造方法
                Date()
                CST(时区):中国标准时间(北京,上海)
         */
        Date d1 = new Date();
        long time1 = d1.getTime();//获取时间戳
        //打印对象名不是地址值,说明Date类重写了Object类的toString
        System.out.println(d1);//Fri Mar 18 11:54:36 CST 2022  当前系统的时间和日期

        /*
           Date类的带参数构造方法
            Date(long date) 参数传递毫秒值,把毫秒值转换为Date日期
         */
        Date d2 = new Date(0L);
        System.out.println(d2);//Thu Jan 01 08:00:00 CST 1970

        Date d3 = new Date(5232131231231L);
        System.out.println(d3);//Thu Oct 20 09:47:11 CST 2135

        /*
            (重点)Date类的成员方法:
                long getTime() 把当前的Date转换为毫秒值
                    (1970 年 1 月 1 日 00:00:00 到 当前时间 2022年3月18日12:01:43)所经历的毫秒值
                    返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
         */
        long time = d1.getTime();
        System.out.println(time);//1647576138881 毫秒
        System.out.println(d2.getTime());//0 毫秒

        /*
            Date类的成员方法:
                void setTime(long time) :参数传递毫秒值,把毫秒转换为Date日期
                    相当于Date类的带参数构造方法
         */
        d1.setTime(0L);
        System.out.println(d1);//Thu Jan 01 08:00:00 CST 1970
    }
}
