package com.itheima.demo01Collection;

import java.util.*;

/*
    Collection 常用功能
    - public boolean add(E e)：  把给定的对象添加到当前集合中 。
    - public boolean remove(E e): 把给定的对象在当前集合中删除。
    - public boolean contains(Object obj): 判断当前集合中是否包含给定的对象。
    - public boolean isEmpty(): 判断当前集合是否为空。
    - public int size(): 返回集合中元素的个数。
    - public Object[] toArray(): 把集合中的元素，存储到数组中
    - public void clear() :清空集合中所有的元素。
 */
public class Demo01Collection {
    public static void main(String[] args) {
        //多态  接口 = 实现类对象
        Collection<String> coll = new ArrayList<>();
        //Collection<String> coll = new LinkedList<>();
        //Collection<String> coll = new HashSet<>();

        //public boolean add(E e)：  把给定的对象添加到当前集合中 。
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        coll.add("张三");
        coll.add("田七");
        System.out.println(coll);//[张三, 李四, 王五, 赵六, 张三, 田七]

        /*
            public boolean remove(E e): 把给定的对象在当前集合中删除。
            返回值:boolean
                元素存在,删除成功,返回true
                元素不存在,删除失败,返回false
                元素有重复的,只会删除第一个
         */
        boolean b1 = coll.remove("张三");
        System.out.println("b1:"+b1);//b1:true
        System.out.println(coll);//[李四, 王五, 赵六, 张三, 田七]

        boolean b2 = coll.remove("老王");
        System.out.println("b2:"+b2);//b2:false
        System.out.println(coll);//[李四, 王五, 赵六, 张三, 田七]

        /*
            public boolean contains(Object obj): 判断当前集合中是否包含给定的对象。
            返回值:boolean
                集合中包含指定的对象,返回true
                集合中不包含指定的对象,返回false
         */
        boolean b3 = coll.contains("田七");
        System.out.println("b3:"+b3);//b3:true
        boolean b4 = coll.contains("柳岩");
        System.out.println("b4:"+b4);//b4:false

        /*
            public boolean isEmpty(): 判断当前集合是否为空。
            返回值:boolean
                集合中没有元素,是空的,返回true
                集合中有元素,不是空的,返回false
         */
        boolean b5 = coll.isEmpty();
        System.out.println("b5:"+b5);//b5:false

        //public int size(): 返回集合中元素的个数。
        int size = coll.size();
        System.out.println("size:"+size);//size:5

        //public Object[] toArray(): 把集合中的元素，存储到数组中
        Object[] arr = coll.toArray();
        System.out.println(Arrays.toString(arr));//[李四, 王五, 赵六, 张三, 田七]

        //public void clear() :清空集合中所有的元素。
        coll.clear();
        System.out.println(coll);//[]

        System.out.println(coll.isEmpty());//true

        //集合还可以子继续使用
        coll.add("小红");
        System.out.println(coll);//[小红]
        HashMap<String, Object> map = new HashMap<>();



    }
}
