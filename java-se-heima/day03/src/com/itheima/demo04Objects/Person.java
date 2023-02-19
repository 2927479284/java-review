package com.itheima.demo04Objects;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        //使用三元运算符防止name的空指针异常
        return name != null ? name.equals(person.name) : person.name == null;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        //使用Objects的equals方法防止name空指针异常
        return age == person.age &&
                Objects.equals(name, person.name);
    }
}
