package com.itheima.demo09List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    List接口中常用的方法(重点)
    List接口中特有的带索引的方法:
        void add(int index, E element)  在集合的指定索引处,添加一个新元素
        E get(int index)  获取指定索引处的元素
        E remove(int index)  移除并返回指定索引处的元素,返回的是被移除的元素
        E set(int index, E element) 替换并返回指定索引处的元素,返回的是被替换的元素
    注意:
        使用带索引的方法,必须防止索引越界异常(不要超出集合索引的使用范围:[0,size()-1])
 */
public class Demo01List {
    public static void main(String[] args) {
        //创建List集合对象
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("aaa");         //  0    1    2    3    4
        System.out.println(list);//[aaa, bbb, ccc, ddd, aaa]

        //void add(int index, E element)  在集合的指定索引处,添加一个新元素
        //需求:在ccc和ddd之间添加一个新的元素"老王"
        list.add(3,"老王");
        System.out.println(list);//[aaa, bbb, ccc, 老王, ddd, aaa]
        //list.add(30,"老马");//IndexOutOfBoundsException: Index: 30, Size: 6

        //E get(int index)  获取指定索引处的元素
        String s = list.get(3);
        System.out.println("s:"+s);//s:老王
        //list.get(100);//IndexOutOfBoundsException: Index: 100, Size: 6

        //E remove(int index)  移除并返回指定索引处的元素,返回的是被移除的元素
        //需求:使用索引删除集合中的第二个aaa
        String s2 = list.remove(5);
        System.out.println("s2:"+s2);//s2:aaa
        System.out.println(list);//[aaa, bbb, ccc, 老王, ddd]

        //E set(int index, E element) 替换并返回指定索引处的元素,返回的是被替换的元素
        //需求:把集合中的bbb,替换为"小明"
        String s3 = list.set(1, "小明");
        System.out.println("s3:"+s3);//s3:bbb
        System.out.println(list);//[aaa, 小明, ccc, 老王, ddd]
        System.out.println("-------------------------使用普通for循环遍历------------------------");
        for (int i = 0; i < list.size(); i++) {
            String ss = list.get(i);
            System.out.println(ss);
        }
        System.out.println("-------------------------使用增强for循环遍历------------------------");
        for (String ss : list) {
            System.out.println(ss);
        }
        System.out.println("-------------------------使用迭代器遍历------------------------");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String ss = it.next();
            System.out.println(ss);
        }
    }
}
