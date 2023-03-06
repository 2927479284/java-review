package com.itheima.demo03reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
    使用反射技术获取类中的成员方法,并运行获取到成员方法(重点)
    实现步骤:
        1.获取Person类的class文件对象
        2.使用class文件对象中的方法getMethod|getMethods获取类中的(公共)成员方法Method
        3.使用成员方法Method类中的方法invoke,运行后到的成员方法
 */
public class Demo03ReflectMethod {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        //1.获取Person类的class文件对象
        Class clazz = Class.forName("com.itheima.demo03reflect.Person");

        //2.使用class文件对象中的方法getMethod|getMethods获取类中的(公共)成员方法Method
        /*
            java.lang.Class类:获取多个成员方法
                Method[] getMethods() 获取本类|父类继承|接口继承的所有的公共成员方法
                Method[] getDeclaredMethods() 获取声明的所有方法，包括公共、保护、默认（包）访问和私有方法，但不包括继承的方法。
           java.lang.reflect.Method:描述成员方法的类
                String getName() 以 String 形式返回此 Method 对象表示的方法名称。(动态代理使用)
         */
        Method[] methods = clazz.getMethods();
        for (Method m : methods) {
            //System.out.println(m);
            System.out.println(m.getName());
        }
        System.out.println("-------------------------------");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }
        System.out.println("-------------------------------");
        /*
            java.lang.Class类:获取指定的成员方法
            Method getMethod(String name, Class<?>... parameterTypes) 获取指定公共成员方法(包含继承的)
            Method getDeclaredMethod(String name, Class<?>... parameterTypes)
                获取指定已声明方法,包括公共、保护、默认（包）访问和私有方法，但不包括继承的方法。
            参数:
                String name:方法的名称
                Class<?>... parameterTypes:成员方法参数列表的class文件对象
            注意:
                类中没有指定的成员方法,会抛出NoSuchMethodException:没有这个方法异常
         */
        //public String getName()
        Method getNameMethod = clazz.getMethod("getName");
        System.out.println(getNameMethod);//public java.lang.String com.itheima.demo03reflect.Person.getName()

        //public void setName(String name)
        Method setNameMethod = clazz.getMethod("setName", String.class);
        System.out.println(setNameMethod);//public void com.itheima.demo03reflect.Person.setName(java.lang.String)

        //private void show()
        Method showMethod = clazz.getDeclaredMethod("show");
        System.out.println(showMethod);

        /*
            3.使用成员方法Method类中的方法invoke,运行后到的成员方法
            java.lang.reflect.Method:描述成员方法的类
            Object invoke(Object obj, Object... args) 运行获取到Method类型的成员方法
            参数:
                Object obj:运行成员方法,需要对象的支持
                    运行哪个类中的成员方法,就传递哪个类的对象
                    运行Person类的成员方法,传递Person对象(反射的方式获取)
                Object... args:调用方法传递的实际参数
            返回值:
                Object:成员方法的返回值
                    如果方法的返回值类型是void,没有返回值,Object就是null
         */
        Object obj = clazz.newInstance();//new Person();
        System.out.println(obj);//Person{name='null', age=0, sex='null'}

        //public String getName() 运行获取到的getName方法,获取name的值
        Object v1 = getNameMethod.invoke(obj);
        System.out.println("v1:"+v1);//v1:null name的默认值

        //public void setName(String name) 使用获取到setName方法,给name赋值
        Object v2 = setNameMethod.invoke(obj, "迪丽热巴");
        System.out.println("v2:"+v2);//v2:null setName方法没有返回值

        //public String getName() 运行获取到的getName方法,获取name的值
        Object v3 = getNameMethod.invoke(obj);
        System.out.println("v3:"+v3);//v3:迪丽热巴

        //private void show() 运行获取到的私有show方法
        //私有方法,没有权限运行的,有权限检查,会抛出IllegalAccessException:非法访问异常
        //可以使用暴力反射解决
        showMethod.setAccessible(true);//取消show方法的权限检查
        showMethod.invoke(obj);//Person类的私有show方法!
    }
}
