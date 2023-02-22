package com.itheima.demo04Set;

import java.util.HashSet;

/*
    使用HashSet集合存储String不重复的原理(扩展知识点_了解)
    String类(Integer,Double...)重写了Object类的hashCode方法和equals方法,用于判断元素是否重复
 */
public class Demo04HashSetSaveString {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);//[重地, 通话, abc]
    }
}