package com.itheima.demo01Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    static <T> void sort(List<T> list, Comparator<? super T> c) 根据指定[比较器产生的顺序]对指定集合进行排序。
    参数:
        List<T> list:传递要排序的List集合
        Comparator<? super T> c:比较器
    java.util.Comparator<T> 接口:强行对某个集合进行整体排序的比较函数。
    成员方法:
        int compare(T o1, T o2) 比较用来排序的两个参数。
    参数:
        T o1, T o2:会依次获取到集合中相邻的两个元素
    排序的规则:
        o1-o2:升序排序
        o2-o1:降序排序
        o1==o2:两个元素相等
 */
public class Demo02Collections {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(5);
        list01.add(6);
        list01.add(4);
        list01.add(2);
        System.out.println(list01);//[1, 3, 5, 6, 4, 2]

        //static <T> void sort(List<T> list, Comparator<? super T> c) 根据指定[比较器产生的顺序]对指定集合进行排序。
        Collections.sort(list01, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //升序:o1-o2
                return o1-o2;
            }
        });
        System.out.println(list01);//[1, 2, 3, 4, 5, 6]

        //Collections.sort(list01, new ComparatorImpl());
        Collections.sort(list01, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //降序:o2-o1
                return o2-o1;
            }
        });
        System.out.println(list01);//[6, 5, 4, 3, 2, 1]


    }
}
