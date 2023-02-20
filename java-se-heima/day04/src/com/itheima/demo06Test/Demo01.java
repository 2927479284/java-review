package com.itheima.demo06Test;

public class Demo01 {
    public static void main(String[] args) {
        //使用Person的空参数构造方法创建对象
        Person p = new Person();
        p.setName("胡歌");
        p.setAge(18);
        IDCard idCard = new IDCard("110110200404041111","北京市公安局");
        //给引用数据类型的成员变量赋值,创建对象赋值
        p.setiDCard(idCard);
        System.out.println(p);//Person{name='胡歌', age=18, iDCard=IDCard{idNum='110110200404041111', authority='北京市公安局'}}

        //使用Person的满参数构造方法创建对象
        Person p2 = new Person("刘亦菲",
                18,new IDCard("120120200404048888","上海市公安局"));
        System.out.println(p2);//Person{name='刘亦菲', age=18, iDCard=IDCard{idNum='120120200404048888', authority='上海市公安局'}}
    }
}
