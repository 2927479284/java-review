package com.itheima.demo02Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    迭代器的基本使用(重点)
    使用步骤:
        1.使用Collection接口中的方法iterator获取迭代器的实现类对象
        2.使用迭代器Iterator接口中方法hasNext判断集合中有没有元素
        3.集合中有元素,使用next方法取出元素
 */
public class Demo01Iterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        coll.add("田七");

        //1.使用Collection接口中的方法iterator获取迭代器的实现类对象
        //多态 接口    变量名 = 实现类对象();
        Iterator<String> it = coll.iterator();

        /*
            我们发现使用迭代器取出集合中的元素是一个重复的过程
            所以可以使用循环优化,不知道集合中有多少元素
            所以使用while循环,循环结束的条件, it.hasNext方法返回false
         */
        //2.使用迭代器Iterator接口中方法hasNext判断集合中有没有元素
        while (it.hasNext()){
            //3.集合中有元素,使用next方法取出元素
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("---------------------------------------");
        //迭代器只能使用一次,想要再次使用迭代器,必须重新获取迭代器对象
        Iterator<String> it2 = coll.iterator();
        while (it2.hasNext()){
            //3.集合中有元素,使用next方法取出元素
            String s = it2.next();
            System.out.println(s);
        }
        System.out.println("---------------------------------------");
        for(Iterator<String> it3 = coll.iterator();it3.hasNext();){
            String s = it3.next();
            System.out.println(s);
        }

    }

    /*
        //2.使用迭代器Iterator接口中方法hasNext判断集合中有没有元素
        boolean b = it.hasNext();
        System.out.println(b);//true

        //3.集合中有元素,使用next方法取出元素
        String s = it.next();
        System.out.println(s);//张三

        b = it.hasNext();
        System.out.println(b);//true
        s = it.next();
        System.out.println(s);//李四

        b = it.hasNext();
        System.out.println(b);//true
        s = it.next();
        System.out.println(s);//王五

        b = it.hasNext();
        System.out.println(b);//true
        s = it.next();
        System.out.println(s);//赵六

        b = it.hasNext();
        System.out.println(b);//true
        s = it.next();
        System.out.println(s);//田七

        b = it.hasNext();
        System.out.println(b);//false
        //s = it.next();//NoSuchElementException 没有这个元素异常
     */
}
