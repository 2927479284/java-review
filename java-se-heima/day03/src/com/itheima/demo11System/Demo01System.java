package com.itheima.demo11System;

import java.util.Date;

/**
 *     java.lang.System类
 *         System:系统
 *         类中提供的大量的静态方法,可以获取与系统相关的信息
 *         System类不能被实例化,不能创建对象(私有的空参数构造方法)
 */
public class Demo01System {
    public static void main(String[] args) {
        show03();
    }

    /*
        了解:扩展
        static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 数组复制
        参数：
            src - 源数组。
            srcPos - 源数组中的起始位置。
            dest - 目标数组。
            destPos - 目标数据中的起始位置。
            length - 要复制的数组元素的数量。
        需求:
            把数组{1,2,3,4,5}中前3个元素{1,2,3}复制到目标数组中{0,0,0,0,0};
            得到的结果:{1,2,3,0,0}
     */
    private static void show03() {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[arr1.length];
        //遍历arr2
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        //数组的复制
        System.arraycopy(arr1,0,arr2,0,3);
        System.out.println("----------------------------------------");
        //遍历arr2
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

    /*
        static long currentTimeMillis() 返回以毫秒为单位的当前时间。
        就相当于 long new Date().getTime();
        获取当前系统时间对应的毫秒值
        作用:可以程序的效率
        需求:
            测试使用for循环打印1-100000需要多少毫秒
     */
    private static void show02() {
        long s = System.currentTimeMillis();
        System.out.println(s);//1647597717146
        //打印1-100000需要多少毫秒
        /*for (int i = 1; i <= 100000; i++) {
            System.out.println(i);
        }*/
        long e = new Date().getTime();
        System.out.println("打印1-100000需要:"+(e-s)+"毫秒");//打印1-100000需要:1113毫秒
    }

    /*
        static void exit(int status) 终止当前正在运行的 Java 虚拟机。
        参数:
            int status:状态码
                根据惯例，非 0 的状态码表示异常终止。
                0:正常终止
     */
    private static void show01() {
        while (true){
            System.out.println("学习java最有效的方法,就是敲代码");
            //break;//结束循环
            System.exit(0);
        }
        //System.out.println("呵呵");
    }
}
