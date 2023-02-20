package com.itheima.teacher;

import com.itheima.superclass.Person;

/*
    子类Teacher
    - 构造方法
      - 无参构造
      - 全参构造(super调用父类全参构造)
    - 重写抽象方法
      - 重写getType() 老师
      - 重写getWork() 讲解java
 */
public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(int id, String name, String sex, String birthday) {
        super(id, name, sex, birthday);
    }

    @Override
    public String getType() {
        return "老师";
    }

    @Override
    public String getWork() {
        return "讲解Java";
    }
}
