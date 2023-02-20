package com.itheima.demo09Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 工具类
 */
public class Utils {
    /** 定义一个公共的静态方法
     * birthdayToAge(String birthday)可以通过一个字符串的生日计算出年龄。(每年按365天计算)
     * @param birthday
     * @return
     * @throws ParseException
     */
    public static int birthdayToAge(String birthday) throws ParseException {
        //2.创建Date对象,获取当前日期
        Date date = new Date();
        //3.创建SimpleDateFormat对象,构造方法中传递指定的模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //4.使用parse方法,把用户输入的字符串日期,转换为Date日期
        Date birthdayDate = sdf.parse(birthday);
        //5.把生日Date日期和当前的Date日期转换为毫秒值
        long b1 = birthdayDate.getTime();
        long b2 = date.getTime();
        //6.把两个毫秒值相减,把结果转换为天
        long day = (b2-b1)/1000/60/60/24;
        //把天转换为年,在把年返回
        return (int)day/365;
    }

    public static void main(String[] args) throws ParseException {
        int age = birthdayToAge("2000-2-4");
        System.out.println(age);
    }
}
