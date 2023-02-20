package com.itheima.task;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 请编程，计算并打印“1949年10月1日”那天是星期几？
 */
public class task08 {


    public static void main(String[] args) throws ParseException {
        String time = "2023年02月20日";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        Date parse = simpleDateFormat.parse(time);
        Calendar instance = Calendar.getInstance();
        instance.setTime(parse);
        int i = instance.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println("2023年02月20日是星期："+i);

    }
}
