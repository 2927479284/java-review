package com.itheima.demo05Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Stream流:我们可以把集合|数组,转换为Stream流,使用Stream流中的方法,对集合|数组进行操作
    作用:简化代码,使我们的代码更加优雅
 */
public class Demo02Stream {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张三丰","张翠山","灭绝师太","张三");
        //1.首先晒选出所有姓张的人,把姓张的人存储到一个新的集合中
        //2.筛选名字中是3个字的人,把名字是3个字的人存储到一个新的集合中
        //3.对最后得到的集合进行遍历
        list.stream().filter(s->s.startsWith("张")).filter(s->s.length()==3).forEach(s-> System.out.println(s));
    }
}
