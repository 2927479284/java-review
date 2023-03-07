package com.itheima.demo03reflect;


import java.lang.reflect.Constructor;

/**
 * 获取对象的属性，方法，构造方法
 * 私有，公有等等...
 */
public class Demo04 {


    public static void main(String[] args) throws Exception{

        Class<?> person = Class.forName("com.itheima.demo03reflect.Person");
        /*
            java.lang.class类:获取多个构造方法
            Constructor<?>[] getConstructors() 获取类的所有公共构造方法
            Constructor<?>[] getDeclaredConstructors()获取类声明的所有构造方法(包括公共、保护、默认（包）访问和私有方法)
            Declared:声明
         */
        Constructor<?>[] constructors = person.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("--------分割线----------------------------");
        Constructor<?>[] declaredConstructors = person.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        System.out.println("--------分割线----------------------------");
        Constructor<?> constructor = person.getConstructor();
        Person o = (Person) constructor.newInstance();
        System.out.println(o);

        //获取私有构造方法
        Constructor<?> zs = person.getDeclaredConstructor(String.class,int.class);
        zs.setAccessible(true);
        Person zss = (Person) zs.newInstance("张三", 18);
        System.out.println(zss);


        //直接用class对象获取对应的类对象
        Object o1 = person.newInstance();
    }
}
