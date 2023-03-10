package com.itheima.demo08;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 给对应的类创建动态代理进行方法增强/执行类中本来方法
 */
public class Demo01Test {
    public static void main(String[] args) throws Exception{
        Class<Zs> zsClass = Zs.class;
        ClassLoader classLoader = zsClass.getClassLoader();
        Class<?>[] interfaces = zsClass.getInterfaces();
        Zs zs = zsClass.newInstance();
        //创建对应的动态代理对象
        Star o = (Star) Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("方法拦截成功");
                if (method.getName().equals("changGe")){
                    System.out.println("张三在唱歌方法逻辑替换");
                }else {
                    return method.invoke(proxy, args);
                }
                return null;
            }
        });
//        o.changGe();
        String str = o.wenDa("龙王嘎嘎牛逼");
        System.out.println(str);

    }
}
