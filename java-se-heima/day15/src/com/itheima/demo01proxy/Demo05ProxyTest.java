package com.itheima.demo01proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * 用动态代理的方式实现Collections集合的一个方法
 * unmodifiableList
 */
public class Demo05ProxyTest<T> {
    public static void main(String[] args) throws Exception{
        //创建ArrayList集合对象,添加元素
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        List<String> strings = proXyList(list);
//        strings.add("qqq");
//        strings.remove("qqq");
//        strings.set(1,"qqq");
        String s = strings.get(1);
        System.out.println(s);
    }

    public static <T> List<T> proXyList(List<T> list){
        Class<? extends List> aClass = list.getClass();
        ClassLoader classLoader = aClass.getClassLoader();
        Class<?>[] interfaces = aClass.getInterfaces();
        return (List<T>) Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                switch (method.getName()){
                    case "add":
                        System.out.println("add方法不允许执行");
                        break;
                    case "set":
                        System.out.println("set方法不允许执行");
                        break;
                    case "remove":
                        System.out.println("remove方法不允许执行");
                        break;
                    default:
                        return method.invoke(list, args);
                }
                return null;
            }
        });

    }
}
