package com.itheima.demo01Exception;

/*
    异常的产生过程解析:分析一下异常是如何产生的,产生异常之后JVM是如何处理异常的
 */
public class Demo02Exception {
    public static void main(String[] args) {
        int[] arr = {10,20,30};
        int element = getElement(arr, 3);
        System.out.println(element);
    }

    /*
        定义一个方法,获取数组指定索引处的元素并返回
     */
    public static int getElement(int[] arr,int index){
        int e = arr[index];
        return e;
    }
}
