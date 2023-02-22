package com.itheima.demo13innerClass;

/*
    匿名内部类(重点)
    匿名:没有名字
    内部类:
        匿名内部类写在成员位置,就是一个成员内部类
        匿名内部类写在方法中,就是一个局部内部类
    作用:简化代码
        把子类继承父类,重写父类的方法,创建子类对象,合成一步完成
        把实现类实现接口,重写接口的方法,创建实现类对象,合成一步完成
    格式:new 爹
        new 父类|接口(){
            重写父类|接口中的方法;
        }
    注意:
        匿名内部类最终产生的是一个子类|实现类对象
 */
public class Demo01 {
    public static void main(String[] args) {
        //普通类的匿名内部类
        //new Zi().show();
        new Fu(){
            @Override
            public void show() {
                System.out.println("匿名内部类重写父类的show方法!");
            }
        }.show();

        //抽象类的匿名内部类
        //Animal a = new Cat();
        //a.eat();
        //a.sleep();
        //多态
        //父类类型 变量名 = new 匿名子类对象();
        Animal a =  new Animal(){
            @Override
            public void eat() {
                System.out.println("匿名动物在吃饭!");
            }
            @Override
            public void sleep() {
                System.out.println("匿名动物在睡觉!");
            }
        };
        a.eat();
        a.sleep();

        //接口的匿名内部类
        //new Niao().fly();

        new Fly(){
            @Override
            public void fly() {
                System.out.println("没有名字的鸟在飞!");
            }
        }.fly();
    }
}
