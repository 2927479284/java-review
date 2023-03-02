package com.itheima.demo06StreamMethod;

import java.util.stream.Stream;

/*
   Stream流中的常用方法_limit方法:获取前n个元素
       Stream<T> limit​(long maxSize) 返回由此流的元素组成的流，截短长度不能超过 maxSize 。
       例如:
           limit(4);获取流中的前4个元素,把4个元素存储到一个新的Steam流中
   注意:
   1.传递数字大于流的长度,返回流中所有的元素
   2.limit方法的返回值类型还是Stream类型,是一个非终结方法,可以使用返回的Stream对象继续调用Stream流中的方法(链式编程)
*/
public class Demo04limit {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("美羊羊", "喜羊羊", "懒羊羊", "沸羊羊", "慢羊羊",
                "暖羊羊", "灰太狼", "红太狼", "小灰灰");
        //使用limit方法获取Stream流中前6个元素,存储到一个新的Stream流中返回
        //Stream<String> stream2 = stream.limit(6);
        //遍历stream2流对象
        //stream2.forEach(s -> System.out.println(s));

        //链式编程
        stream.limit(6).forEach(s -> System.out.println(s));
    }
}
