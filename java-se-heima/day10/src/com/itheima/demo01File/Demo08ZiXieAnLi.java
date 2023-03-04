package com.itheima.demo01File;

import java.io.File;
import java.util.Scanner;

/**
 * File操作自写案例
 */
public class Demo08ZiXieAnLi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个路径获取其文件/文件夹内所有的文件的大小 【子目录不获取】");
        String next = scanner.next();
        File file = new File(next);
        if (file.exists()){
            if (file.isDirectory()){
                //1.目录
                File[] files = file.listFiles();
                Long sum = 0L;
                for (File file1 : files) {
                    sum +=file1.length();
                }
                System.out.println("您当前文件夹内所有文件总和大小为："+sum+" 字节。");
            }else {
                //2.文件
                System.out.println("当前文件的大小为：" + file.length() + " 字节。");
            }
        }else {
            throw new RuntimeException("您输入的地址有误");
        }
    }
}
