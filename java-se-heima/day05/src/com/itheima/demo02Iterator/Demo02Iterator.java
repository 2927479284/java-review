package com.itheima.demo02Iterator;

import java.util.ArrayList;
import java.util.Iterator;


/** 迭代器并发异常
 * ConcurrentModificationException
 */
public class Demo02Iterator {
    public static void main(String[] args) {
        //创建集合对象,往集合中添加元素
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        //使用迭代器遍历list集合
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();// 添加完|删除完元素,下次在取的时候,会抛出ConcurrentModificationException
            System.out.println(s);
            
            /*
                需求: 增加一个判断,如果取出的元素s是"ccc"
                就给集合添加一个新的元素"itcast"
             */
            /*if("ccc".equals(s)){
                list.add("itcast");
            }*/
            
            /*
                需求: 增加一个判断,如果取出的元素s是"ccc"
                就把集合中的元素"ddd"删除
             */
            /*if("ccc".equals(s)){
                list.remove("ddd");
            }*/
        }
    }
}