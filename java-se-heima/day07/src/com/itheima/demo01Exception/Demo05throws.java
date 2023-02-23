package com.itheima.demo01Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    在方法中抛出的多个异常对象,有子父类关系,在方法上声明父类异常对象即可
    public class FileNotFoundException extends IOException extends Exception
    main(String[] args) throws FileNotFoundException,IOException
    简化为:
        main(String[] args) throws IOException
        main(String[] args) throws Exception
 */
public class Demo05throws {
    /*
        main(String[] args) throws FileNotFoundException,IOException 把两个异常对象甩给JVM处理
     */
    public static void main(String[] args) throws Exception{
        //readFile(null);
        readFile("c:\\hello.java");
        System.out.println("后续100行代码!");
    }

    /*
        定义一个方法,方法的参数传递一个文件的路径 d:\\abc.java
        在方法中根据文件的路径,读取文件中的内容(IO流)
        readFile(String path)throws FileNotFoundException,IOException 把两个异常对象甩给main方法处理
     */
    public static void readFile(String path)throws FileNotFoundException,IOException{
        /*
            对文件的路径path进行合法性校验,判断path是否为null
            IOException:读写异常
         */
        if(path==null){
            throw new IOException("传递的文件的路径是null");
        }

        /*
            对文件的路径path进行合法性校验,判断path是否为d:\\abc.java
            FileNotFoundException:文件找不到异常
         */
        if(!path.equals("d:\\abc.java")){
           throw new FileNotFoundException("传递的文件的路径不是d:\\abc.java");
        }

        //路径没有问题,读取文件
        System.out.println("读取到了d:\\abc.java文件,文件中的内容是abc");
    }
}
