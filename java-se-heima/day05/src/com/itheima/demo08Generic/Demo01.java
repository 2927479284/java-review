package com.itheima.demo08Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    泛型的通配符: ?
    可以作为方法参数的数据类型使用:可以接收任意数据类型的数据
 */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("jack");
        list02.add("rose");

        print(list01);
        print(list02);
    }

    /*
        需求:定义一个方法,方法的参数可以接收任意数据类型的集合
     */
    public static <T> void print(Collection<T> coll){
        //使用迭代器遍历集合:迭代器的泛型跟着集合走,集合是什么泛型,迭代器就是什么泛型
        Iterator<?> it = coll.iterator();
        while (it.hasNext()){
            //it.next();取出的元素是什么类型? Object类型
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
