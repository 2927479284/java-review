package com.itheima.demo09parseAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*
    定义一个注解：Book
    包含属性：String value() 书名
    包含属性：double price() 价格，默认值为 100
    包含属性：String[] authors() 多位作者
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Book {
    //书名
    public abstract String value();
    //价格，默认值为 100
    public abstract double price() default 100;
    //多位作者
    public abstract String[] authors();
}
