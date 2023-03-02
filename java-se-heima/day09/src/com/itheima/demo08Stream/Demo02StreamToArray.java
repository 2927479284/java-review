package com.itheima.demo08Stream;

import java.util.Arrays;
import java.util.stream.Stream;

/*
    将流中的元素收集到数组（将流转成数组）
    Stream接口中的方法
    Object[] toArray() 把Stream流转换为数组
 */
public class Demo02StreamToArray {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("美羊羊", "喜羊羊",
                "懒羊羊", "沸羊羊", "慢羊羊", "暖羊羊","美羊羊");
        Object[] arr = stream.toArray();
        System.out.println(Arrays.toString(arr));
    }
}
