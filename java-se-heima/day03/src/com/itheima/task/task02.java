package com.itheima.task;

import java.util.Objects;

/**
 * 请按标准格式定义一个“学生类”，它有三个属性：姓名、性别、年龄
 * 	请编写测试类，创建两个“学生对象”并为它们的属性赋值，并能比较两个对象的所有属性值是否完全相等。
 */
public class task02 {

    public static void main(String[] args) {
        Student zs = new Student("张三", "男", 99);
        Student ls = new Student("张三", "男", 99);
        boolean equals = zs.equals(ls);//zs重写了equals方法比较的是两个对象的属性值【前提是类型相同】
        System.out.println(equals);
    }

}
class Student{

    String name;
    String sex;
    Integer age;

    public Student(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(sex, student.sex) && Objects.equals(age, student.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age);
    }
}
