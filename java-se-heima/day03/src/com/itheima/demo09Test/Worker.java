package com.itheima.demo09Test;

import java.text.ParseException;

/*
    属性：姓名(String)、性别(String)、出生日期(String)、年龄(int)
             (注：出生日期需要从控制台接收。且用户只能输入日期，不能输入年龄; 输出只能输出年龄，不能输出生日)
        方法：工作(work)
 */

/**
 * 工作类(员工超类)
 */
public abstract class Worker {
    //姓名(String)、
    private String name;
    // 性别(String)、
    private String sex;
    // 出生日期(String)、
    private String birthday;
    // 年龄(int)
    private int age;

    //抽象的工作方法
    public abstract void work();

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday='" + birthday + '\'' +
                ", age=" + getAge() +
                '}';
    }

    public Worker() {
    }

    public Worker(String name, String sex, String birthday) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getAge()  {
        //4.请在父类的getAge()方法中调用birthdayToAge()方法，用于计算此人的年龄。
        try {
            this.age = Utils.birthdayToAge(this.birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return this.age;
    }

}
