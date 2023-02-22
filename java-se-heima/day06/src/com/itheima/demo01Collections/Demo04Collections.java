package com.itheima.demo01Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo04Collections {
    public static void main(String[] args) {
        //创建AarrayList集合对象,泛型使用Person
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("azhangsan",18));
        list.add(new Person("lisi",20));
        list.add(new Person("wangwu",19));
        list.add(new Person("zhaoliu",18));
        list.add(new Person("tianqi",21));

        Collections.sort(list);
        for (Person p : list) {
            System.out.println(p);
        }

        /*
            降序排序
            Person{name='tianqi', age=21}
            Person{name='lisi', age=20}
            Person{name='wangwu', age=19}
            Person{name='azhangsan', age=18}
            Person{name='zhaoliu', age=18}
         */
    }
}