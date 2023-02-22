package com.itheima.demo02Iterator;

import java.util.ArrayList;
import java.util.Iterator;


/**
 *  Iterator接口中有一个方法叫remove,作用也是删除集合中的元素
 * 	void remove() 删除使用next方法取出的集合中的元素
 */
public class Demo03Iterator {
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
            String s = it.next();
            System.out.println(s);

            /*
                需求: 增加一个判断,如果取出的元素s是"ccc"
                就把集合中的元素"ccc"删除
             */
            if("ccc".equals(s)){
                //list.remove("ccc");//使用集合的删除方法,迭代器不知道元素少了,会抛出异常
                it.remove();//使用迭代器删除集合中元素的方法,删除it.next方法取出的元素
            }
        }
        System.out.println(list);
    }
}