package com.itheima.demo04generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
    创建集合对象使用泛型的好处
    反射:java中的泛型是一个伪泛型,在.java文件中有,在编译生成的.class文件没有泛型概念的
 */
public class Demo01Generic {
    public static void main(String[] args) {
        show02();
    }

    /*
        创建ArrayList集合对象,使用泛型
        弊端:
            集合的泛型使用什么类型,就只能存储什么类型的数据
        好处:
            集合的泛型是什么类型,取出的数据就是什么类型
            不需要向下转型就可以使用元素特有的方法
     */
    private static void show02() {
        ArrayList<String> list = new ArrayList();
        list.add("aaa");
        //list.add(1);//'add(java.lang.String)' in 'java.util.ArrayList' cannot be applied to '(int)'
        //list.add(8.8);
        //list.add(true);
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s+"==>"+s.length());
        }
    }

    /*
        创建ArrayList集合对象,不使用泛型
        好处:
            集合的数据类型默认就是Object类型,可以存储任意数据类型的元素
        弊端:
            所有元素默认都会提示为Object类型,想要使用元素特有的功能,使用不了(多态)
            向下转型,在转型之前增加判断,防止类型转换异常==>麻烦
     */
    private static void show01() {
        ArrayList list = new ArrayList();
        list.add("aaa");
        list.add(1);
        list.add(8.8);
        list.add(true);
        //使用迭代器遍历集合
        Iterator it = list.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);

            //需求:使用String类特有的方法length(),获取字符串元素的长度
            //多态: Object obj = "aaa";
            //System.out.println(obj.length());
            if(obj instanceof String){
                String s = (String)obj;
                System.out.println(s.length());
            }

        }
    }
}
