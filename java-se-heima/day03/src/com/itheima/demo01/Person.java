package com.itheima.demo01;

import java.util.Random;

public class Person{
    private String name;
    private int age;
    final int aa;
    static int bb;

    /*
        2.构造代码块:写在成员位置(类中,方法外)的代码块
        特点:
            构造代码块优先于构造方法执行,每创建一次对象,都会执行一次构造代码块!
            Person p1 = new Person();
            Person p2 = new Person("小明",18);
            构造代码块!
            Person类的空参数构造方法!
            构造代码块!
            Person类的满参数构造方法!
        作用:
            1.可以给成员变量赋初始化值
            2.可以把构造方法中共性的内容,提取到构造代码块中,提高代码的复用性
                需求:无论使用哪个构造方法创建对象,都先打印10次"我想有一个女同桌!"
            3.可以给final修饰的变量赋值:构造代码块也是在创建对象前执行
     */
    {
        System.out.println("构造代码块!");
        //1.可以给成员变量赋初始化值
        this.name = "张三";
        this.age = 18;
        //2.可以把构造方法中共性的内容,提取到构造代码块中,提高代码的复用性
        /*for (int i = 1; i <= 10; i++) {
            System.out.println("我想有一个女同桌!"+i);
        }*/
        //3.可以给final修饰的变量赋值:构造代码块也是在创建对象前执行
        aa = 10;
    }

    /*
        3.静态代码块:写在成员位置(类中,方法外),被static修饰的代码块
        特点:只执行一次,优先执行
            a.静态成员优先于非静态成员加载到静态区中,优先于构造代码块和构造方法执行
            b.静态成员属于类,不属于某一个对象,无论创建多少次对象,只执行一次
        作用:
            a.可以给静态的成员,赋初始化值
            b.在项目启动的时候,可以做一些初始化的设计
        需求:
            假如我们在类中定义了一个长度为10的“静态的数组”，
            但需要为每个元素初始化为1-100的随机数，怎么初始化？
     */
    static int[] arr = new int[10];

    static {
        System.out.println("静态代码块!");
        //a.可以给静态的成员,赋初始化值
        bb = 100;
        //b.在项目启动的时候,可以做一些初始化的设计
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100)+1;
        }
    }

    public Person() {
        /*for (int i = 1; i <= 10; i++) {
            System.out.println("我想有一个女同桌!"+i);
        }*/
        System.out.println("Person类的空参数构造方法!");
    }

    public Person(String name, int age) {
        /*for (int i = 1; i <= 10; i++) {
            System.out.println("我想有一个女同桌!"+i);
        }*/
        System.out.println("Person类的满参数构造方法!");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
