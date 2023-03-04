package com.itheima.demo01File;


import java.io.File;
import java.util.Arrays;

/**
 * File文件操作自写
 */
public class Demo07ZiXieTest
{
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator.DESKTOP-31RFSET\\Desktop\\测试File");
        //1.遍历当前目录返回对应的所有的名称[只能遍历当前目录 如存在子级目录不会在进行遍历]
        String[] list = file.list();

        System.out.println("String数组打印："+ Arrays.toString(list));

        //2.遍历当前目录返回对应的所有的对象 文件夹&文件都有一个file对象 可对当前对象进行一些操作
        File[] files = file.listFiles();
        assert files != null;
        for (File file1 : files) {
            System.out.println("File对象数组打印："+file1);
        }

    }
}
