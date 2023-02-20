package com.itheima.demo02String;

import java.util.Scanner;

/*
    14.String trim() 去掉字符串两端的空格
    "   dsafads ff  ff   asdfda   ".trim()==>"dsafads ff  ff   asdfda"
 */
public class Demo09trim {
    public static void main(String[] args) {
        String s1 = "   dsafads ff  ff   asdfda   ";
        String s2 = s1.trim();
        System.out.println(s1);//"   dsafads ff  ff   asdfda   "
        System.out.println(s2);//"dsafads ff  ff   asdfda"
        System.out.println("---------------------------------------");
        //登录案例
        String regUsername = "jack";
        String regPassword = "1234";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您登录的用户名:");
        String username = sc.nextLine();
        System.out.println("请输入您登录的密码:");
        String password = sc.nextLine();
        //判断用户登录的用户名和密码与注册的是否一致
        if(username.trim().equals(regUsername) && password.trim().equals(regPassword)){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
    }
}
