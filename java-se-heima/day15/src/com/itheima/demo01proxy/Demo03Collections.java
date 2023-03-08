package com.itheima.demo01proxy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    演示Java中Collections的unmodifiableList方法
 */
public class Demo03Collections {
    public static void main(String[] args) {
        //创建ArrayList集合对象,添加元素
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        //调用Collections类的unmodifiableList方法,传递List集合,返回一个不可以修改的List集合
        List<String> list02 = Collections.unmodifiableList(list);
        //如果使用size,get方法,没有对集合进行修改,就可以运行方法
        System.out.println(list02.size());//3
        System.out.println(list.get(1));//bbb
        //如果使用add,remove,set方法,对集合进行了修改,就会抛出异常
        //list02.add("ddd");//UnsupportedOperationException
        //list02.remove(1);//UnsupportedOperationException
        //list02.set(1,"hello");//UnsupportedOperationException
    }
}