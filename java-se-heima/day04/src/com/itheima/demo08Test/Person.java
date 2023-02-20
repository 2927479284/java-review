package com.itheima.demo08Test;

public class Person {
    private String name;
    private int age;
    /*
        使用接口作为成员变量
        多态:可以创建Fly接口任意的实现类对象,给成员变量赋值
        private Fly fly = new Niao();
        private Fly fly = new Ying()
     */
    private Fly fly;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", fly=" + fly +
                '}';
    }

    public Person() {
    }

    public Person(String name, int age, Fly fly) {
        this.name = name;
        this.age = age;
        this.fly = fly;
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

    public Fly getFly() {
        return fly;
    }

    public void setFly(Fly fly) {
        this.fly = fly;
    }
}
