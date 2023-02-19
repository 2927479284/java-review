package com.itheima.demo06DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    DateFormat类的成员方法:
        parse:解析
	    Date parse(String source) 参数传递字符串,把符合模式的字符串解析为Date日期
	使用步骤:
	    1.创建SimpleDateFormat对象,构造方法中传递指定的模式
	    2.使用SimpleDateFormat中的方法parse,把符合模式的字符串解析为Date日期
 */
public class Demo02parse {
    public static void main(String[] args) throws ParseException {
        //1.创建SimpleDateFormat对象,构造方法中传递指定的模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        /*
            2.使用SimpleDateFormat中的方法parse,把符合模式的字符串解析为Date日期
                public Date parse(String source) throws ParseException
                parse方法使用throws关键字声明抛出了ParseException解析异常
                如果我们调用parse传递字符串参数"2022-3-18"和构造方法中模式不匹配,程序就会抛出异常
             解决:
                调用了一个抛出异常的方法,需要把异常解决:鼠标放在红线处,alt+回车,选择第一个
         */
        //Date date = sdf.parse("2022-318");//ParseException: Unparseable date: "2022-318"
        Date date = sdf.parse("2022-3-18");//Fri Mar 18 00:00:00 CST 2022
        System.out.println(date);
    }
}
