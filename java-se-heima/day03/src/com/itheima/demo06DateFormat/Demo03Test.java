package com.itheima.demo06DateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
    请将当前日期按以下格式打印到控制台：2021年04月20日 15:03:20
 */
public class Demo03Test {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = sdf.format(new Date());
        System.out.println(s);
    }
}
