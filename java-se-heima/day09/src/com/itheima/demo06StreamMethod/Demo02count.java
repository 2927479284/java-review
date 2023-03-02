package com.itheima.demo06StreamMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/*
   Stream流中的常用方法_count方法:统计个数
       long count​() 返回此流中的元素数。
   注意:
       count方法是一个终结方法,返回值类型是long类型;也不能使用链式编程调用Stream流中的其他方法了
*/
public class Demo02count {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6);
        long c1 = stream1.count();
        System.out.println("c1:"+c1);//c1:6

        List<String> list= new ArrayList<>();
        Collections.addAll(list,"张无忌","周芷若","赵敏","张三丰","张翠山","灭绝师太","张三");
        //把List集合转换为Stream流
        Stream<String> stream2 = list.stream();
        long c2 = stream2.count();
        System.out.println("c2:"+c2);//c2:7
    }
}
