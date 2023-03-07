package com.itheima.demo12lombok;

import lombok.*;

/*@Data
@NoArgsConstructor
@AllArgsConstructor*/
public class Person {
    private String name;
    private int age;
    private String sex;
    private int heigth;

    public Person() {
    }

    public Person(String name, int age, String sex, int heigth) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.heigth = heigth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }
}
