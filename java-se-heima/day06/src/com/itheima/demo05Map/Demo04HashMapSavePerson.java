package com.itheima.demo05Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    HashMap存储自定义类型(重点中的重点)
 */
public class Demo04HashMapSavePerson {
    public static void main(String[] args) {
        show03();
//        show02();
    }

    /*
        使用ArrayList集合,存储自定义类型
        List集合:1.有序,[2.允许重复],3.包含一些带索引的方法
     */
    private static void show03() {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("女王",18));
        list.add(new Person("习大大",18));
        list.add(new Person("普京",18));
        list.add(new Person("金三胖",3));
        list.add(new Person("女王",18));
        for (Person p : list) {
            System.out.println(p);
        }
    }

    /*
        HashMap存储自定义类型(重点中的重点)
        key:Person类型 保证:同名同年龄的人视为同一个人,只能存储一次
            Person类:重写hashCode和equals方法保证key唯一
        value:String类型  value可以重复
     */
    private static void show02() {
        HashMap<Person,String> map = new HashMap<>();
        Person p1 = new Person("女王", 18);
        System.out.println(p1.hashCode());//1163157884==>重写后==>22922906
        Person p2 = new Person("女王", 18);
        System.out.println(p2.hashCode());//1956725890==>重写后==>22922906
        map.put(new Person("女王",18),"英国");
        map.put(new Person("习大大",18),"中国");
        map.put(new Person("普京",18),"俄罗斯");
        map.put(new Person("金三胖",3),"朝鲜");
        map.put(new Person("女王",18),"毛里求斯");
        //使用entrySet方法+增强for循环遍历Map集合
        Set<Map.Entry<Person, String>> entries = map.entrySet();
        for (Map.Entry<Person, String> entry : entries) {
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " "+value);
        }
    }

    /*
        HashMap存储自定义类型(重点中的重点)
        key:String类型 String类重写了hashCode和equals方法,可以保证key唯一
        value:Person类型 value可以重复
     */
    private static void show01() {
        HashMap<String,Person> map = new HashMap<>();
        map.put("中国",new Person("习大大",18));
        map.put("美国",new Person("特朗普",88));
        map.put("俄罗斯",new Person("普京",18));
        map.put("朝鲜",new Person("金三胖",3));
        map.put("美国",new Person("拜登",99));
        //使用keySet+增强for循环遍历Map集合
        Set<String> set = map.keySet();
        for (String key : set) {
            Person value = map.get(key);
            System.out.println(key+"==>"+value);
        }
    }
}
