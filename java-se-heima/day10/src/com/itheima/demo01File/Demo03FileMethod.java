package com.itheima.demo01File;

import java.io.File;

/*
    File类的成员方法_判断功能的方法(重点)
    public boolean exists() ：此File表示的文件或目录是否实际存在。
    public boolean isDirectory() ：此File表示的是否为目录。
    public boolean isFile() ：此File表示的是否为文件。
 */
public class Demo03FileMethod {
    public static void main(String[] args) {
        show02();
    }

    /*
        public boolean isDirectory() ：判断构造方法中传递的路径是否以文件夹结尾
            是文件夹结尾,返回true
            不是文件夹结尾,返回false
        public boolean isFile() ：判断构造方法中传递的路径是否以文件结尾
            是文件结尾,返回true
            不是文件结尾,返回false
        注意:
            1.以上两个方法使用的前提,路径必须是真实存在的,否则两个方法都返回false
            2.在计算机中只有文件和文件夹,所以两个方法互斥
     */
    private static void show02() {
        File f1 = new File("c:\\abcde");//路径不存在
        System.out.println(f1.isDirectory());//false
        System.out.println(f1.isFile());//false
        System.out.println("------------------------------");
        File f2 = new File("day10\\a.txt");
        if(f2.exists()){
            System.out.println(f2.isDirectory());//false
            System.out.println(f2.isFile());//true
        }
        System.out.println("------------------------------");
        File f3 = new File("day10");
        if(f3.exists()){
            System.out.println(f3.isDirectory());//true
            System.out.println(f3.isFile());//false
        }
    }

    /*
        public boolean exists() ：判断构造方法中传递的路径是否存在
            路径存在,返回true
            路径不存在,返回false
     */
    private static void show01() {
        File f1 = new File("c:\\1.jpg");
        System.out.println(f1.exists());//true

        File f2 = new File("c:\\1afadsfdsafdsaf.jpg");
        System.out.println(f2.exists());//false

        File f3 = new File("day10\\a.txt");
        System.out.println(f3.exists());//true

        File f4 = new File("day11");
        System.out.println(f4.exists());//false
    }
}
