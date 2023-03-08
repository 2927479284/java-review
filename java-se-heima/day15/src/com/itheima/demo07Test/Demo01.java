package com.itheima.demo07Test;

/*
    需求:
        xml+dom4j+反射实现接口解耦
    在不改变java源代码的情况下,分别打印猫吃鱼和狗吃肉
 */
public class Demo01 {
    public static void main(String[] args) {
        //Animal a = new Cat();
        //a.eat();

        //调用工具类中获取对象的方法
        Animal a = (Animal)BeanFactory.getInstacne("Animal");
        a.eat();
    }
}
