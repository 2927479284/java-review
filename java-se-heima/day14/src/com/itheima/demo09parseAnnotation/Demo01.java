package com.itheima.demo09parseAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

/*
    注解解析:获取到写在类上|方法上...的注解,在获取到注解的属性值
 */
@Book(value = "斗罗大陆",authors = "唐家三少")
public class Demo01 {
    @Book(value = "斗破苍穹",price = 88.8,authors = {"大土豆","小土豆"})
    public void show(){}

    public static void main(String[] args) throws ClassNotFoundException {
        //test01();
        test02();
    }

    /*
        解析方法上的Book注解:获取Book注解的属性值
        1.获取当前类Demo01的class文件对象
        2.使用class文件对象中的方法getMethods获取类中所有的成员方法,返回一个Method类型的数组
        3.遍历Method数组,获取每一个Method方法
        4.使用Method中的方法isAnnotationPresent判断方法上是否有Book注解
        5.如果方法上有Book注解,使用Method中的方法getAnnotation获取Book注解
        6.使用注解名.属性名(),获取属性的值
     */
    public static void test02() {
        //1.获取当前类Demo01的class文件对象
        Class clazz = Demo01.class;
        //2.使用class文件对象中的方法getMethods获取类中所有的成员方法,返回一个Method类型的数组
        Method[] methods = clazz.getMethods();
        //3.遍历Method数组,获取每一个Method方法
        for (Method method : methods) {
            //4.使用Method中的方法isAnnotationPresent判断方法上是否有Book注解
            boolean b = method.isAnnotationPresent(Book.class);
            //System.out.println(method.getName()+"==>"+b);
            if(method.isAnnotationPresent(Book.class)){
                //5.如果方法上有Book注解,使用Method中的方法getAnnotation获取Book注解
                Book book = method.getAnnotation(Book.class);
                //6.使用注解名.属性名(),获取属性的值
                System.out.println(book.value());
                System.out.println(book.price());
                System.out.println(Arrays.toString(book.authors()));
            }
        }
    }

    /*
        解析类上的Book注解:获取Book注解的属性值
        1.获取当前类Demo01的class文件对象
        2.使用class文件对象中的方法isAnnotationPresent判断类上是否有Book注解
        3.如果类上有Book注解,使用class文件对象中的方法getAnnotation获取Book注解
        4.使用注解名.属性名(),获取属性值
     */
    public static void test01() throws ClassNotFoundException {
        //1.获取当前类Demo01的class文件对象
        Class clazz = Class.forName("com.itheima.demo09parseAnnotation.Demo01");
        //2.使用class文件对象中的方法isAnnotationPresent判断类上是否有Book注解
        boolean b = clazz.isAnnotationPresent(Book.class);
        System.out.println(b);
        //3.如果类上有Book注解,使用class文件对象中的方法getAnnotation获取Book注解
        if(b){
            Book book = (Book)clazz.getAnnotation(Book.class);
            System.out.println(book);//@com.itheima.demo09parseAnnotation.Book(price=100.0, value=斗罗大陆, authors=[唐家三少])
            //4.使用注解名.属性名(),获取属性值
            String value = book.value();
            System.out.println(value);
            double price = book.price();
            System.out.println(price);
            String[] authors = book.authors();
            System.out.println(Arrays.toString(authors));
        }
    }
}
