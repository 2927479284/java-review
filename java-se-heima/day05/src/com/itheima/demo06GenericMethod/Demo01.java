package com.itheima.demo06GenericMethod;

public class Demo01 {
    public static void main(String[] args) {
        //创建Person对象
        Person p = new Person();
        p.show01(10);
        p.show01(true);
        p.show01("aaa");
        p.show01(1.1);
        p.show01('#');
        p.show01(new Student("张三",18));

        //静态方法,通过类名可以直接使用
        Person.show02(10);
        Person.show02(true);
        Person.show02("aaa");
        Person.show02(1.1);
        Person.show02('#');
        Person.show02(new Student("张三",18));

        Integer in = Person.show03(10);
        System.out.println(in);

        String name = Person.show03("张安");
        System.out.println(name);
    }
}
