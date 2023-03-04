package com.itheima.demo02Recursion;


import java.util.Scanner;

/**
 * 递归练习题
 * 一个数的阶乘
 */
public class Demo05ZiXieTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请任意输入一个数字，自动计算的他的阶乘");
        int i = scanner.nextInt();
        Integer integer = jieCheng(i);
        System.out.println("当前："+i+" 阶乘的值为："+integer);
    }

    /**
     * 阶乘具体运算
     * @param num
     * @return
     */
    public static Integer jieCheng(Integer num){
        if (num == 1){
            return num;
        }
        return num * jieCheng(num-1);
    }
}
