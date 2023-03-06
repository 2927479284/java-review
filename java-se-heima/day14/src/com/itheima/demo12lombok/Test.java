package com.itheima.demo12lombok;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("唐三");
        p1.setAge(18);
        p1.setSex("男");
        p1.setHeigth(180);
        System.out.println(p1.getName()+"\t"+p1.getAge()+"\t"+p1.getSex()+"\t"+p1.getHeigth());

        Person p2 = new Person("小舞",18,"女",170);
        System.out.println(p2);//Person(name=小舞, age=18, sex=女, heigth=170)
    }
}
