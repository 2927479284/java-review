package com.itheima.demo06Test;

import java.util.HashMap;
import java.util.Scanner;

/*
    Map集合的练习
    需求：
        输入一个字符串,统计字符串中每个字符出现次数
    分析:
        1.使用Scanner获取用户键盘输入的字符串
        2.创建一个Map集合,key使用Character类型,存储字符,value使用Integer类型,存储字符个数
        3.遍历字符串,获取字符串中每一个字符
            a.charAt(i)+length()
            b.把字符串转换为字符数组,遍历数组
        4.判断遍历得到的字符在Map集合中是否已经存在
            boolean containsKey(Object key)  判断Map集合是否包含指定key
            a.false:不包含==>第一次存储字符
                map.put('字符',1);
            b.true:包含==>不是第一次存储
                根据key获取value
                value++
                把改变后的value存储到Map中(更新)
 */
public class Demo01Test {
    /**
     * 重写
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一段字符(进行每个字符出现的次数)");
        String next = scanner.next();

        //用户输入的转换成字符数组
        char[] chars = next.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char aChar : chars) {

            if (map.containsKey(aChar)){
                //key存在 [HashMap key不允许重复]
                Integer value = map.get(aChar);
                value++;
                map.put(aChar,value);
            }else {
                map.put(aChar,1);
            }
        }
        System.out.println(map);
    }
}
