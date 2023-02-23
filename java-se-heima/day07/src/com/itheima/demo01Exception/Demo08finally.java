package com.itheima.demo01Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    finally代码块
    格式：
        try {
            【A】可能会出现异常的代码
        } catch(定义一个异常相关的变量) {
            【B】出现异常后执行的代码(异常的处理逻辑)
        } finally {
            【C】一定会执行的代码(释放资源)
        }

    finally代码块的特点：
        finally代码块的内容无论程序是否出现异常都会执行。
 */
public class Demo08finally {
    public static void main(String[] args) throws ParseException {

        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse("2022-324");
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }finally {
            System.out.println("上述异常非运行期异常");
        }
        /*
            程序执行流程:
            1.没有异常: A C D
            2.有异常:   B C D
         */
        /*try {
            //【A】可能会出现异常的代码
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse("2022-324");
            System.out.println("[A]:"+date);
        } catch (ParseException e) {
            //【B】出现异常后执行的代码(异常的处理逻辑)
            System.out.println("[B]:"+e.toString());
        } finally {
            //【C】一定会执行的代码(释放资源)
            System.out.println("[C]:无论程序是否出现异常,都会执行");
        }*/

        /*
            程序执行流程:
            1.没有异常: A C D
            2.有异常:   C JVM终止程序
         */
//        try {
//            //【A】可能会出现异常的代码
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//            Date date = sdf.parse("2022-324");
//            System.out.println("[A]:"+date);
//        }  finally {
//            //【C】一定会执行的代码(释放资源)
//            System.out.println("[C]:无论程序是否出现异常,都会执行");
//        }
//
//        System.out.println("[D]:后续代码!");
    }
}
