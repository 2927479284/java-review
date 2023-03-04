package com.itheima.demo05BufferedStream;

import java.util.Arrays;

public class Demo08 {
    public static void main(String[] args) {
        String s = "10.结束";
        //需求:把.前边的数字拿出来,转换为int类型
        String[] arr = s.split("\\.");
        System.out.println(Arrays.toString(arr));//[10, 结束]
        int a = Integer.parseInt(arr[0]);
        System.out.println(a);

        int b = Integer.parseInt(s.split("\\.")[0]);
        System.out.println(b);
    }
}
