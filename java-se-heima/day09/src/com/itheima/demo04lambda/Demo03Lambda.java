package com.itheima.demo04lambda;

import java.util.Arrays;
import java.util.Comparator;

/*
    Lambda简化写法
    Lambda表达式使用前提:只能对函数式接口(有且仅有一个抽象方法的接口)的匿名内部类进行简化
    Lambda表达式是可推导可以省略的,Lambda表达式可以推导出来,省略就是重写唯一的抽象方法
    Lambda表达式可以推导出来,唯一抽象方法的参数和返回值,所以我们可以进一步对参数和返回值进行简化
    格式:
    (参数列表)->{重写抽象方法的方法体}
    简化:
    1.(参数列表):参数列表中的数据类型可以省略不写
        (int a)==>(a)  (int a,double d)==>(a,d)
    2.(参数列表):参数列表中只有一个参数,那么小括号()也可以省略不写,但是如果没有参数,小括号必须写
        (int a)==>(a)==>a    ()==>()
    3.{重写抽象方法的方法体}:无论方法是否有返回值,如果方法体只有一行代码,省略return和{ }和这行代码结束的分号;
    但是注意:这三部分必须一起省略

 */
public class Demo03Lambda {
    public static void main(String[] args) {
        //使用匿名内部类的方式,实现多线程程序
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程正在执行线程任务!");
            }
        }).start();

        //使用Lambda表达式,简化匿名内部类,实现多线程程序
        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"线程正在执行线程任务!");
            System.out.println(Thread.currentThread().getName()+"线程正在执行线程任务!");
            System.out.println(Thread.currentThread().getName()+"线程正在执行线程任务!");
        }).start();

        //简化Lambda表达式 方法体省略{ }和;
        new Thread(()-> System.out.println(Thread.currentThread().getName()+"线程正在执行线程任务!")).start();

        Person[] arr = new Person[3];
        arr[0] = new Person("刘备",50);
        arr[1] = new Person("张飞",18);
        arr[2] = new Person("关羽",28);
        //使用匿名内部类
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                //根据年龄降序排序
                return o2.getAge()-o1.getAge();
            }
        });
        System.out.println(Arrays.toString(arr));
        //使用Lambda表达式
        Arrays.sort(arr, (Person o1, Person o2)-> {
                //根据年龄降序排序
                return o2.getAge()-o1.getAge();
            }
        );
        //简化Lambda表达式 参数:省略数据类型 方法体:省略了{ } return ;
        Arrays.sort(arr,(o1,o2)->o2.getAge()-o1.getAge());
    }
}
