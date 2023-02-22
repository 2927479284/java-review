package com.itheima.demo04Set;

import java.util.HashSet;

/*
    HashSet存储自定义类型元素(重点中的重点)
    自定义类型:Student,Person,Animal...
    要求:同名同年龄的学生只能存储一次(不重复)
    解决:
        自定义类型重写hashCode方法和equals方法保证元素唯一
 */
public class Demo05HashSetStudent {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        Student s1 = new Student("a",10);
        Student s2 = new Student("a",10);
        System.out.println(s1.hashCode());//1163157884==>107
        System.out.println(s2.hashCode());//1956725890==>107
        set.add(s1);
        set.add(s2);
        Student s3 = new Student("b",9);
        set.add(s3);
        for (Student s : set) {
            System.out.println(s.getName()+"\t"+s.getAge());
        }
    }
}
