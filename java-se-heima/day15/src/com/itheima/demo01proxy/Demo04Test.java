package com.itheima.demo01proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/*
    动态代理综合案例
    需求:
        使用动态代理模拟unmodifiableList方法,对List接口进行代理
            调用List接口的方法会被拦截
            如果使用的size,get方法,没有对集合进行修改,则允许执行
            如果使用的add,remove,set方法,对集合进行了修改,则抛出运行时异常
    分析:
        1.定义一个代理方法proxyList
            参数:传递List集合
            返回值:被代理之后的List集合
        2.方法内部可以使用Proxy类中的方法实现动态代理
 */
@SuppressWarnings("all")//抑制警告:不让类中出现黄色警告
public class Demo04Test {
    public static void main(String[] args) {
        //创建ArrayList集合对象,添加元素
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        List<String> list02 = proxyList(list);
        System.out.println(list02.get(2));//ccc
        System.out.println(list02.size());//3
        //list02.add("呵呵");//UnsupportedOperationException: add no run!
        //list02.remove(1);//UnsupportedOperationException: remove no run!
        //list02.set(1,"你好");//UnsupportedOperationException: set no run!
    }

    /*
        1.定义一个代理方法proxyList
            参数:传递List集合
            返回值:被代理之后的List集合
     */
    public static List<String> proxyList(List<String> list01){
        //2.方法内部可以使用Proxy类中的方法实现动态代理
        List<String> list02 = (List<String>)Proxy.newProxyInstance(list01.getClass().getClassLoader(),
                list01.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //获取拦截的方法名称
                        String name = method.getName();

                        //如果使用的add,remove,set方法,对集合进行了修改,则抛出运行时异常
                        if("add".equals(name)){
                            throw new UnsupportedOperationException("add no run!");
                        }
                        if("remove".equals(name)){
                            throw new UnsupportedOperationException("remove no run!");
                        }
                        if("set".equals(name)){
                            throw new UnsupportedOperationException("set no run!");
                        }

                        //如果使用的size,get方法,没有对集合进行修改,则允许执行
                        Object v = method.invoke(list01, args);
                        return v;
                    }
                });
        return list02;
    }
}
