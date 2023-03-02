package com.itheima.demo08Stream;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    把Stream流转换为集合:收集到集合中
    可以使用Stream流中的方法collect​把Stream转换为集合
        R collect​(Collector<? super T,A,R> collector)
        参数:
            Collector是一个接口,需要传递接口的实现类对象
    java.util.stream.Collectors:操作Collector的工具类
        static <T> Collector<T,?,List<T>> toList​() 返回Collector接口的实现类对象,可以把Stream流转换为List集合
        static <T> Collector<T,?,Set<T>> toSet​()   返回Collector接口的实现类对象,可以把Stream流转换为Set集合
 */
public class Demo01StreamToCollection {
     public static void main(String[] args) {
         Stream<String> stream = Stream.of("美羊羊", "喜羊羊",
                 "懒羊羊", "沸羊羊", "慢羊羊", "暖羊羊","美羊羊");
         //把Stream流转换为List集合:1.有序  2.可重复 3.有带索引的方法
         //List<String> list = stream.collect(Collectors.toList());
         //System.out.println(list);//[美羊羊, 喜羊羊, 懒羊羊, 沸羊羊, 慢羊羊, 暖羊羊, 美羊羊]

         //把Stream流转换为Set集合:1.不允许重复 2.不包含代索引的方法
         Set<String> set = stream.collect(Collectors.toSet());
         System.out.println(set);//[美羊羊, 沸羊羊, 暖羊羊, 喜羊羊, 懒羊羊, 慢羊羊]
     }
}
