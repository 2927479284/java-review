package com.itheima.demo01Collections;

import java.util.ArrayList;
import java.util.Collections;


/**
 *     java.util.Collections是集合工具类，用来对集合进行操作。
 *       常用方法如下：
 *     - public static void shuffle(List<?> list):打乱集合中元素顺序。
 *     - public static <T> void sort(List<T> list):根据元素的自然顺序对指定列表按升序进行排序。
 *     注意:
 *         以上两个方法的参数,只能传递List集合,对List集合进行排序|打乱顺序
 *         不能传递Set集合
 */
public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(5);
        list01.add(6);
        list01.add(4);
        list01.add(2);
        System.out.println(list01);//[1, 3, 5, 6, 4, 2]

        //public static <T> void sort(List<T> list):根据元素的自然顺序对指定集合按升序进行排序。
        //升序:小==>大  降序:大==>小
        Collections.sort(list01);
        System.out.println(list01);//[1, 2, 3, 4, 5, 6]

        //public static void shuffle(List<?> list):[随机]打乱集合中元素顺序。
        Collections.shuffle(list01);
        System.out.println(list01);//[4, 3, 6, 2, 5, 1] [2, 6, 3, 4, 5, 1] [4, 5, 3, 2, 6, 1] [6, 1, 4, 5, 2, 3]

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("aa");
        list02.add("AA");
        list02.add("AD");
        list02.add("bb");
        list02.add("12");
        list02.add("ab");
        System.out.println(list02);//[aa, AA, AD, bb, 12, ab]
        Collections.sort(list02);//自然顺序:编码表的顺序
        System.out.println(list02);//[12, AA, AD, aa, ab  , bb]


        System.out.println("--------------------------自写测试--------------------------------------");
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(7);
        integers.add(5);
        integers.add(6);
        integers.add(0);
        integers.add(12);
        integers.add(10000);
        System.out.println("--------------------------排序--------------------------------------");
        Collections.sort(integers);
        System.out.println(integers);
        System.out.println("--------------------------打乱顺序--------------------------------------");
        Collections.shuffle(integers);
        System.out.println(integers);

    }
}
