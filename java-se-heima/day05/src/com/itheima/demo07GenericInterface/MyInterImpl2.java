package com.itheima.demo07GenericInterface;

/*
    含有泛型的接口:第二种使用方式
        实现类在实现含有泛型接口的时候,接口使用什么泛型,实现类也使用什么泛型
    就相当于定义了一个含有泛型的类,创建实现类对象的时候确定泛型的数据类型
 */
public class MyInterImpl2<I> implements MyInter<I>{
    @Override
    public void show(I i) {
        System.out.println(i);
    }
}
