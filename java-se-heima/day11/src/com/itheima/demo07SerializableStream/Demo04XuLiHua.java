package com.itheima.demo07SerializableStream;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 自定义序列化测试
 */
public class Demo04XuLiHua {


    public static void main(String[] args) throws Exception{
/*        write();
        read();*/
        writeList();
        readAll();
    }


    /** 对象的序列化
     * 对象写出至txt文件
     * @throws Exception
     */
    public static void write() throws Exception{

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator.DESKTOP-31RFSET\\Desktop\\java-review\\java-se-heima\\day11\\person01.txt"));
        Person01 zs = new Person01("张三", 999);
        Person01 zs1 = new Person01("张三1", 999);
        Person01 zs2 = new Person01("张三2", 999);
        Person01 zs3 = new Person01("张三3", 999);
        objectOutputStream.writeObject(zs);
        objectOutputStream.writeObject(zs1);
        objectOutputStream.writeObject(zs2);
        objectOutputStream.writeObject(zs3);
        objectOutputStream.close();
    }


    /**
     * 对象的反序列化
     * @throws Exception
     */
    public static void read() throws Exception{
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator.DESKTOP-31RFSET\\Desktop\\java-review\\java-se-heima\\day11\\person01.txt"));
        Object o = objectInputStream.readObject();
        Object o1 = objectInputStream.readObject();
        Object o2 = objectInputStream.readObject();
        Object o3 = objectInputStream.readObject();
        System.out.println(o);
        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        objectInputStream.close();
    }

    /**
     * 写入集合
     * @throws Exception
     */
    public static void writeList() throws Exception{
        CopyOnWriteArrayList<Person01> person01s = new CopyOnWriteArrayList<>();
        Person01 zs = new Person01("张三", 999);
        Person01 zs1 = new Person01("张三1", 999);
        Person01 zs2 = new Person01("张三2", 999);
        Person01 zs3 = new Person01("张三3", 999);
        person01s.add(zs);
        person01s.add(zs1);
        person01s.add(zs2);
        person01s.add(zs3);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator.DESKTOP-31RFSET\\Desktop\\java-review\\java-se-heima\\day11\\person02.txt"));
        objectOutputStream.writeObject(person01s);
        objectOutputStream.close();
    }



    /**
     * 读取集合
     * @throws Exception
     */
    public static void readAll() throws Exception{
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator.DESKTOP-31RFSET\\Desktop\\java-review\\java-se-heima\\day11\\person02.txt"));
        CopyOnWriteArrayList<Person01> o = (CopyOnWriteArrayList<Person01>) objectInputStream.readObject();
        System.out.println(o);
        objectInputStream.close();
    }

}
