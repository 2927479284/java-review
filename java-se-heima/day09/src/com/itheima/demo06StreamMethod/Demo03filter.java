package com.itheima.demo06StreamMethod;

import java.util.function.Predicate;
import java.util.stream.Stream;

/*
   Stream流中的常用方法_filter方法:用于过滤Stream流中的元素
       Stream<T> filter​(Predicate<? super T> predicate)
       参数:
           Predicate<? super T> predicate:函数式接口,参数传递lambda表达式
           唯一的抽象方法:
               boolean test​(T t) 用于对接口指定泛型类型的数据进行判断
   注意:
        filter方法的返回值类型还是Stream类型,是一个非终结方法,可以使用返回的Stream对象继续调用Stream流中的方法(链式编程)
*/
public class Demo03filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("美羊羊", "喜羊羊", "懒羊羊", "沸羊羊", "慢羊羊", "暖羊羊", "灰太狼", "红太狼", "小灰灰");
        //使用Stream流中的方法filter过滤Stream流,只要包含"羊羊"元素,存储到一个新的Stream流中
        /*Stream<String> stream2 = stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("羊羊");
            }
        });*/

        //Predicate是一个函数式接口,所以可以使用Lambda表达式简化匿名内部类
        /*Stream<String> stream2 = stream.filter((String s)->{
            return s.contains("羊羊");
        });*/

        //简化Lambda表达式
        //Stream<String> stream2 = stream.filter(s->s.contains("羊羊"));
        //遍历Stream2流对象
        //stream2.forEach(s-> System.out.println(s));

        //链式编程
        stream.filter(s -> s.contains("羊羊")).forEach(s -> System.out.println(s));
    }
}
