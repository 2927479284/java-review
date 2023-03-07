package com.itheima.demo02reflect;


/**
 * 获取类的class对象的几种方式
 */
public class Demo04Test {

    public static void main(String[] args)  throws Exception{
        Person person = new Person();
        Class<? extends Person> aClass = person.getClass();//第一种获取方式
        Class<Person> personClass = Person.class;//第二种获取方式
        //Class<?> aClass1 = Class.forName("com.itheima.demo02reflect.Person");//第三种获取方式

//        System.out.println(aClass == personClass);//true
//        System.out.println(aClass == aClass1);//true
//        System.out.println(personClass == aClass1);//true


    }
}
