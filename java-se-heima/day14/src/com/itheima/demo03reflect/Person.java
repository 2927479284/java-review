package com.itheima.demo03reflect;

public class Person {
    private String name;
    private int age;
    private String sex;

    public Person() {
        System.out.println("Person类的空参数构造方法!");
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        System.out.println("Person类的满参数构造方法!");
    }

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person类的私有构造方法!");
    }

    //定义一个私有的成员方法
    private void show(){
        System.out.println("Person类的私有show方法!");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
