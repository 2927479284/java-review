package com.itheima.demo06Annotation;

/*
    注解中只有一个属性,属性名叫value
     或者注解中有其他的属性,但是其他的属性必须有默认值
 */
public @interface MyAnno03 {
    public abstract boolean value();

    public abstract String str()default "aa";
}
