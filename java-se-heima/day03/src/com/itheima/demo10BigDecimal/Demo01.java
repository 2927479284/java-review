package com.itheima.demo10BigDecimal;

public class Demo01 {
    public static void main(String[] args) {
        double d1 = 0.09;
        double d2 = 0.01;
        //浮点数(小数 float,double)是一个不精确的小数,使用不精确的小数参与计算,结果也是不精确的
        System.out.println(d1+d2);//0.09999999999999999
    }
}
