package com.itheima.demo07SerializableStream;

import java.io.*;
import java.util.ArrayList;

/*
    练习:序列化集合
 */
public class Demo03Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        show02();
    }

    /*
        需求:
            使用序列化流往文件中存储多个对象
            使用反序列化流读取文件中存储的多个对象
        解决:
            可以多个对象存储到一个集合中,对集合对象进行一次序列化和反序列化
     */
    private static void show02() throws IOException, ClassNotFoundException {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三",18));
        list.add(new Person("李四",19));
        list.add(new Person("王五",20));
        list.add(new Person("赵六",21));
        list.add(new Person("田七",22));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day11\\list02.txt"));
        oos.writeObject(list);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day11\\list02.txt"));
        //多态 Object obj = new ArrayList<>();
        Object obj = ois.readObject();
        //向下转型:才能遍历集合
        ArrayList<Person> list2 = (ArrayList<Person>)obj;
        for (Person p : list2) {
            System.out.println(p);
        }
        ois.close();
    }

    /*
        需求:
            使用序列化流往文件中存储多个对象
            使用反序列化流读取文件中存储的多个对象
     */
    private static void show01() throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day11\\list01.txt"));
        oos.writeObject(new Person("张三",18));
        oos.writeObject(new Person("李四",19));
        oos.writeObject(new Person("王五",20));
        oos.writeObject(new Person("赵六",21));
        oos.writeObject(new Person("田七",22));
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day11\\list01.txt"));
        System.out.println(ois.readObject());//Person{name='张三', age=18}
        System.out.println(ois.readObject());//Person{name='李四', age=19}
        System.out.println(ois.readObject());//Person{name='王五', age=20}
        System.out.println(ois.readObject());//Person{name='赵六', age=21}
        System.out.println(ois.readObject());//Person{name='田七', age=22}
        //System.out.println(ois.readObject());//EOFException 当输入过程中意外到达文件或流的末尾时，抛出此异常。

        //read方法:读取到-1结束  readLine方法:读取到null结束  readObject:抛出异常结束(没法使用循环)
        ois.close();
    }
}
