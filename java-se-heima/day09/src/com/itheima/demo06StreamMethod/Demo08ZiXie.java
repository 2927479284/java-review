package com.itheima.demo06StreamMethod;


import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * Stream 流式操作
 */
public class Demo08ZiXie {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> integers = new CopyOnWriteArrayList<>();
        //integers.addAll(); 需要一个List
        Collections.addAll(integers,2,3,45,6,78,9);
        integers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        //integers.stream().forEach((i)->System.out.println(i));
        //↑简写为↓
        //integers.forEach(integer -> System.out.println(integer));
        integers.forEach(System.out::println);


        Stream<String> zs = Stream.of("张三", "李三", "田三", "赵4");
        zs.filter((s)->s.contains("三")).forEach((s)-> System.out.println(s));
    }
}
