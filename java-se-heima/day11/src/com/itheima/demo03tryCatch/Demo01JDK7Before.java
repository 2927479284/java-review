package com.itheima.demo03tryCatch;

import java.io.FileWriter;
import java.io.IOException;

/*
    JDK7之前使用try...catch...finally处理异常
    格式:
        try{
            //可能产生异常的代码
        }catch(定义一个异常相关的变量){
            //异常的处理逻辑
        }
        ...
        catch(定义一个异常相关的变量){
            //异常的处理逻辑
        }finally{
            //一定会执行的代码(释放资源)
        }
   -------------------------------
   快捷键:选中有异常的代码=>ctrl+alt+t==>选择try...catch...finally
 */
public class Demo01JDK7Before {
    public static void main(String[] args) {
        /*
            1.把fw.close();放在finally中,程序报错:出了变量fw的作用域,找不到了
                Cannot resolve symbol 'fw'
                解决:提高变量fw的作用域,定义在try的外边
            2.Variable 'fw' might not have been initialized
                变量fw没有一个初始化的赋值
                fw = new FileWriter("day11\\5.txt",true);
                这行代码抛出了异常变量fw是没有值的,是不能使用
                解决:给变量fw一个默认值
         */
        FileWriter fw = null;
        try {
            fw = new FileWriter("f:\\day11\\5.txt",true);
            for (int i = 1; i <=3 ; i++) {
                fw.write("你好"+i+"\r\n");
            }
        } catch (IOException e) {
            System.out.println("程序抛出了文件找不到异常:"+e);
        } finally {
            /*
            3.Unhandled exception: java.io.IOException
                close方法本身就声明抛出了IOException,必须放在try中
                解决:增加一个try...catch
            4.这样代码fw = new FileWriter("f:\\day11\\5.txt",true);创建对象失败了
                FileWriter fw = null; fw的值就是null,finally中代码一定会执行
                执行 fw.close()==> null.close();null是不能调用方法的,会抛出NullPointerException
                解决:增加一个判断,fw不是null在释放资源
             */
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("后续100行代码!");
    }
}
