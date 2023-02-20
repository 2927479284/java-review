package com.itheima.demo02String;

import java.util.Arrays;

/*
    10.char[] toCharArray() 将此字符串转换为一个新的字符数组。
    11.byte[] getBytes()  查询系统默认的编码把字符串转换为字节数组
 */
public class Demo07toCharArrayAndgetBytes {
    public static void main(String[] args) {
        String str = "abcde";

        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));//['a', 'b', 'c', 'd', 'e']
        System.out.println(chars);//abcde 后期会在讲打印流的时候讲

        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));//[97, 98, 99, 100, 101]
        System.out.println(bytes);//地址值 [B@140e19d
    }
}
