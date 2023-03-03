package com.itheima.demo01File;

import java.io.File;

/*
    File类的构造方法
        public File(String pathname) ：通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
        public File(String parent, String child) ：从父路径名字符串和子路径名字符串创建新的 File实例。
        public File(File parent, String child) ：从父抽象路径名和子路径名字符串创建新的 File实例。
 */
public class Demo01FileConstructor {
    public static void main(String[] args) {
        //show02("c:\\","abc\\1.jpg");//c:\abc\1.jpg
        //show02("c:\\","a.txt");//c:\a.txt
        //show02("d:\\hello\\aaa","a.txt");//d:\hello\aaa\a.txt
        show03();
    }

    /*
        public File(File parent, String child) ：从父抽象路径名和子路径名字符串创建新的 File实例。
        参数:
            File parent:父路径
            String child:子路径
        把路径分成了两部分,一个父路径,一个子路径
        父路径和子路径可以分别传递不同的路径,组成各种各样的路径
     */
    private static void show03() {
        File p = new File("c:\\");
        File file  = new File(p,"a.txt");
        System.out.println(file);//c:\a.txt
    }

    /*
        public File(String parent, String child) ：从父路径名字符串和子路径名字符串创建新的 File实例。
        参数:
            String parent:父路径
            String child:子路径
        把路径分成了两部分,一个父路径,一个子路径
        父路径和子路径可以分别传递不同的路径,组成各种各样的路径
     */
    private static void show02(String parent, String child) {
        File file = new File(parent,child);
        System.out.println(file);
    }

    /*
        public File(String pathname) ：通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例。
        参数:
            String pathname:传递路径名称
        注意:
            1.参数传递的路径名称可以是绝对路径,也可以是相对路径
            2.参数传递的路径名称可以是以文件结尾的,也可以是以文件夹结尾的
            3.参数传递的路径名称可以是真实存在的,也可以是不存在的
                构造方法仅仅是把字符串路径,转换为File对象,不考虑路径真实情况
     */
    private static void show01() {
        File f1 = new File("c:/abc/1.jpg");
        System.out.println(f1);//c:\abc\1.jpg  File类重写了Object类的toString方法

        File f2 = new File("D:\\Work_idea\\EE390\\day10\\a.txt");
        System.out.println(f2);//D:\Work_idea\EE390\day10\a.txt

        File f3 = new File("day10\\a.txt");
        System.out.println(f3);//day10\a.txt

        File f4 = new File("C:\\demo");
        System.out.println(f4);//C:\demo
    }
}
