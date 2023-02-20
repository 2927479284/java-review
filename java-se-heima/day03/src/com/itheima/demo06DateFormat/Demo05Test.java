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
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入您的生日(yyyy-MM-dd):");
//        String birthday = sc.next();
        //2.创建Date对象,获取当前日期
//        Date date = new Date();
        //3.创建SimpleDateFormat对象,构造方法中传递指定的模式
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //4.使用parse方法,把用户输入的字符串日期,转换为Date日期
//        Date birthdayDate = sdf.parse(birthday);
        //5.把生日Date日期和当前的Date日期转换为毫秒值
//        long b1 = birthdayDate.getTime();
//        long b2 = date.getTime();
        //6.把两个毫秒值相减,把结果转换为天
//        long day = (b2-b1)/1000/60/60/24;
//        System.out.println("恭喜您活了"+day+"天!");
        
        
        //1.输入用户出生年月日（用于计算到今天）精确到天
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的出生年月日 例如：1999-1-1");
        String next = scanner.next();
        //2.创建date对象获取现在最新日期
        Date date = new Date();
        //3.
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //4.用户输入的string类型的日期类型转换成date类型
        Date parse = simpleDateFormat.parse(next);
        //5.获取现在最新的时间戳
        long time = date.getTime();//最新
        long time1 = parse.getTime();//用户输入的
        long time2 =  time - time1;//最新的减去用户输入的
        Long tianshu = time2/1000/60/60/24;
        int nian =  date.getYear() -  parse.getYear();
        System.out.println("恭喜您活了 "+nian+" 年");
        System.out.println("恭喜您活了 "+tianshu+" 天");


    }
}
