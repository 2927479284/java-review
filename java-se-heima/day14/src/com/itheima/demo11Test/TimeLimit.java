package com.itheima.demo11Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
    1.定义一个设置时间上限的注解TimeLimit
    a.只能用于方法上b.运行期有效c.添加一个long类型的属性,记录时间
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TimeLimit {
    public abstract long time();
}
