package com.itheima.demo06StreamMethod;

import java.util.function.Function;
import java.util.stream.Stream;

/*
   Stream流中的常用方法_map方法:映射,类型转换
       <R> Stream<R> map​(Function<T,R> mapper)
       参数:
           Function<T,R> mapper:函数式接口,可以传递Lambda表达式
           接口中唯一的抽象方法:
               R apply​(T t) 根据参数类型T获取类型R类型的返回值,用于类型转换 T转换R
   注意:
       map方法的返回值类型还是Stream类型,是一个非终结方法,可以使用返回的Stream对象继续调用Stream流中的方法(链式编程)
*/
public class Demo06map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("10", "20", "30");
        //需求:使用map方法,把String类型的Stream流转换为Integer类型的Stream流
        /*Stream<Integer> stream2 = stream.map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        });*/

        //Function接口是一个函数式接口,可以使用Lambda表达式简化匿名内部类
        /*Stream<Integer> stream2 = stream.map((String s) -> {
            return Integer.parseInt(s);
        });*/

        //简化lambda表达式
        //Stream<Integer> stream2 = stream.map(s -> Integer.parseInt(s));
        //遍历stream2流对象
        //stream2.forEach(s-> System.out.println(s+100));

        //链式编程
        stream.map(s -> Integer.parseInt(s)).forEach(s-> System.out.println(s));

        Stream<String> stream3 = Stream.of("张三", "李四", "王五");
        //需求:使用map方法,把String类型的Stream流转换为Person类型的Stream流
        //Stream<Person> stream4 = stream3.map(s -> new Person(s));
        //遍历stream4流对象
        //stream4.forEach(p-> System.out.println(p));
        //链式编程
        stream3.map(s -> new Person(s)).forEach(p-> System.out.println(p));
    }
}
