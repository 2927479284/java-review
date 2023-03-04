package com.itheima.demo07SerializableStream;

import java.io.Serializable;

/*
    使用序列化流写对象的时候,程序抛出了NotSerializableException:没有序列化异常
    类通过实现 java.io.Serializable 接口以启用其序列化功能。未实现此接口的类将无法使其任何状态序列化或反序列化。
    Serializable被称之为标记型接口
        类实现了Serializable接口,那么Serializable接口就会给类添加一个标记(序列号)
        当我们进行序列化|反序列化的时候,会检查类上是否有这个标记
            有:进行序列化和反序列化
            没有:抛出NotSerializableException异常
 */
public class Person implements Serializable{
    /*
        修改了类的定义:会重新生成序列号,导致反序列化抛出InvalidClassException异常
        解决:
        可序列化类可以通过声明名为 "serialVersionUID" 的字段（该字段必须是静态 (static)、最终 (final) 的 long 型字段）显式声明其自己的 serialVersionUID：
        static final long serialVersionUID = 42L;
        final:变量被final修饰,就是一个常量,无论类如何修改,值是固定的
     */
    private static final long serialVersionUID = 1L;
    private String name;
    public int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
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
}
