package com.itheima.demo05Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
    java.util.LinkedHashMap<K,V>集合 extends HashMap<K,V>集合
	Map 接口的哈希表和链接列表实现，具有可预知的迭代顺序。
	此实现与 HashMap 的不同之处在于，后者维护着一个运行于所有条目的双重链接列表。
	a.LinkedHashMap集合底层是哈希表+单向链表,数据结构和LinkedHashSet是一样的
	b.是一个有序集合
 */
public class Demo05LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("aaa","aaa");
        map.put("bbb","bbb");
        map.put("aaa","itheima");
        map.put("ccc","ccc");
        map.put("ddd","ddd");
        System.out.println(map);//{aaa=itheima, ccc=ccc, bbb=bbb, ddd=ddd} key允许重复,是一个无序集合

        LinkedHashMap<String,String> linked = new LinkedHashMap<>();
        linked.put("aaa","aaa");
        linked.put("bbb","bbb");
        linked.put("aaa","itheima");
        linked.put("ccc","ccc");
        linked.put("ddd","ddd");
        System.out.println(linked);//{aaa=itheima, bbb=bbb, ccc=ccc, ddd=ddd}key允许重复,是一个有序集合
    }
}
