package com.itheima.demo05Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
    Map集合的遍历(重点)_键找值的方式
    Map集合中的方法:
        public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中。
        public V get(Object key):根据key,获取value值
    实现步骤:
        1.使用Map集合中的方法keySet,获取所有的健,存储到Set集合中
        2.遍历Set集合,获取Map集合中每一个键
        3.使用Map集合中的方法get,根据键获取值
 */
public class Demo02Map {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("迪丽热巴",168);
        map.put("古力娜扎",165);
        map.put("冯提莫",150);
        map.put("唐嫣",178);
        //1.使用Map集合中的方法keySet,获取所有的健,存储到Set集合中
        Set<String> set = map.keySet();
        //2.遍历Set集合,获取Map集合中每一个键
        //使用迭代器遍历Set集合
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key = it.next();
            //3.使用Map集合中的方法get,根据键获取值
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
        //使用增强for遍历Set集合
        System.out.println("-----------------------------");
        for (String s : set) {
            Integer integer = map.get(s);
            System.out.println("key:"+s+"value:"+integer);
        }
    }
}
