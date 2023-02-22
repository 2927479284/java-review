package com.itheima.demo03forEach;

import java.util.ArrayList;


/** 增强for循环:使用for循环的格式封装了迭代器,简化迭代器遍历的代码
 * 格式:
 *      for(元素的数据类型 变量名 : 集合名|数组名){
 *        sout(变量名);
 *      }
 */
public class Demo01ForEach {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int s : arr){
            System.out.println(s);
        }
        System.out.println("--------------------");
        double[] arr2 = {1.1,2.2,3.3};
        for(double d : arr2){
            System.out.println(d);
        }
        System.out.println("--------------------");
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        for(String s: list){
            list.remove(s);
            System.out.println(s);
        }
        System.out.println("--------------------");
        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student("张三",18));
        list2.add(new Student("李四",18));
        list2.add(new Student("王五",18));
        list2.add(new Student("赵六",18));
        list2.add(new Student("田七",18));
        //集合名.fori:普通for循环  集合名.for:增强for循环
        for (Student s : list2) {
            System.out.println(s);
        }
    }
}
