package com.itheima.demo01Integer;

import java.util.Scanner;

/*
    需求:学生练习时间5分钟
        使用键盘输入获取一个字符串类型的分数 “99.9”
        把字符串类型的分数转换为double类型
        把转换后的分数+5分在控制台输出  104.9
    分析
    1.键盘输入使用Scanner,获取字符串使用next方法
    2.把字符串类型的分数转换为double类型,可以使用Double类的parseDouble方法
 */
public class Demo04Test {
    public static void main(String[] args) {
        //使用键盘输入获取一个字符串类型的分数 “99.9”
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的分数:");
        String s = sc.next();
        //把字符串类型的分数转换为double类型
        double score = Double.parseDouble(s);
        //把转换后的分数+5分在控制台输出  104.9
        System.out.println(score+5);
    }
}
