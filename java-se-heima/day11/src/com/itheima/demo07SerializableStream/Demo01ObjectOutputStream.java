package com.itheima.demo07SerializableStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
    java.io.ObjectOutputStream:对象的序列化流
    作用:把对象以流的方式写入到文件中保存(在客户端和服务器之间发送对象)
    构造方法:
        ObjectOutputStream(OutputStream out) 参数传递字节输出流
    特有的成员方法:
        void writeObject(Object obj) 将指定的对象写入 ObjectOutputStream。
    使用步骤:
        1.创建ObjectOutputStream对象,构造方法中传递FileOutputStream对象
        2.使用ObjectOutputStream对象中的方法writeObject,把对象写入到文件中
        3.释放资源
 */
public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        //1.创建ObjectOutputStream对象,构造方法中传递FileOutputStream对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day11\\person.txt"));
        //2.使用ObjectOutputStream对象中的方法writeObject,把对象写入到文件中
        oos.writeObject(new Person("小美女",18));
        //3.释放资源
        oos.close();
    }
}
