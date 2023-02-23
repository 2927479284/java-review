package com.itheima.demo01Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    异常的体系和分类
 */
public class Demo01 {
    public static void main(String[] args) {
        //java.lang.Exception extends Throwable类:编译期异常,在写代码的时候,程序报的异常
//        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            Date date = sdf.parse("2022-324");
//            System.out.println(date);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }

        //java.lang.RuntimeException extends Exception:运行期(时)异常,在运行代码的时候,程序报的异常
/*
        try {
            int[] arr = {10,20,30};
            System.out.println(arr[3]);
        } catch (Exception e) {
            e.printStackTrace();
        }
*/

        /*
            -- java.lang.Error extends Throwable类 :错误
            OutOfMemoryError: Java heap space:内存溢出的错误
            创建的数组太大了,超出了内存的使用范围(内存装不下了)
         */
        //int[] arr = new int[1000*1000*1000];
        int[] arr = new int[1000*1000];

        System.out.println("后边还有100行代码要执行!");
    }
}
