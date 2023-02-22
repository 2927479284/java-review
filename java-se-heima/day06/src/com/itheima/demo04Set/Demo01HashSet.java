package com.itheima.demo04Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/*
    java.util.HashSet<E> implements Set<E>接口
    HashSet集合的特点:
        此类实现 Set 接口，由哈希表（实际上是一个 HashMap 实例）支持。
        它不保证 set 的迭代顺序；特别是它不保证该顺序恒久不变。
   1.不允许存储重复的元素
   2.不包含带索引的方法(get,set,remove)==>不能使用普通for循环遍历
   3.是一个无序的集合:存储的元素和取出的元素[有可能]不一致
   4.底层是一个哈希表结构
        JDK1.8版本之前:数组+单向链表
        JDK1.8版本之后:数组+单向链表|数组+红黑树
 */
public class Demo01HashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("aaa");
        set.add("ccc");
        set.add("ddd");
        System.out.println(set);//[aaa, ccc, bbb, ddd]

        HashSet<Integer> set2 = new HashSet<>();
        Collections.addAll(set2,1,2,3,4,5);
        System.out.println(set2);//[1, 2, 3, 4, 5]

        //使用迭代器遍历Set集合
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("------------------------");
        //使用增强for循环遍历Set集合
        for (String s : set) {
            System.out.println(s);
        }
    }
}
