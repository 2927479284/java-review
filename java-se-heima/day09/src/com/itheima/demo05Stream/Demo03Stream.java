package com.itheima.demo05Stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.stream.Stream;

/*
    5.3 获取流的方式
    1.在JDK1.8版本之后Collection接口,里边定义了一个方法叫stream,用于把集合转换为Stream流
        default Stream<E> stream() 返回一个序列 Stream与此集合作为其来源。
        Collection接口下所有的实现类都可以使用stream方法

    2.在JDK1.8版本之后,定义Stream接口,在接口定义了一个方法叫of,可以把可变参数(数组)转换为Stream流
        java.util.stream.Stream<T>接口
        static <T> Stream<T> of(T... values) 方法参数传递可变参数,也可以传递数组
 */
public class Demo03Stream {
    public static void main(String[] args) {
        show02();
    }

    /*
        把可变参数(数组)转换为Stream流
     */
    private static void show02() {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6);

        Stream<String> stream2 = Stream.of("aaa", "bbb", "ccc", "ddd");

        //可变参数底层就是一个数组,可以传递可变参数的方法,都可以传递数组
        String[] arr1 = {"aaa", "bbb", "ccc", "ddd"};
        Stream<String> stream3 = Stream.of(arr1);

        int[] arr2 = {1,2,3,4,5,6};
        //把int[]作为一个元素存储到Stream流中
        Stream<int[]> stream4 = Stream.of(arr2);
        System.out.println(stream4.count());//1

        //数组的类型不能使用基本类型,只能使用包装类
        Integer[] arr3 = {1,2,3,4,5,6};
        Stream<Integer> stream5 = Stream.of(arr3);
        System.out.println(stream5.count());//6
    }

    /*
        把Collection接口下的集合转换为Stream流
     */
    private static void show01() {
        ArrayList<String> list = new ArrayList<>();
        //把ArrayList集合转换为Stream流
        Stream<String> stream1 = list.stream();

        LinkedList<Integer> linked = new LinkedList<>();
        //把LinkedList集合转换为Stream流
        Stream<Integer> stream2 = linked.stream();

        HashSet<String> set = new HashSet<>();
        //把HashSet集合转换为Stream流
        Stream<String> stream3 = set.stream();

        HashMap<String,String> map = new HashMap<>();
        //map.stream();//Cannot resolve method 'stream()' Map集合不能转换为Stream流
    }
}
