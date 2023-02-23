package com.itheima.demo01Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    try…catch异常处理
    异常处理的第二种方式
    作用
        1.throw关键字抛出的是编译期异常,我们就必须的处理这个异常
        2.调用了一个声明抛出编译期异常的方法,我们就必须的处理这个异常
        就可以使用try catch关键字自己手动处理异常
    好处:
	    使用try catch处理异常,可以继续执行try catch后边的代码
    注意:
        1.try中产生了异常对象,那么就会执行catch中异常的处理逻辑,执行完毕会继续执行try catch之后的代码
        2.try中没有产生异常对象,那么就不会执行catch中异常的处理逻辑,执行完try中的代码,会继续执行try catch之后的代码
    快捷键 选择中代码==>ctrl+alt+T==>选择try catch
    try:捕获
    catch:接住
 */
public class Demo06tryCatch {
    public static void main(String[] args) {
        try {
            //可能会产生异常的代码
            readFile("d:\\abc.java");
        } catch (FileNotFoundException e) {//FileNotFoundException e = new FileNotFoundException("传递的文件的路径不是d:\\abc.java");
            //异常的处理逻辑:可以随意编写
            System.out.println("哈哈");
        }catch (IOException e) {//IOException e= new IOException("传递的文件的路径是null");
            System.out.println("呵呵");
        }
        System.out.println("后续100行代码!");
    }


    public static void readFile(String path)throws FileNotFoundException,IOException {
        if(path==null){
            throw new IOException("传递的文件的路径是null");
        }

        if(!path.equals("d:\\abc.java")){
            throw new FileNotFoundException("传递的文件的路径不是d:\\abc.java");
        }

        //路径没有问题,读取文件
        System.out.println("读取到了d:\\abc.java文件,文件中的内容是abc");
    }
}
