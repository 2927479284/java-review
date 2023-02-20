package com.itheima.demo12Arrays;

import java.util.Arrays;

/*
    java.util.Arrays:操作数组的工具类
    Array:数组
        此类包含用来操作数组（比如排序和搜索）的各种方法。
    静态成员方法:通过类名.方法名可以直接使用
        static String toString(Object[] a)返回指定数组内容的字符串表示形式。
        static void sort(Object[] a) 根据元素的自然顺序对指定对象数组按升序进行排序。
        sort:排序
        升序:小->大
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr);
        //static String toString(Object[] a)返回指定数组内容的字符串表示形式。
        String s = Arrays.toString(arr);
        System.out.println(s);//[3, 1, 2, 5, 4]

        //static void sort(Object[] a) 根据元素的自然顺序对指定对象数组按[升序]进行排序。
        System.out.println("排序前数组中的元素:"+Arrays.toString(arr));//排序前数组中的元素:[3, 1, 2, 5, 4]
        Arrays.sort(arr);//升序排序
        System.out.println("排序后数组中的元素:"+Arrays.toString(arr));//排序后数组中的元素:[1, 2, 3, 4, 5]

        String[] arr2 = {"AA","12","AC","23","aa","ab"};
        /*
            static void sort(Object[] a) 根据元素的自然顺序对指定对象数组按[升序]进行排序。
            自然顺序:编码表的顺序
                '0':48
                'A':65
                'a':97
         */
        System.out.println("排序前数组中的元素:"+Arrays.toString(arr2));//排序前数组中的元素:[AA, 12, AC, 23, aa, ab]
        Arrays.sort(arr2);
        System.out.println("排序后数组中的元素:"+Arrays.toString(arr2));//排序后数组中的元素:[12, 23, AA, AC, aa, ab]

    }
}
