package com.itheima.demo01File;

import java.io.File;

/*
    File类的成员方法_目录[文件夹]遍历的方法(重点)
    public String[] list()
        用于遍历目录,获取目录中所有文件和文件夹的名称,
        把多个名称存储到一个String类型的数组中返回
    public File[] listFiles()
        用于遍历目录,获取目录中所有文件和文件夹,
        把文件和文件夹封装为File对象,把多个File对象存储到一个File类型的数组中返回
    注意:
        1.要遍历的目录的路径和名称在构造方法中给出
        2.遍历的目录不存在,会抛出空指针异常
        3.以上两个方法只能遍历目录,不能遍历文件,要遍历文件,也会抛出空指针异常
 */
public class Demo05FileMethod {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator.DESKTOP-31RFSET\\Desktop\\文档资料");
        //File file = new File("D:\\aaa\\1.jpg");//NullPointerException
        //File file = new File("D:\\dfdsafdsafdsaf");//NullPointerException
        String[] arr = file.list();
        System.out.println(arr);
        //在工作中:在遍历数组和集合之前,增加一个非空判断
        if(arr!=null && arr.length>0){
            for (String fileName : arr) {
                System.out.println(fileName);
            }
        }
        System.out.println("-------------------");
        File[] files = file.listFiles();
        System.out.println(files);
        if(files!=null && files.length>0){
            for (File f : files) {
                System.out.println(f.getAbsolutePath());
            }
        }

    }
}
