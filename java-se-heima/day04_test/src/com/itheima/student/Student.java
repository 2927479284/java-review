package com.itheima.student;

import com.itheima.superclass.Person;

/*
    子类Student
    - 构造方法
      - 无参构造
      - 全参构造(super调用父类全参构造)
    - 重写抽象方法
      - 重写getType()  学习
      - 重写getWork() 学习java
 */
public class Student extends Person {
    public Student() {
    }

    public Student(int id, String name, String sex, String birthday) {
        super(id, name, sex, birthday);
    }

    @Override
    public String getType() {
        return "学生";
    }

    @Override
    public String getWork() {
        return "学习Java";
    }
}
