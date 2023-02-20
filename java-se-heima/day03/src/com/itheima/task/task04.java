package com.itheima.task;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 请编写程序，从控制台分别接收两个“生日”，格式：yyyy年MM月dd日，程序要能够计算并打印：第一个生日大于/小于第二个生日。
 * 	注意：要求验证生日日期必须早于当前日期
 */
public class task04 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的生日(yyyy年MM月dd日)：");
        String next1 = scanner.next();
        System.out.println("请输入您要计算的日期(yyyy年MM月dd日)：");
        String next2 = scanner.next();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date parse1 = simpleDateFormat.parse(next1);//出生日期
        Date parse2 = simpleDateFormat.parse(next2);//计算的日期
        if (parse1.getTime()>parse2.getTime()){
            System.out.println("生日日期必须早于计算日期");
        }else {
            long time = parse2.getTime() - parse1.getTime();
            //7200秒/60=120分钟
            //120分钟/60=2小时
            //2小时/24=0.08333333...
            Integer day = Math.toIntExact(time / 1000 / 60 / 60 / 24);// 秒÷分÷时
            System.out.println("你已存活："+day+" 天");
        }
    }
}
