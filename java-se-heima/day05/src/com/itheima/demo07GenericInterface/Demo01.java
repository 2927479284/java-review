package com.itheima.demo07GenericInterface;

public class Demo01 {
    public static void main(String[] args) {
        //创建接口的实现类对象
        MyInterImpl1 my01 = new MyInterImpl1();
        my01.show(1.1);

        MyInterImpl2<Character> my02 = new MyInterImpl2<>();
        my02.show('a');

        MyInterImpl2<Boolean> my03 = new MyInterImpl2<>();
        my03.show(true);
    }
}
