package com.itheima.demo01proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Demo02Proxy {
    public static void main(String[] args) {
        //创建鹿晗对象
        LuHan lh = new LuHan();
        //生成鹿晗的代理人对象
        Star lhProxy= (Star)Proxy.newProxyInstance(lh.getClass().getClassLoader(),
                lh.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //获取拦截到的方法名称
                        String name = method.getName();

                        if("tiaoWu".equals(name)){
                            System.out.println("安排鹿晗在春晚的舞台给粉丝跳舞!");
                            return null;//结束跳舞方法
                        }

                        if("zhiBoDaiHuo".equals(name)){
                            throw new RuntimeException("鹿晗不参与直播带货活动!");
                        }

                        //调用鹿晗的其他的功能,使用反射继续运行
                        Object v = method.invoke(lh, args);
                        return v;
                    }
                });
        //lhProxy.rap();
        //lhProxy.zhiBoDaiHuo(10);//RuntimeException: 鹿晗不参与直播带货活动!
        lhProxy.tiaoWu();
    }
}
