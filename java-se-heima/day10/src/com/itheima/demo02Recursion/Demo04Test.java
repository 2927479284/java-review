package com.itheima.demo02Recursion;

import java.io.File;

/*
    综合案例1:文件搜索
        模拟windows系统中的文件搜索功能
        搜索出d:\aaa目录中的所有.java文件结尾的文件,并打印文件的绝对路径
   分析:
        1.定义一个方法,方法的参数传递File类型的目录,在方法中对目录进行遍历
        2.使用File类中的方法ListFiles遍历目录,获取每一个元素(File对象)
        3.判断遍历得到的File对象是一个文件,还是一个文件夹
        4.是一个文件,判断是否为.java结尾的文件,是则打印文件的绝对路径
        5.是一个文件夹,调用本方法,继续遍历文件夹(递归)
 */
public class Demo04Test {
    public static void main(String[] args) {
        getAllFile(new File("d:\\"));
    }

    //1.定义一个方法,方法的参数传递File类型的目录,在方法中对目录进行遍历
    public static void getAllFile(File dir){
        //2.使用File类中的方法ListFiles遍历目录,获取每一个元素(File对象)
        File[] files = dir.listFiles();
        //增加一个判断,防止空指针异常
        if(files!=null && files.length>0){
            for (File f : files) {
                //3.判断遍历得到的File对象是一个文件,还是一个文件夹
                if(f.isFile()){
                    //4.是一个文件,判断是否为.java结尾的文件,是则打印文件的绝对路径
                /*
                    a.把f(File对象)转换为String  "D:\aaa\b\B.JAVA"
                        getName  getPath  getAbsolutePath  toString==>String
                    b.把字符串转换为小写字符串    "D:\aaa\b\b.java"
                    c.判断字符串是否以.java结尾
                 */
                    if(f.getName().toLowerCase().endsWith(".java")){
                        System.out.println(f.getAbsolutePath());
                    }
                }else{
                    //5.是一个文件夹,调用本方法,继续遍历文件夹(递归)
                    getAllFile(f);
                }
            }
        }
    }
}
