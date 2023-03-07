package com.itheima.demo05reflect;

import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 定义了一个Integer类型的list
 * 需要往里面加入任意类型
 */
public class Test02 {

    public static void main(String[] args) throws Exception{
        CopyOnWriteArrayList<Integer> integers = new CopyOnWriteArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        Class<?> aClass = integers.getClass();
        Method add = aClass.getMethod("add", Object.class);
        add.invoke(integers,"aa");
        System.out.println(integers);

    }
}
