package com.itheima.demo02toString;

import java.util.ArrayList;
import java.util.Random;

/*
    String toString() 返回该对象的字符串表示。
    Object类中toString方法的底层源码(了解):
        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
        }
        1.getClass().getName():使用反射技术获取类的全类名(包名+类名)
            "com.itheima.demo02toString.Person"
        2."@"字符串的@符号,原样输出,起到分割的作用
        3.hashCode():Object类的方法,可以获取对象的哈希值,哈希值是操作系统给我们返回的一个十进制的整数
        4.Integer.toHexString(hashCode()):把十进制的整数转换为十六进制(0-9 a-f)
        组合在一起:"com.itheima.demo02toString.Person@140e19d"==>对象在堆内存中的地址值
 */
public class Demo01ToString {
    public static void main(String[] args) {
        //创建Person对象
        Person p1 = new Person("迪丽热巴",18);
        //Person类默认继承了Object类,所以可以使用继承自Object类中的toString方法
        String s = p1.toString();
        System.out.println("s:"+s);//s:com.itheima.demo02toString.Person@140e19d 重写后:Person{name='迪丽热巴', age=18}
        //注意:直接打印对象名,默认会调用对象的toString方法
        System.out.println(p1);//com.itheima.demo02toString.Person@140e19d 重写后:Person{name='迪丽热巴', age=18}

        /*
            以后看一个类是否重写的toString方法,打印对象名
                类重写类toString方法,打印的就不是地址值
                类没有重写toString方法,打印地址值
         */
        Random r = new Random();
        System.out.println(r);//java.util.Random@17327b6 类没有重写toString方法

        String str = new String("abc");
        System.out.println(str);//abc 类重写类toString方法

        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");
        System.out.println(list);//[aa, bb] 类重写类toString方法
    }
}
