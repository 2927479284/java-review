package com.itheima.demo07SerializableStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
    java.io.ObjectInputStream:对象的反序列化流
    作用:把文件中保存的对象,以流的方式读取出来
    构造方法:
        ObjectInputStream(InputStream in) 参数传递字节输入流
    特有的成员方法:
        Object readObject() 从 ObjectInputStream 读取对象。
    使用步骤:
        1.创建ObjectInputStream对象,构造方法中传递FileInputStream对象
        2.使用ObjectInputStream对象中的方法readObject,读取文件中保存的对象
        3.释放资源
    注意:
        public final Object readObject()throws IOException, ClassNotFoundException
        readObject方法声明抛出了两个异常
        ClassNotFoundException:class文件找不到异常
        反序列化有两个前提:1.类实现Serializable接口 2.反序列化类(Person)必须有class文件(Person.class)
 */
public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1.创建ObjectInputStream对象,构造方法中传递FileInputStream对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day11\\person.txt"));
        //2.使用ObjectInputStream对象中的方法readObject,读取文件中保存的对象
        Object obj = ois.readObject();
        System.out.println(obj);//Person{name='小美女', age=18}
        //想要使用Person特有的方法,需要向下转型
        Person p = (Person)obj;
        System.out.println(p.getName()+"\t"+p.getAge());
        System.out.println();
        //3.释放资源
        ois.close();
    }
}
