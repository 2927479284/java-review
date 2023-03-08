package com.itheima.demo13Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/** 案例1：
 * 完成自定义注解的读取&运行
 */
public class Demo01Mytest {

    public static void main(String[] args) throws Exception{
        Class<Test01> test01Class = Test01.class;
        Test01 test01 = test01Class.newInstance();
        Method test = test01Class.getMethod("test");//没有参数无需写第二个值
        boolean annotationPresent = test.isAnnotationPresent(Mytest.class);
        System.out.println(annotationPresent);//如提示false则为默认保留策略规则 运行内存中没有该注解
        Mytest annotation = test.getAnnotation(Mytest.class);
        System.out.println(annotation);
        test.invoke(test01);
    }
}
