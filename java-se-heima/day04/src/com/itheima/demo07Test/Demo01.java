package com.itheima.demo07Test;

public class Demo01 {
    public static void main(String[] args) {
        //创建Person对象
        Person p1 = new Person();
        p1.setName("蔡徐坤");
        p1.setAge(20);
        p1.setAnimal(new Cat());
        System.out.println(p1);//Person{name='蔡徐坤', age=20, animal=我的宠物是一只猫!}

        Person p2 = new Person("杨洋",20,new Dog());
        System.out.println(p2);//Person{name='杨洋', age=20, animal=我的宠物是一只狗!}
    }

    public static Object getInstance(){
        return new Cat();
    }

    public static void show(Object obj){

    }
}
