package com.itheima.demo01Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        coll.add("张三");
        coll.add("田七");

        Iterator<String> iterator = coll.iterator();
        if (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
