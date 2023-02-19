package com.itheima.demo06DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
    DateFormat类的成员方法:
	    String format(Date date)  参数传递Date日期,把日期格式化为符合模式的字符串
	使用步骤:
	    1.创建SimpleDateFormat对象,构造方法中传递指定的模式
	    2.使用SimpleDateFormat对象中的方法format,把日期格式化为符合模式的字符串
 */
public class Demo01Format {
    public static void main(String[] args) {
        //1.创建SimpleDateFormat对象,构造方法中传递指定的模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //2.使用SimpleDateFormat对象中的方法format,把日期格式化为符合模式的字符串
        Date date = new Date();
        System.out.println(date);//Fri Mar 18 14:48:35 CST 2022
        String s = sdf.format(date);
        System.out.println(s);//2022-03-18 14:49:00

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String s2 = sdf2.format(date);
        System.out.println(s2);//2022年03月18日 14时49分53秒

        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日");
        String s3 = sdf3.format(date);
        System.out.println(s3);//2022年03月18日
    }
}
