package com.itheima.demo02String;

/*
    start:开始,开头
    end:结尾,结束
    3.boolean endsWith(String suffix)  判断字符串是否以指定的字符串结尾;是返回true,不是返回false
	    "abcabc"==>"c" true   "abcabc"==>"abC" false
    4.boolean startsWith(String prefix) 判断字符串是否以指定的字符串开头;是返回true,不是返回false
        "abcabc"==>"abc" true   "abcabc"==>"hello" false
 */
public class Demo03startsWithAndendsWith {
    public static void main(String[] args) {
        System.out.println("abcabc".endsWith("呵呵"));//false
        System.out.println("abcabc".endsWith("abc"));//true
        System.out.println("abcabc".startsWith("aaa"));//false
        System.out.println("abcabc".startsWith("abc"));//true

        //实际工作中:endsWith==>过滤器
        String[] arr = {"hello.txt","战狼.avi","String.java","长津湖.mp3","Demo01.java"};
        //需求:跳出数组中以.java结尾的字符串,在控制台输出
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].endsWith(".java")){
                System.out.println(arr[i]);
            }
        }
    }
}
