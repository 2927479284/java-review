package com.itheima.demo06Test;

public class Person {
    //姓名
    private String name;
    //年龄
    private int age;
    //身份证信息(使用类名作为成员变量)
    private IDCard iDCard;

    public Person() {
    }

    public Person(String name, int age, IDCard iDCard) {
        this.name = name;
        this.age = age;
        this.iDCard = iDCard;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", iDCard=" + iDCard +
                '}';
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

    public IDCard getiDCard() {
        return iDCard;
    }

    public void setiDCard(IDCard iDCard) {
        this.iDCard = iDCard;
    }
}
