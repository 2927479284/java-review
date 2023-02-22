package com.itheima.demo06GenericMethod;

/*
    定义和使用含有泛型的方法(重点)
    定义格式:把泛型定义在方法的修饰符和返回值类型之间
        修饰符 <泛型> 返回值类型 方法名(参数列表){
            方法体;
        }
        方法的参数的数据类型和返回值数据类型可以使用定义的泛型
    什么时候确定泛型的数据类型
        调用方法的时候,传递什么类型的参数,方法上的泛型就是什么类型
        传递的参数是基本数据类型==>泛型使用包装类
 */
public class Person {
    //定义一个含有泛型的方法
    public <M> void show01(M m){
        System.out.println(m);
    }

    //定义一个含有泛型的静态方法
    public static <S> void show02(S s){
        System.out.println(s);
    }

    //定义一个参数和返回值类型,都使用泛型的方法
    public static <V> V show03(V name){
        return name;
    }
}
