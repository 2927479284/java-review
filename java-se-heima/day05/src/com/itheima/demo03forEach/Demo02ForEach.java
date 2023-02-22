package com.itheima.demo03forEach;

import java.util.ArrayList;

/*
    注意:
        1.增强for循环底层就是一个迭代器,所有在使用增强for循环遍历的过程中
            不能修改集合的长度,会发生迭代器的并发修改异常
        2.增强循环仅仅是用于遍历,不会改变数组|集合中元素
 */
public class Demo02ForEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        for(String s: list){
            System.out.println(s);
        }
        int[] arr1 = {1,2,3};
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]*=2;
            System.out.println(arr1[i]);
        }
        System.out.println("arr1[0]:"+arr1[0]);



        int[] arr2 = {1,2,3};
        for (int s : arr2) {
            s*=2;
            System.out.println(s);
        }
        System.out.println("arr2[0]:"+arr2[0]);
    }
}
