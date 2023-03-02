package com.itheima.demo06StreamMethod;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * stream流map转换
 */
public class  Demo09ZiXieMap {
    public static void main(String[] args) {
        //1.把string类型的数据转换成Integer类型

        Stream<String> stringStream = Stream.of("1", "2", "3", "4");
        stringStream.map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }).forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        //简写stringStream.map(s->Integer.parseInt(s)).forEach(integer -> System.out.println(integer+1));
    }
}
