package com.itheima.demo07GenericInterface;

/*
    含有泛型的接口:第一种使用方式
        在实现类实现接口的同时,指定接口泛型的数据类型
        指定什么类型,那么泛型就是什么类型
    格式:
        public class MyInterImpl1 implements MyInter<String>{
            @Override
            public void show(String s) {}
        }
        public class MyInterImpl1 implements MyInter<Double>{
            @Override
            public void show(Double s) {}
        }
 */
public class MyInterImpl1 implements MyInter<Double>{
    @Override
    public void show(Double s) {
        System.out.println(s);
    }
}
