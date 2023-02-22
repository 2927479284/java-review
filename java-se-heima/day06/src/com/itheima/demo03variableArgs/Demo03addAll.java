package com.itheima.demo03variableArgs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

/*
    Collections集合工具类中的方法addAll
    static <T> boolean addAll(Collection<? super T> c, T... elements)
          将所有指定元素添加到指定 collection 中。
 */
public class Demo03addAll {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //add一次添加一个元素
        //list.add(1);
        //list.add(2);
        //list.add(3);
        //list.add(4);
        //list.add(5);
        //addAll一次添加多个元素
        Collections.addAll(list,1,2,3,4,5);
        System.out.println(list);

        LinkedList<String> linked = new LinkedList<>();
        Collections.addAll(linked,"aa","bb","jack","rose");
        System.out.println(linked);//[aa, bb, jack, rose]

        HashSet<Double> set = new HashSet<>();
        Collections.addAll(set,1.1,2.2,3.3,4.5,5.5);
        System.out.println(set);
    }
}
