package com.itheima.demo03reflect;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

/**
 * 获取对象的方法
 */
public class Demo05MethodTest{

    public static void main(String[] args) throws Exception{
        Class<?> person = Class.forName("com.itheima.demo03reflect.Person");
        Method[] methods = person.getMethods();
        List<Method> methods1 = Arrays.asList(methods);
        methods1.forEach((method)->{
            System.out.println(method);
        });
        System.out.println("--------------------华丽的分割线--------------------------------------------------");
        //获取指定方法 公共方法
        Method getName = person.getMethod("getName");
        System.out.println("方法名getName："+getName);
        Method setName = person.getMethod("setName", String.class);
        System.out.println("方法名setName："+setName);
        //获取指定方法 私有
        Method show = person.getDeclaredMethod("show");
        System.out.println("方法名show："+show);

        //方法执行 传入对应类的对象
        Object personObject = person.newInstance();
        Object set = setName.invoke(personObject, "张三");
        System.out.println("setName方法执行完成打印结果："+set);//这里set为空的原因是因为对应方法没有返回值所以为空
        Object invoke = getName.invoke(personObject);
        System.out.println(invoke);
        //私有方法执行
        //私有方法没有权限调用，会抛出非法权限异常需要暴力反射
        show.setAccessible(true);
        Object invoke1 = show.invoke(personObject);
        System.out.println(invoke1);


    }
}
