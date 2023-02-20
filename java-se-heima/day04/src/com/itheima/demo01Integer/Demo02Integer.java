package com.itheima.demo01Integer;

import java.util.ArrayList;

/*
    自动装箱,自动拆箱(重点)
    在JDK1.5版本之后:装箱与拆箱[自动]进行转换
 */
public class Demo02Integer {
    public static void main(String[] args) {
        //自动装箱
        Integer in = 1;//等价于 Integer in = new Integer(1);

        //自动拆箱
        int a = in;//等价于 int a = in.intValue();

        //集合只能存储对象
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//自动装箱 等价于 list.add(new Integer(1));

        //集合中存储的都是Integer对象,取出的元素也是Integer对象
        Integer in2 = list.get(0);
        int b = list.get(0);//自动拆箱 等价于 int b = list.get(0).intValue();
    }
}
