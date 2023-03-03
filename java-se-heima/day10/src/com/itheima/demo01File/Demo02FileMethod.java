package com.itheima.demo01File;

import java.io.File;

/*
    File类的成员方法_获取功能的方法(重点)
    public String getAbsolutePath() ：获取构造方法中传递路径的绝对路径。
        构造方法中传递的路径是绝对的,直接返回绝对路径
        构造方法中传递的路径是相对的,会在相对路径前添加项目根目录,组成绝对路径返回
    public String getPath() ：返回构造方法中传递的路径
        构造方法中传递的路径是绝对的,就返回绝对路径
        构造方法中传递的路径是相对的,就返回相对路径
    public String getName()  ：返回由此File表示的文件或目录的名称。
    public long length()  ：返回由此File表示的文件的大小。 不能获取目录的大小。
 */
public class Demo02FileMethod {
    public static void main(String[] args) {
        show03();
    }

    /*
        public long length()  ：获取构造方法传递文件的大小,单位是字节.不能获取目录(文件夹)的大小。
        注意:
            1.构造方法中传递的文件不存在,此方法返回0
            2.构造方法中传递的是一个文件夹的路径,则返回值是不确定的(文件夹是没有大小概念的)
     */
    private static void show04() {
        File f1 = new File("c:\\1.jpg");
        System.out.println(f1.length());//161,548 字节

        File f2 = new File("c:\\缘起.mp4");
        System.out.println(f2.length());//67,995,218 字节

        File f3 = new File("day10\\1.jpg");
        System.out.println(f3.length());//0 文件不存在

        File f4 = new File("D:\\Work_idea\\EE390\\day10");
        System.out.println(f4.length());//0 4096 文件夹是没有大小概念的
    }

    /*
        public String getName()  ：返回由此File表示的文件或目录的名称。
            获取构造方法中传递的路径的末尾的文件|文件夹名称
     */
    private static void show03() {
        File f1 = new File("D:\\Work_idea\\EE390\\day10\\a.txt");
        System.out.println(f1.getName());//a.txt

        File f2 = new File("D:\\Work_idea\\EE390");
        System.out.println(f2.getName());//EE390

        File f3 = new File("aaa/bbb/ccc/ddd/eee/fff/1.jpg");
        System.out.println(f3.getName());//1.jpg
    }


    /*
        public String getPath() ：返回构造方法中传递的路径
            构造方法中传递的路径是绝对的,就返回绝对路径
            构造方法中传递的路径是相对的,就返回相对路径
        File类重写了Object类的toString方法
        public String toString() {
            return getPath();
        }
     */
    private static void show02() {
        File f1 = new File("D:\\Work_idea\\EE390\\day10\\a.txt");
        System.out.println(f1.getPath());//D:\Work_idea\EE390\day10\a.txt

        File f2 = new File("day10\\a.txt");
        System.out.println(f2.getPath());//day10\a.txt
        System.out.println(f2.toString());//day10\a.txt
        System.out.println(f2);//day10\a.txt
    }

    /*
        Absolute:绝对的
        public String getAbsolutePath() ：获取构造方法中传递路径的绝对路径。
        构造方法中传递的路径是绝对的,直接返回绝对路径
        构造方法中传递的路径是相对的,会在相对路径前添加项目根目录,组成绝对路径返回
     */
    private static void show01() {
        File f1 = new File("D:\\Work_idea\\EE390\\day10\\a.txt");
        System.out.println(f1.getAbsolutePath());//D:\Work_idea\EE390\day10\a.txt

        File f2 = new File("day10\\a.txt");
        System.out.println(f2.getAbsolutePath());//D:\Work_idea\EE390\day10\a.txt

        File f3 = new File("day10\\src");
        System.out.println(f3.getAbsolutePath());//D:\Work_idea\EE390\day10\src
    }
}
