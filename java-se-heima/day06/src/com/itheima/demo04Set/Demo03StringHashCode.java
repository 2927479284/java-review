package com.itheima.demo04Set;

/*
    String类的哈希值(扩展知识点_了解)
    String类重写了Object类的hashCode方法
    规则:
        相同的字符串,返回的哈希值是一样的
        不同的字符串,返回的哈希值也有可能一样
 */
public class Demo03StringHashCode {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());//96354
        System.out.println(s2.hashCode());//96354

        System.out.println("重地".hashCode());//1179395
        System.out.println("通话".hashCode());//1179395
        System.out.println('a'+0);//97
        System.out.println('重'+0);//37325
    }
}
