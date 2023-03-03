package com.itheima.demo02Recursion;

/*
    练习:使用递归计算1 ~ n的和
 */
public class Demo02Test {
    public static void main(String[] args) {
        int s = getSum(3);
        System.out.println(s);
    }

    /*
        定义一个使用递归求和的方法
     */
    public static int getSum(int n){
        //递归的结束的条件:获取到1的时候结束
        if(n==1){
            return 1;
        }
        //递归的目的:获取下一个被加的数字n-1
        return n+getSum(n-1);
    }
}
