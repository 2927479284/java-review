package com.itheima.demo06DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
    请从控制台接收一个生日，例如：2021-02-03，程序要计算并打印用户来到这个世界多少天
    分析:
        1.使用Scanner,获取用户输入的字符串生日
        2.创建Date对象,获取当前日期
        3.创建SimpleDateFormat对象,构造方法中传递指定的模式
        4.使用parse方法,把用户输入的字符串日期,转换为Date日期
        5.把生日Date日期和当前的Date日期转换为毫秒值
        6.把两个毫秒值相减,把结果转换为天
 */
public class Demo05Test {
    public static void main(String[] args) throws ParseException {
        //1.使用Scanner,获取用户输入的字符串生日
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的生日(yyyy-MM-dd):");
        String birthday = sc.next();
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
        System.out.println("恭喜您活了"+day+"天!");
    }
}
