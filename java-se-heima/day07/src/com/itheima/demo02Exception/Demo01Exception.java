package com.itheima.demo02Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    运行时(期)异常:运行程序之后出现的异常
 */
public class Demo01Exception {
    public static void main(String[] args) {
        /*try {
            int[] arr = {10,20,30};
            System.out.println(arr[3]);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        //就算我们使用try...catch处理这个异常实际上数组还是越界的

        //在工作中:运行期异常我们必须的修改代码,不让运行期异常出现,从根本上解决问题
        int[] arr = {10,20,30};
        System.out.println(arr[1]);

        System.out.println("后续100行代码!");
    }
}
