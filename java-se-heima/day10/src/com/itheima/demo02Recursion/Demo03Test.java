package com.itheima.demo02Recursion;

/*
    练习:递归求阶乘
    公式:1-n的和就相当于n-1的和
    5的阶乘5!=5*4*3*2*1;
    n的阶乘n!=n*(n-1)*(n-2)*(n-3)*...1;
 */
public class Demo03Test {
    public static void main(String[] args) {
        int jc = jieCheng(5);
        System.out.println(jc);
    }

    /*
        定义一个使用递归计算阶乘的方法
        当我们频繁的调用一个方法,方法的主体不变,方法的参数每次发生变化,就可以使用递归
     */
    public static int jieCheng(int n){//5,4,3,2,1
        //递归结束的条件:获取到1的时候结束
        if(n==1){
            return 1;
        }
        //递归的目的:获取下一个被乘的数字n-1
        return n*jieCheng(n-1);
    }
}
