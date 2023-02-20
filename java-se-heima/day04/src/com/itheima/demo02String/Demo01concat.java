package com.itheima.demo02String;

/*
    concat:连接,拼接
    1.String concat(String str) 将指定字符串连接到此字符串的结尾。 把两个字符串连接到一起
	"aa".concat("bb")==>"aabb"   "aa"+"bb"==>"aabb"
 */
public class Demo01concat {
    public static void main(String[] args) {
        String s1 = "你好";
        String s2 = "我好";
        String s3 = s1.concat(s2);
        System.out.println("s3:"+s3);//s3:你好我好

        //链式编程
        System.out.println(s1.concat(s2).concat("大家好").concat("才是真的好"));//你好我好大家好才是真的好
    }
}
