package com.itheima.demo04Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
    java.util.LinkedHashSet<E>集合extends HashSet<E>集合
        具有可预知迭代顺序的 Set 接口的哈希表和链接列表实现。
        此实现与 HashSet 的不同之外在于，后者维护着一个运行于所有条目的双重链接列表。
    特点:
        1.不允许存储重复的元素
        2.不包含带索引的方法(get,set,remove)==>不能使用普通for循环遍历
        3.是一个有序的集合
        4.底层是哈希表+单向链表==>底层就组成双向链表结构
            JDK1.8版本之前:数组+单向链表+单向链表
            JDK1.8版本之后:数组+单向链表|数组+红黑树+单向链表
 */
public class Demo06LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("aaa");
        set.add("bbb");
        set.add("aaa");
        set.add("ccc");
        set.add("ddd");
        System.out.println(set);//[aaa, ccc, bbb, ddd] 不允许重复,无序集合

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("aaa");
        linked.add("bbb");
        linked.add("aaa");
        linked.add("ccc");
        linked.add("ddd");
        System.out.println(linked);//[aaa, bbb, ccc, ddd] 不允许重复,有序集合
    }
}
