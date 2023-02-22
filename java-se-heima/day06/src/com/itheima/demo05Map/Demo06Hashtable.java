package com.itheima.demo05Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

/*
    Hashtable集合(了解-->面试)
    java.util.Hashtable<K,V>集合 implements Map<K,V>接口(jdk1.2之后开始实现)
        此类实现一个哈希表，该哈希表将键映射到相应的值。任何非 null 对象都可以用作键或值。
    --------------------------------------------------------------------------------------
    HashMap集合的特点:
        1.HashMap集合底层是一个哈希表结构
        2.HashMap集合是jdk1.2版本之后出现的
        3.HashMap集合允许存储null键和null值
        4.HashMap集合是不同步的,效率高(多线程不安全)
    --------------------------------------------------------------------------------------
    Hashtable集合的特点:
        1.Hashtable集合底层是一个哈希表结构
        2.Hashtable集合是jdk1.0版本就存在的双列集合(最早期的双列集合)
        3.Hashtable集合不允许存储null键和null值
        4.Hashtable集合是同步的,效率低(多线程安全)
    --------------------------------------------------------------------------------------
    Hashtable集合效率没有HashMap高,所以已经被淘汰了
    但是Hashtable集合的子类Properties集合依然活跃在历史的舞台
 */
public class Demo06Hashtable {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("a",null);
        map.put(null,"b");
        map.put(null,null);
        System.out.println(map);

        Hashtable<String,String> table = new Hashtable<>();
        //table.put("a",null);//NullPointerException
        //table.put(null,"b");//NullPointerException
        //table.put(null,null);//NullPointerException

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(null);
        list.add(2);
        list.add(null);
        System.out.println(list);//[1, null, 2, null]
    }
}