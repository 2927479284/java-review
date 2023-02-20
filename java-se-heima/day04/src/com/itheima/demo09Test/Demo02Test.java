package com.itheima.demo09Test;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.util.ArrayList;
import java.util.Scanner;

/*
    综合案例2-完成用户注册案例
    用户登录功能我们在日常生活中经常可以遇到
    具体的需求如下:学生练习
    1.定义一个集合,存储用户已经注册过的用户名
    2.使用Scanner获取用户本次输入的用户名
    3.定义一个方法,在方法中判断用户名是否已经被注册
    a.遍历集合获取每一个已经注册过的用户名
    b.使用用户本次输入的用户名和遍历得到的用户名比较
    c.一致,给用提示"你输入的用户名已经被注册了",并结束方法
    d.循环结束了,还没有相同的用户名,把用户名存储到集合中
    e.给用户提示"恭喜您注册成功!"
 */
public class Demo02Test {
    public static void main(String[] args) {
        //1.定义一个集合,存储用户已经注册过的用户名
        ArrayList<String> list = new ArrayList<>();
        list.add("jack");
        list.add("rose");
        list.add("张三");
        list.add("李四");
        //2.使用Scanner获取用户本次输入的用户名
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名:");
        String username = sc.nextLine();
        //调用校验用户名是否注册的方法
        checkUsername(list,username);
    }

    /*
        3.定义一个方法,在方法中判断用户名是否已经被注册
            a.遍历集合获取每一个已经注册过的用户名
            b.使用用户本次输入的用户名和遍历得到的用户名比较
            c.一致,给用提示"你输入的用户名已经被注册了",并结束方法
            d.循环结束了,还没有相同的用户名,把用户名存储到集合中
            e.给用户提示"恭喜您注册成功!"
     */
    public static void checkUsername(ArrayList<String> list,String username){
        //a.遍历集合获取每一个已经注册过的用户名
        for (int i = 0; i < list.size(); i++) {
            String regUsername = list.get(i);
            //b.使用用户本次输入的用户名和遍历得到的用户名比较
            if(username.equals(regUsername)){
                //c.一致,给用提示"你输入的用户名已经被注册了",并结束方法
                System.out.println("你输入的用户名已经被d注册了!");
                return;
            }
        }
        //d.循环结束了,还没有相同的用户名,把用户名存储到集合中
        list.add(username);
        System.out.println(list);
        //e.给用户提示"恭喜您注册成功!"
        System.out.println("恭喜您注册成功!");
    }
}
