package com.itheima.demo04Objects;

import java.util.Objects;

/*
    Objects对象的工具类(了解)
    java.util.Objects类:操作对象的工具类,里边的方法都是静态的
    Objects类是jdk1.7之后出现的
    Objects类中的方法都是空指针安全的,都是防止空指针异常的
    注意:
        java中提供的工具类里边方法一般都是静态的
        可以通过类名.方法名(参数)直接使用
    Objects工具类中equals方法:
        static boolean equals​(Object a, Object b) :判断两个对象是否相等,相等返回true,不相等返回false
    Objects工具类中equals方法底层源码:
         public static boolean equals(Object a, Object b) {
            return (a == b) || (a != null && a.equals(b));
            return (s1 == s2) || (s1 != null && s1.equals(s2));
        }
 */
public class Demo01Objects {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "Abc";
        //boolean b1 = s1.equals(s2);//null.equals(s2) NullPointerException
        //System.out.println("b1:"+b1);

        //JDK1.7之前:可以使用三元运算符
        boolean b2 = s1 != null ? s1.equals(s2) : s2 == null;
        System.out.println("b2:"+b2);

        //JDK1.7之后:可以使用Objects工具类中的equals方法
        boolean b3 = Objects.equals(s1, s2);
        System.out.println(b3);
    }
}
