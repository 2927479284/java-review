package com.itheima.demo05Test;

/*
    接口作为方法参数和返回值类型
    好处:扩展性强
        使用接口作为方法的形式参数:可以接收任意的实现类对象(多态)
        使用接口作为方法的返回值类型:在方法中可以返回任意的实现类对象(多态)
 */
public class Demo01Test {
    public static void main(String[] args) {
        //调用show方法,传递Fly接口的任意的实现类对象,给Fly类型的变量赋值
        show(new Niao());
        show(new Ying());
        System.out.println("---------------------");
        /*
            多态:
            Fly f = getInstacne() = new Niao();
            Fly f = getInstacne() = new Ying();
         */
        Fly f = getInstacne();
        f.fly();
    }

    /*
        定义一个方法,方法的返回值类型使用Fly接口类型
        在方法中就可以返回Fly接口任意的实现类对象
     */
    public static Fly getInstacne(){
        //return new Niao();
        return new Ying();
    }

    /*
        定义一个方法,方法的参数使用Fly接口类型
        多态:
            Fly f = new Niao();
            Fly f = new Ying();
     */
    public static void show(Fly f){
        f.fly();
    }
}
