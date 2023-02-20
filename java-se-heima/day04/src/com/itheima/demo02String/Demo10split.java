package com.itheima.demo02String;

/*
    15.String[] split(String regex)  根据自定的字符串对字符串进行切割,把一个字符串切割为几部分字符串,放在一个数组中返回
	"aa,bb,cc,dd"==>根据,切割字符串==>String[] arr = {"aa","bb","cc","dd"}
	"aa bb cc dd"==>根据空格切割字符串==>String[] arr = {"aa","bb","cc","dd"}
 */
public class Demo10split{
    public static void main(String[] args) {
        String s1 = "aa,bb,cc,dd";
        //根据,切割字符串
        String[] arr1 = s1.split(",");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
        System.out.println("----------------------");
        String s2 = "aa bb cc dd";
        //根据 切割字符串
        String[] arr2 = s2.split(" ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println("----------------------");
        String s3 = "张三,18,男,13888888888";
        String[] arr3 = s3.split(",");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
