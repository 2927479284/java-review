package com.itheima.demo02toString;

//ctrl+鼠标左键:进入到类中|方法中
public class Person extends Object{
    private String name;
    private int age;

    /*
        Object类的toString方法,打印对象名,打印对象的地址值有意义吗?没有意义
        重写Object类的toString方法,打印对象的属性值(name,age)
        快捷键:alt+insert==>选择toString
     */
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
}
