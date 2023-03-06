package com.itheima.demo03reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
    使用反射技术获取类中的构造方法,并使用获取到的构造方法实例化对象
    实现步骤:
        1.获取Person类的class文件对象
        2.使用class文件对象中的方法getConstructor|getConstructors获取类中的(公共)构造方法
        3.使用构造方法Constructor类中的方法newInstance实例化对象(创建对象)
 */
public class Demo01ReflectConstructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.获取Person类的class文件对象(手术刀)
        Class clazz = Class.forName("com.itheima.demo03reflect.Person");
        //2.使用class文件对象中的方法getConstructor|getConstructors获取类中的(公共)构造方法
        /*
            java.lang.class类:获取多个构造方法
            Constructor<?>[] getConstructors() 获取类的所有公共构造方法
            Constructor<?>[] getDeclaredConstructors()获取类声明的所有构造方法(包括公共、保护、默认（包）访问和私有方法)
            Declared:声明
         */
        Constructor[] cons = clazz.getConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }
        System.out.println("-------------------------------------");
        Constructor[] declaredCons = clazz.getDeclaredConstructors();
        for (Constructor con : declaredCons) {
            System.out.println(con);
        }
        System.out.println("-------------------------------------");
        /*
            java.lang.class类:获取指定的构造方法
            Constructor<T> getConstructor(Class<?>... parameterTypes) 获取类的指定公共构造方法
            Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)获取类指定构造方法(包括公共、保护、默认（包）访问和私有方法)
            参数:
                 ...:可变参数:方法的参数是可变参数,可以接收任意个同种数据类型的数据(0个,1个,2个...100个...)
                 Class<?>... parameterTypes:传递参数列表的class类型参数
                 public Person()==>不传递参数
                 public Person(String name, int age, String sex) ==>(String.class,int.class,String.class)
                 private Person(String name, int age)==>(String.class,int.class)
            注意:
                类中没有指定的构造方法,会抛出NoSuchMethodException:没有这个方法异常
         */
        //public Person() 获取空参数构造方法
        Constructor con1 = clazz.getConstructor();
        System.out.println(con1);//public com.itheima.demo03reflect.Person()

        //public Person(String name, int age, String sex) 获取满参数构造方法
        Constructor con2 = clazz.getConstructor(String.class, int.class, String.class);
        System.out.println(con2);//public com.itheima.demo03reflect.Person(java.lang.String,int,java.lang.String)

        //private Person(String name, int age) 获取私有构造方法
        Constructor con3 = clazz.getDeclaredConstructor(String.class, int.class);
        System.out.println(con3);//private com.itheima.demo03reflect.Person(java.lang.String,int)

        /*
            3.使用构造方法Constructor类中的方法newInstance实例化对象(创建对象)
            java.lang.reflect.Constructor<T>:是描述构造方法的类
            成员方法:
                T newInstance(Object... initargs) 使用获取到的构造方法Constructor实例化对象
                参数:
                    Object... initargs:创建对象需要的实际参数  new Person("小明",10,"男");
                返回值:
                    T:返回的就是创建好的对象,使用Object类型接收(多态)
                    Object obj = new Person("小明",10,"男");
         */
        //public Person() 使用获取空参数构造方法创建对象
        Object obj1 = con1.newInstance();//就相当于 new Person();
        System.out.println(obj1);//Person{name='null', age=0, sex='null'}

        //public Person(String name, int age, String sex) 使用获取满参数构造方法创建对象
        Object obj2 = con2.newInstance("小明", 10, "男");//就相当于 new Person("小明", 10, "男");
        System.out.println(obj2);//Person{name='小明', age=10, sex='男'}

        //private Person(String name, int age) 使用获取私有构造方法创建对象
        /*
            使用私有构造方法创建对象,私有方法是没有权限运行的,会抛出IllegalAccessException:非法访问异常
            解决:使用Constructor的父类AccessibleObject类中的方法解决
                void setAccessible(boolean flag) 将此对象的 accessible 标志设置为指示的布尔值。
                    值为 true 则指示反射的对象在使用时应该取消 Java 语言访问检查。
                    值为 false 则指示反射的对象应该实施 Java 语言访问检查。
            注意:
                私有构造方法,不让外界使用,使用暴力反射,破坏了类的封装性,不推荐
         */
        con3.setAccessible(true);//取消(con3) Java 语言访问检查==>暴力反射
        Object obj3 = con3.newInstance("柳岩", 18);//就相当于 new Person("柳岩",18);
        System.out.println(obj3);//Person{name='柳岩', age=18, sex='null'}
    }
}
