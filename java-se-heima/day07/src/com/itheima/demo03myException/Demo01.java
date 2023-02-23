package com.itheima.demo03myException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
    注册的案例:
    1.定义一个集合,存储用户已经注册过的用户名
    2.使用Scanner获取用户本次输入的用户名
    3.定义一个方法,在方法中判断用户名是否已经被注册
        a.遍历集合获取每一个已经注册过的用户名
        b.使用用户本次输入的用户名和遍历得到的用户名比较
        c.一致,已经注册过了,抛出RegisterException异常,告之用户您输入的用户名已经被注册了
        d.循环结束了,还没有相同的用户名,把用户名存储到集合中
        e.给用户提示"恭喜您注册成功!"
 */
public class Demo01 {
    public static void main(String[] args) throws RegisterException {
        //1.定义一个集合,存储用户已经注册过的用户名
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"jack","rose","汤姆","杰瑞");
        //2.使用Scanner获取用户本次输入的用户名
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名:");
        String name = sc.next();
        //调用校验的方法
        checkName(list,name);
    }

    //3.定义一个方法,在方法中判断用户名是否已经被注册
    public static void checkName(ArrayList<String> list,String name) throws RegisterException {
        //a.遍历集合获取每一个已经注册过的用户名
        for (String n : list) {
            //b.使用用户本次输入的用户名和遍历得到的用户名比较
            if(name.equals(n)){
                //c.一致,已经注册过了,抛出RegisterException异常,告之用户您输入的用户名已经被注册了
                //RegisterException是一个编译期异常,我们抛出异常之后,必须处理异常
                throw new RegisterException("您输入的用户名["+name+"]已经被注册了!");
            }
        }
        //d.循环结束了,还没有相同的用户名,把用户名存储到集合中
        list.add(name);
        System.out.println(list);
        //e.给用户提示"恭喜您注册成功!"
        System.out.println("恭喜您注册成功!");
    }
}
