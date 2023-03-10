package com.itheima.demo09;

/**
 * 测试类
 */
public class Demo01Test {

    public static void main(String[] args) throws Exception {
        Animal animal = (Animal) BeanFactory.beanFactory("Animal");
        animal.eat();
    }
}
