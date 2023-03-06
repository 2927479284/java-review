package com.itheima.demo06Annotation;

/*
    定义一个含有属性的注解
        注解中是没有成员变量,成员方法和构造方法的
        注解中可以定义属性,属性的语法格式类似于抽象方法,但是包含默认值
    格式:
        public  @interface 注解名{
            修饰符 数据类型 属性名();
            修饰符 数据类型 属性名() default 默认值;
        }
        1.修饰符:固定为public abstract,可以省略不写,也可以写一部分
            不写默认也是public abstract,建议写出,增强阅读性
        2.数据类型:不是所有的数据类型都可以使用
            基本数据类型:4类8种
            引用数据类型: String类型,反射类型,注解类型,枚举类型
            以及以上所有的类型的一维数组  int[],String[]...
 */
public @interface MyAnno02 {
    //定义一个int类型的数组
    //public abstract int a();
    //public int a();
    //abstract int a();
    int a();

    //定义一个double类型的属性,包含默认值88.8
    public abstract double d() default 88.8;

    //定义一个String数组类型的属性
    public abstract String[] arr();

    //反射类型(了解)
    //public abstract Class clazz();
    //注解类型(了解)
    //public abstract MyAnno01 my01();
    //枚举类型(了解)
    //public abstract Color c();
}
