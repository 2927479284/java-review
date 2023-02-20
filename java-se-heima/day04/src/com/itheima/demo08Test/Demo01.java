package com.itheima.demo08Test;

public class Demo01 {
    public static void main(String[] args) {
        //创建Person对象
        Person p1 = new Person();
        p1.setName("隔壁老王");
        p1.setAge(20);
        p1.setFly(new Niao());
        p1.getFly().fly();
        System.out.println(p1);//Person{name='隔壁老王', age=20, fly=我的宠物是一只小麻雀!}

        Person p2 =  new Person("楼上老宋",30,new Ying());
        System.out.println(p2);//Person{name='楼上老宋', age=30, fly=我的宠物是一只鹰!}
    }
}
