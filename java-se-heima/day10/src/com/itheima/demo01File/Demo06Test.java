package com.itheima.demo01File;

import java.io.File;
import java.util.Scanner;

/*
    File类目录遍历综合练习题
    需求:
        键盘录入一个文件路径，根据文件路径创建File对象，判断是文件还是文件夹
        如果是文件，则输出文件的大小
        如果是文件夹，则计算该文件夹下所有文件大小之和并输出(不包含子文件夹)。
    步骤:
        1.创建键盘录入Scanner对象
        2.接收键盘录入的字符串路径
        3.根据字符串路径创建文件对象
        4.判断文件对象是文件还是文件夹，如果是文件，则直接输出文件大小
        5.如果是文件夹
        5.1定义一个求和变量,记录累加求和
        5.2遍历文件夹,获得该文件夹下所有的文件
        5.3获取文件大小,累加到求和变量中
        5.4最后输出求和变量的值。
 */
public class Demo06Test {
    public static void main(String[] args) {
        //1.创建键盘录入Scanner对象
        Scanner sc = new Scanner(System.in);
        //2.接收键盘录入的字符串路径
        System.out.println("请输入一个文件|文件夹路径:");
        String path = sc.nextLine();
        //3.根据字符串路径创建文件对象
        File file = new File(path);
        //4.判断文件对象是文件还是文件夹，如果是文件，则直接输出文件大小
        //先判断路径是否存在,存在在判断是文件还是文件夹
        if(file.exists()){
            if(file.isDirectory()){
                //5.如果是文件夹
                //5.1定义一个求和变量,记录累加求和
                long sum = 0;
                //5.2遍历文件夹,获得该文件夹下所有的文件
                File[] files = file.listFiles();
                for (File f : files) {
                    //5.3获取文件大小,累加到求和变量中
                    sum+=f.length();
                }
                //5.4最后输出求和变量的值。
                System.out.println("您输入的是一个文件夹,文件夹中所有文件的大小为:"+sum+"字节");
            }else{
                //如果是文件，则直接输出文件大小
                System.out.println("您输入的路径是一个文件,文件的大小为:"+file.length()+"字节");
            }
        }else{
            System.out.println("您输入的路径有误!");
        }
    }
}
