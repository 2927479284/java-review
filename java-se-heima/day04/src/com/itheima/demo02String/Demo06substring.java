package com.itheima.demo02String;

/*
    substring:截取字符串
    beginIndex:开始索引
    endIndex:结束索引
    8.String substring(int beginIndex) 从开始索引beginIndex截取字符串到字符串的末尾
        "abc你好abc我好abc大家好".substring(3)==>"你好abc我好abc大家好"
    9.String substring(int beginIndex, int endIndex)  从开始索引beginIndex到结束索引endIndex截取字符串;包含头,不包含尾
        "abc你好abc我好abc大家好".substring(3,5)==>"你好"
 */
public class Demo06substring {
    public static void main(String[] args) {
        String s = "你若安好,便是晴天";
        //需求:截取出字符串中的"便是晴天"
        String s1 = s.substring(5);
        System.out.println(s1);//便是晴天

        //需求:截取出字符串中的"安好"
        String s2 = s.substring(2,4);
        System.out.println(s2);//安好
    }
}
