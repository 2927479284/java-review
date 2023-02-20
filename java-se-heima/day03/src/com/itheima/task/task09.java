package com.itheima.task;

import java.util.Arrays;

/**
 * 有以下数组：
 * 		int[] arr = {10,27,8,5,2,1,3,55,88};
 * 	请定义一个新数组，长度为5，并将arr中几个连续的1位数的数字复制到新数组。
 */
public class task09 {

    public static void main(String[] args) {
        int [] arr = {10,27,8,5,2,1,3,55,88};
        int [] arr1 = new int[5];
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<10){
                arr1[num] = arr[i];
                num++;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
