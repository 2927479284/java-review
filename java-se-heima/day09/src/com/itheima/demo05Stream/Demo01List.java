package com.itheima.demo05Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    Stream流的基本体验
    需求:
    List<String> list= new ArrayList<>();
     Collections.addAll(list,"张无忌","周芷若","赵敏","张三丰","张翠山","灭绝师太","张三");
    1.首先晒选出所有姓张的人,把姓张的人存储到一个新的集合中
    2.筛选名字中是3个字的人,把名字是3个字的人存储到一个新的集合中
    3.对最后得到的集合进行遍历
 */
public class Demo01List {
    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张三丰","张翠山","灭绝师太","张三");

        //1.首先晒选出所有姓张的人,把姓张的人存储到一个新的集合中
        List<String> zhangList= new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张")){
                zhangList.add(s);
            }
        }
        System.out.println(zhangList);//[张无忌, 张三丰, 张翠山, 张三]

        //2.筛选名字中是3个字的人,把名字是3个字的人存储到一个新的集合中
        List<String> sanList= new ArrayList<>();
        for (String s : zhangList) {
            if(s.length()==3){
                sanList.add(s);
            }
        }

        //3.对最后得到的集合进行遍历
        for (String s : sanList) {
            System.out.println(s);
        }

    }
}
