package com.itheima.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 	请编写程序，从控制台接收一个“生日”，格式：yyyy-MM-dd，程序要能够计算并打印他来到世界xx天。
 * 	注意：“生日”必须早于“当前日期”，否则提示：生日必须早于当前日期！
 */
public class task03 {

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的出生年月日yyyy-MM-dd：");
        String next = scanner.next();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse(next);
        Date date = new Date();//当前时间
        Boolean flag = date.getTime() - parse.getTime() > 0;
        if (!flag){
            System.out.println("出生日期不能大于当前日期");
        }else {
            long time = date.getTime() - parse.getTime();
            //7200秒/60=120分钟
            //120分钟/60=2小时
            //2小时/24=0.08333333...
            Integer day = Math.toIntExact(time / 1000 / 60 / 60 / 24);// 秒÷分÷时
            System.out.println("你已存活："+day+" 天");
        }
    }
}
