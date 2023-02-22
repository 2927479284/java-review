package com.itheima.demo02Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo04Collections {
    public static void main(String[] args) {
        //创建AarrayList集合对象,泛型使用Person
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("azhangsan",18));
        list.add(new Person("lisi",20));
        list.add(new Person("wangwu",19));
        list.add(new Person("zhaoliu",18));
        list.add(new Person("tianqi",21));

        /*Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                //按照年龄升序排序
                return o1.getAge()-o2.getAge();
            }
        });*/

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                //按照姓名排序
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Person p : list) {
            System.out.println(p);
        }

        /*
            Person{name='azhangsan', age=18}
            Person{name='zhaoliu', age=18}
            Person{name='wangwu', age=19}
            Person{name='lisi', age=20}
            Person{name='tianqi', age=21}
         */
    }
}