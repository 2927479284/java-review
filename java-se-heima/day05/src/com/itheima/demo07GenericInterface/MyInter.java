package com.itheima.demo07GenericInterface;

/*
    定义和使用含有泛型的接口
    定义格式:
        public interface 接口名<泛型>{
            接口中使用数据类型的地方,都可以使用泛型
        }
 */
public interface MyInter<I> {
    //定义一个抽象方法
    public abstract void show(I i);
}
