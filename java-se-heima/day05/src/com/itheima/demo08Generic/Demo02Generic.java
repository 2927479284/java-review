package com.itheima.demo08Generic;

import java.util.ArrayList;
import java.util.Collection;

/*
       ?:作为方法的参数使用,代表可以接收任意的数据类型
       ? extends E: 泛型的上限限定 ==> 代表?只能接收E或者E的子类
       ? super E: 泛型的下限限定 ==> 代表?只能接收E或者E的父类
 */
public class Demo02Generic {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<Integer>();
        Collection<String> list2 = new ArrayList<String>();
        Collection<Number> list3 = new ArrayList<Number>();
        Collection<Object> list4 = new ArrayList<Object>();

        /*
            Integer|Double... extends Number extends Object
            String extends Object
         */

        getElement1(list1);
        //getElement1(list2);//报错 String和Number没有关系
        getElement1(list3);
        //getElement1(list4);//报错 Object类型是Number的父类,需要Number的子类

        //getElement2(list1);//报错 Integer是Number的子类,需要Number的父类
        //getElement2(list2);//报错 String和Number没有关系
        getElement2(list3);
        getElement2(list4);
    }

    // 泛型的上限：此时的泛型?，必须是Number类型或者Number类型的子类
    public static void getElement1(Collection<? extends Number> coll){}

    // 泛型的下限：此时的泛型?，必须是Number类型或者Number类型的父类
    public static void getElement2(Collection<? super Number> coll){}
}
