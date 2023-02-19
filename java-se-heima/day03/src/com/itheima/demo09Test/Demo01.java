package com.itheima.demo09Test;

import java.util.Scanner;

/*
    超市管理系统类结构设计
    我们需要为某超市设计一套系统，需求如下：
    1.目前公司有以下几种人员：售货员(Sales)、收银员(Cashier)
    2.所有的人员都要记录以下信息：
        属性：姓名(String)、性别(String)、出生日期(String)、年龄(int)
             (注：出生日期需要从控制台接收。且用户只能输入日期，不能输入年龄; 输出只能输出年龄，不能输出生日)
        方法：工作(work)
        售货员的工作：销售货物
              收银员的工作：收钱
    3.请定义Utils类，并定义”公有、静态方法”
      birthdayToAge(String birthday)可以通过一个字符串的生日
      计算出年龄。(每年按365天计算)
    4.请在父类的getAge()方法中调用birthdayToAge()方法，用于计算此人的年龄。
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建Sales对象
        Sales sales = new Sales();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名:");
        String name = sc.next();
        System.out.println("请输入性别:");
        String sex = sc.next();
        System.out.println("请输入出生日期(yyyy-MM-dd):");
        String birthday = sc.next();
        sales.setName(name);
        sales.setSex(sex);
        sales.setBirthday(birthday);
        System.out.println(sales);//Worker{name='jack', sex='男', birthday='2000-2-2', age=22}
    }
}
