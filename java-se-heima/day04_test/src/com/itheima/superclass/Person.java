package com.itheima.superclass;

import com.itheima.utils.Utils;

/*
    父类Person(抽象)
    - 成员属性：
      - id(编号)
      - name(姓名)
      - sex(性别)
      - birthday(生日)
      - age(年龄-由生日计算得出)
    - 构造方法：
      - 无参构造
      - 全参构造
    - 成员方法：
      - toString()
    - 抽象方法：
      - getType()：由各子类实现，返回各自的"类型"字符串。
      - getWork()：由各子类实现，返回各自的"工作"字符串。
 */
public abstract class Person {
    //id(编号)
    private int id;
    //name(姓名)
    private String name;
    //sex(性别)
    private String sex;
    //birthday(生日)
    private String birthday;
    //age(年龄-由生日计算得出)
    private int age;

    @Override
    public String toString() {
        return id+"\t"+name+"\t"+sex+"\t"+birthday+"\t"+getAge()+"\t"+
                "我是一名: " + getType()+" 我的工作是: "+ getWork();
    }

    //- getType()：由各子类实现，返回各自的"类型"字符串。
    public abstract String getType();
    //- getWork()：由各子类实现，返回各自的"工作"字符串。
    public abstract String getWork();

    public Person() {
    }

    public Person(int id, String name, String sex, String birthday) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAge() {
        //年龄-由生日计算得出
        this.age = Utils.birthdayToAge(birthday);
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
