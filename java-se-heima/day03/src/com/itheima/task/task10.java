package com.itheima.task;

import java.util.Arrays;

/**
 * 	有以下数组：
 * 		int[] arr = {55,77,0,88,22,44,33};
 * 	请编程实现：将后四个数字依次前移一位，移动后，最后一位置为0.
 */
public class task10 {

    public static void main(String[] args) {
        int[] arr = {55,77,0,88,22,44,33};
        //后四个元素前移
            /*
        了解:扩展
        static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 数组复制
        参数：
            src - 源数组。
            srcPos - 源数组中的起始位置。
            dest - 目标数组。
            destPos - 目标数据中的起始位置。
            length - 要复制的数组元素的数量。
     */
        System.arraycopy(arr, arr.length - 4, arr, arr.length - 5, 4);

        //最后一位置为0
        arr[arr.length - 1] = 0;

        //打印结果
        System.out.println(Arrays.toString(arr));
    }

}
