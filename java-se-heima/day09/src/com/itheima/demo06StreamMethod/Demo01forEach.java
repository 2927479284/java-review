package com.itheima.demo06StreamMethod;

import java.util.function.Consumer;
import java.util.stream.Stream;

/*
   Stream流中的常用方法_forEach:用于遍历Stream流中的元素
       void forEach​(Consumer<? super T> action) 对此流的每个元素执行操作。
       参数:
           Consumer<? super T> action:是一个消费型的接口,参数可以传递Lambda表达式
           唯一的抽象方法:
               void accept​(T t) :消费一个指定泛型类型的数据
   注意:
       forEach方法是一个终结方法,没有返回值;也不能使用链式编程调用Stream流中的其他方法了
*/
public class Demo01forEach {
    public static void main(String[] args) {
        //获取Stream流对象
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        //使用forEach方法遍历Stream流:依次打印Stream流中的元素
        /*stream.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        });*/

        //Consumer是一个函数式接口,所以可以使用Lambda表达式简化接口的匿名内部类
        /*
            IllegalStateException: stream has already been operated upon or closed
            非法状态异常:Stream流对象只能使用一次,使用完毕就会转换到下一个Stream流对象
            之前的Stream流对象就会关闭了
         */
        /*stream.forEach((Integer i)->{
            System.out.println(i);
        });*/

        //Stream流的简化格式
        //stream.forEach(i-> System.out.println(i));
        stream.forEach(s-> System.out.println(s));
    }
}
