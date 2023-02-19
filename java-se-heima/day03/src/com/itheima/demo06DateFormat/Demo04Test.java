package com.itheima.demo06DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
    请从控制台接收一个日期，例如：2021-02-03，程序按以下格式打印：2021年02月03日
 */
public class Demo04Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:(yyyy-MM-dd)");
        String s = sc.next();
        //字符串==>Date
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(s);

        //Date==>符合模式的字符串
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String s2 = sdf2.format(date);
        System.out.println(s2);
    }
}
