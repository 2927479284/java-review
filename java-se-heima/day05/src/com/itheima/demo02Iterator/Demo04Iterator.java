package com.itheima.demo02Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/**
 *  Iterator接口有一个子接口叫ListIterator接口,在ListIterator接口中定义了往集合中添加元素的方法
 * 	public interface ListIterator<E> extends Iterator<E>
 * 	 void add(E e) 将指定的元素插入列表（可选操作）。 ListIterator接口特有的方法
 * 	 void remove() 删除使用next方法取出的集合中的元素
 */
public class Demo04Iterator {
    public static void main(String[] args) {
        //创建集合对象,往集合中添加元素
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        //使用List接口中的方法listIterator获取ListIterator迭代器接口的实现类对象
        ListIterator<String> lit = list.listIterator();
        //使用ListIterator迭代器中的方法hasNext判断集合中是否还有元素
        while (lit.hasNext()){
            //使用ListIterator迭代器中的方法next取出集合中的元素
            String s = lit.next();
            System.out.println(s);

            /*
                需求: 增加一个判断,如果取出的元素s是"ccc"
                就给集合添加一个新的元素"itcast"
             */
            if("ccc".equals(s)){
                //list.add("itcast");
                lit.add("itcast");//使用迭代器中的add方法,往集合中添加元素
            }
        }

        System.out.println(list);
    }
}