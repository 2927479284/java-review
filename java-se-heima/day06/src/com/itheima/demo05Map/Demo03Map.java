package com.itheima.demo05Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map集合的遍历(重点)_键值对的方式
    Map集合中的方法:
        Set<Map.Entry<K,V>> entrySet()  获取Map集合中所有的entry对象,存储Set集合中
    Entry接口中的方法:
        K getKey() 获取键
        V getValue() 获取值
    实现步骤:
        1.使用Map集合中的方法entrySet,获取Map集合中所有的entry对象,存储Set集合中
        2.遍历Set集合,获取每一个entry对象
        3.使用entry对象中的方法getKey和getValue分别获取键与值
 */
public class Demo03Map {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");
        //1.使用Map集合中的方法entrySet,获取Map集合中所有的entry对象,存储Set集合中
        Set<Map.Entry<String, String>> set = map.entrySet();

        //2.遍历Set集合,获取每一个entry对象
        //使用迭代器遍历Set集合
        Iterator<Map.Entry<String, String>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<String, String> entry = it.next();
            //3.使用entry对象中的方法getKey和getValue分别获取键与值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }
        System.out.println("========================");
        //使用增强for遍历Set集合
        for (Map.Entry<String, String> entry : set) {
            //3.使用entry对象中的方法getKey和getValue分别获取键与值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }

    }
}
