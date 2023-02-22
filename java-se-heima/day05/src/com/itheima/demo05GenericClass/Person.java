package com.itheima.demo05GenericClass;

/*
    定义和使用含有泛型的类
    泛型:是一种未知的数据类型,当我们不知道使用什么类型的时候,就可以使用泛型
    格式:模拟ArrayList集合
        public class 类名<泛型>{
            类中所有使用数据类型的地方,都可以使用类上的泛型
        }
    什么时候确定泛型的类型:创建对象时候,使用什么类型,类中的泛型就是什么类型
 */
public class Person<C> {
    private C name;

    public C getName() {
        return name;
    }

    public void setName(C name) {
        this.name = name;
    }
}
