package com.itheima.task;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 请编写程序，从控制台接收一个“日期”，格式：yyyy-MM-dd，程序将其转换为：xxxx年xx月xx日的格式输出到控制台。
 */
public class task06 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入格式：yyyy-MM-dd将自动为您转换成：xxxx年xx月xx日");
        String next = scanner.next();

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        Date parse1 = simpleDateFormat1.parse(next);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        String format = simpleDateFormat.format(parse1);
        System.out.println(format);


    }
}
