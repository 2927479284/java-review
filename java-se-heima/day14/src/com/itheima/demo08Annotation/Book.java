package com.itheima.demo08Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
    元注解:java提供的注解,可以用来修饰自定义注解
    1.java.lang.annotation.Target
        作用:用来标识注解使用的位置，如果没有使用该注解标识，则自定义的注解可以使用在任意位置。
    2.java.lang.annotation:Retention
        作用:用来标识注解的生命周期(有效范围),不写默认值是CLASS
 */
//只让自定义注解Book,使用在成员方法上和构造方法上
//@Target(value = {ElementType.METHOD,ElementType.CONSTRUCTOR})
@Target({ElementType.METHOD,ElementType.CONSTRUCTOR})
//让自定义的注解Book在.java文件.class文件和运行的内存中都有效
@Retention(RetentionPolicy.RUNTIME)
public @interface Book {
    //书名
    public abstract String value();
    //价格，默认值为 100
    public abstract double price() default 100;
    //多位作者
    public abstract String[] authors();
}
