package com.itheima.demo03tryCatch;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/*
    JDK7后异常处理:
        JDK1.7版本之后,可以在try的后边增加一个小括号()
        在小括号中可以定义流对象,那么这个流对象的作用域就在try中有效
        执行完try中的代码,会[自动]把流对象释放资源,省略finally
    格式:
        try(定义流对象){
            使用流对象读取数据
        }catch(定义一个异常相关的变量){
            //异常的处理逻辑
        }
        ...
        catch(定义一个异常相关的变量){
            //异常的处理逻辑
        }
     注意:
        try后边的小括号中,不是所有的对象都可以放的
        对象所在的类必须的实现AutoCloseable接口,才可以自动释放资源
 */
public class Demo02JDK7After {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("day11\\5.txt",true);) {
            for (int i = 1; i <=3 ; i++) {
                fw.write("你好"+i+"\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(FileInputStream fis = new FileInputStream("c:\\748m.rar");
            FileOutputStream fos = new FileOutputStream("d:\\748m.rar");) {
            byte[] bytes = new byte[1024*200];
            int len = 0;
            while ((len = fis.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*try(Person p = new Person();) {

        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}
