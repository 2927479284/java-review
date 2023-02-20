package com.itheima.demo07Test;

public class Person {
    private String name;
    private int age;
    /*
        定义一个成员变量,类型使用Animal
        多态:可以创建Animal任意的子类对象,给成员变量赋值
            private Animal animal = new Cat();
            private Animal animal = new Dog();
     */
    private Animal animal;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", animal=" + animal +
                '}';
    }

    public Person() {
    }

    public Person(String name, int age, Animal animal) {
        this.name = name;
        this.age = age;
        this.animal = animal;
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

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
