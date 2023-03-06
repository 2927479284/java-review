package com.itheima.demo05reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;

/*
	现有集合：ArrayList<Integer>list = new ArrayList();
	利用反射机制在这个泛型为Integer的ArrayList中存放一个String类型的对象。
	java中的泛型是一个伪泛型,在.java文件中有,在编译生成的.class文件没有泛型概念的
	使用反射技术获取class文件中的ArrayList集合==>没有泛型==>集合默认的就是Object类型
	什么类型的数据都可以存储==>泛型的擦除
*/
public class Test01 {
    public static void main(String[] args) throws Exception {
        // 创建集合对象
        ArrayList<Integer> list = new ArrayList();
        list.add(100);
        list.add(200);
        list.add(300);

        //获取class文件中的ArrayList集合的class文件对象
        Class clazz = list.getClass();

        //获取集合中的add方法
        Method addMethod = clazz.getMethod("add", Object.class);

        //运行add方法
        addMethod.invoke(list,"呵呵");
        addMethod.invoke(list,true);
        addMethod.invoke(list,1.1);
        addMethod.invoke(list,'A');

        System.out.println(list);//[100, 200, 300, 呵呵, true, 1.1, A]
    }

}