package com.itheima.demo06StreamMethod;

import java.util.stream.Stream;

/*
   Stream流中的常用方法_skip方法:跳过前n个元素
       Stream<T> skip​(long n)
       skip(3)==> 跳过前3个元素,把剩余的元素存储到一个新的Stream流中
   注意:
       1.skip跳过的元素数量大于流中的个数,返回一个没有元素的空流
       2.skip方法的返回值类型还是Stream类型,是一个非终结方法,可以使用返回的Stream对象继续调用Stream流中的方法(链式编程)
*/
public class Demo05skip {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("美羊羊", "喜羊羊", "懒羊羊", "沸羊羊", "慢羊羊",
                "暖羊羊", "灰太狼", "红太狼", "小灰灰");
        //使用skip方法跳过前6个元素,把剩余的元素存储到一个新的流中
        //Stream<String> stream2 = stream.skip(6);
        //遍历stream2流对象
        //stream2.forEach(s -> System.out.println(s));

        //链式编程
        stream.skip(6).forEach(s -> System.out.println(s));
    }
}
