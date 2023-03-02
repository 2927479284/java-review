package com.itheima.demo06StreamMethod;

import java.util.stream.Stream;

/*
   Stream流中的常用方法_concat方法:组合,把两个Stream流,组合为一个新的Stream流
       static <T> Stream<T> concat​(Stream<? extends T> a, Stream<? extends T> b)
   注意:
       concat方法的返回值类型还是Stream类型,是一个非终结方法,可以使用返回的Stream对象继续调用Stream流中的方法(链式编程)
*/
public class Demo07concat {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("美羊羊", "喜羊羊", "懒羊羊", "沸羊羊",
                "慢羊羊", "暖羊羊", "灰太狼", "红太狼", "小灰灰");
        Stream<String> stream2 = Stream.of("张三", "李四", "王五");
        //使用Stream接口中的静态方法concat,把两个流对象合成一个新的流对象
        //Stream<String> stream = Stream.concat(stream1, stream2);
        //stream.forEach(s -> System.out.println(s));

        //链式编程
        Stream.concat(stream1,stream2).forEach(s -> System.out.println(s));
    }
}
