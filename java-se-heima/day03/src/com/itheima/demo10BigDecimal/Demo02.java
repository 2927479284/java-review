package com.itheima.demo10BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;


/**
 * 使用BigDecimal实现小数的+,-,*,/,%的精确计算
 */
public class Demo02 {
    public static void main(String[] args) {
        //创建两个BigDecimal对象
        BigDecimal b1 = new BigDecimal("0.09");
        BigDecimal b2 = new BigDecimal("0.01");
        //加法:BigDecimal add(BigDecimal augend) 返回一个 BigDecimal，其值为 (this + augend)，
        BigDecimal add = b1.add(b2);//b1+b2
        System.out.println(add);//0.10

        //减法:BigDecimal subtract(BigDecimal subtrahend) 返回一个 BigDecimal，其值为 (this - subtrahend)
        BigDecimal sub = b1.subtract(b2);//b1-b2
        System.out.println(sub);//0.08

        //乘法:BigDecimal multiply(BigDecimal multiplicand) 返回一个 BigDecimal，其值为 (this × multiplicand)，
        BigDecimal mul = b1.multiply(b2);//b1*b2
        System.out.println(mul);//0.0009

        //除法:1.BigDecimal divide(BigDecimal divisor) 返回一个 BigDecimal，其值为 (this / divisor)
        BigDecimal div = b1.divide(b2);//b1/b2
        System.out.println(div);//9

        BigDecimal b3 = new BigDecimal("10.0");
        BigDecimal b4 = new BigDecimal("3.0");
        //BigDecimal d1 = b3.divide(b4);//ArithmeticException:除法除不尽,会抛出数学计算异常
        //System.out.println(d1);

        /*
            2.BigDecimal divide(BigDecimal divisor, int scale, RoundingMode roundingMode)
                返回一个 BigDecimal，其值为 (this / divisor)，其标度为指定标度。
                参数:
                    divisor - 此 BigDecimal 要除以的值。
                    scale - 保留的小数位数 2==>3.33    3==>3.333
                    roundingMode - 要应用的舍入模式。
                        RoundingMode.HALF_UP:四舍五入模式 3.333333...==>3.33  3.6666666...==>3.67
         */
        BigDecimal d2 = b3.divide(b4, 2, RoundingMode.HALF_UP);
        System.out.println(d2);//3.33

        BigDecimal b5 = new BigDecimal("11.0");
        BigDecimal b6 = new BigDecimal("3.0");
        BigDecimal d3 = b5.divide(b6, 3, RoundingMode.HALF_UP);
        System.out.println(d3);//3.667

        //取余数:BigDecimal remainder(BigDecimal divisor)：当前对象 % 参数对象，返回一个新的BigDecimal
        BigDecimal r = b5.remainder(b6);//b5%b6
        System.out.println(r);//2.0
    }
}
