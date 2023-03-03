package com.itheima.demo01File;

import java.io.File;
import java.io.IOException;

/*
    File类的成员方法_创建删除功能的方法(重点)
    public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
    public boolean mkdir() ：创建由此File表示的目录。
    public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录。
    public boolean delete() ：删除由此File表示的文件或目录。
 */
public class Demo04FileMethod {
    public static void main(String[] args) throws IOException {
        show03();
    }

    /*
        public boolean delete() ：删除构造方法传递的文件|文件夹
        返回值:boolean
            文件|文件夹存在,删除成功,返回true
            文件|文件夹不存在,删除失败,返回false
            文件夹中有内容,不会删除,返回false
        注意:
            此删除方法,不走回收站,直接在硬盘删除,需要谨慎
     */
    private static void show03() {
        File f1 = new File("d:\\1.txt");
        boolean b1 = f1.delete();
        System.out.println("b1:"+b1);

        File f2 = new File("day10\\aaa");
        boolean b2 = f2.delete();
        System.out.println("b2:"+b2);

        File f3 = new File("day10\\111");
        boolean b3 = f3.delete();
        System.out.println("b3:"+b3);//b3:false 文件夹中有内容,不会删除
    }

    /*
        mk:make 创建,创造  dir:directory 文件夹
        public boolean mkdir() ：只能创建单级文件夹
        public boolean mkdirs() ：既能创建单级文件夹,又能创建多级文件夹
        返回值:boolean
            文件夹不存在,创建成功,返回true
            文件夹存在,不会创建(覆盖),返回false 构造方法中路径不存在,返回false
        注意:
            1.此方法只能创建文件夹,不能创建文件
            2.创建文件夹路径和文件夹名称,在构造方法中给出
     */
    private static void show02() {
        File f1 = new File("day10\\aaa");
        boolean b1 = f1.mkdir();
        System.out.println("b1:"+b1);

        File f2 = new File("day10\\111\\222\\333\\444\\555\\666");
        boolean b2 = f2.mkdirs();
        System.out.println("b2:"+b2);

        File f3 = new File("f:\\abc");
        boolean b3 = f3.mkdir();
        System.out.println("b3:"+b3);//b3:false 路径不存在
    }

    /*
        create:创建
        public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
        返回值:boolean
            文件不存在,创建成功,返回true
            文件存在,不会创建(覆盖),返回false
        注意:
            1.此方法只能创建文件,不能创建文件夹
            2.创建文件路径和文件名称,在构造方法中给出
            3.创建的文件的路径不存在,会抛出异常
            4.有些操作系统的c盘没有权限创建文件,会抛出拒绝访问异常
     */
    private static void show01() throws IOException {
        File f1 = new File("d:\\1.txt");
        boolean b1 = f1.createNewFile();
        System.out.println("b1:"+b1);

        File f2 = new File("day10\\2.txt");
        boolean b2 = f2.createNewFile();
        System.out.println("b2:"+b2);

        File f3 = new File("f:\\3.txt");
        //boolean b3 = f3.createNewFile();//IOException: 系统找不到指定的路径。

        File f4 = new File("d:\\afdsafa\\3.txt");
        //boolean b4 = f4.createNewFile();//IOException: 系统找不到指定的路径。 afdsafa文件夹不存在
    }
}
