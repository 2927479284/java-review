package com.itheima.demo04Test;

/*
    抽象类作为方法参数和返回值类型
    好处:扩展性强
        使用抽象父类作为方法的形式参数:可以接收任意的子类对象(多态)
        使用抽象父类作为方法的返回值类型:在方法中可以返回任意的子类对象(多态)
 */
public class Demo01Test {
    public static void main(String[] args) {
        //调用show方法,可以传递Animal的任意的子类对象
        show(new Cat());
        show(new Dog());
        System.out.println("----------------------------");
        /*
            多态:
                Animal a = getInstance() = new Cat();
                Animal a = getInstance() = new Dog();
         */
        Animal a = getInstance();
        a.eat();
    }

    /*
        定义一个方法,方法的返回值类型使用Animal
        在方法中就可以返回Animal的任意子类对象
     */
    public static Animal getInstance(){
        //return new Cat();
        return new Dog();
    }

    /*
        定义一个方法,方法的参数使用Animal类型
        多态:父类的变量指向了子类对象
            Animal a = new Cat();
            Animal a = new Dog()
     */
    public static void show(Animal a){
        a.eat();
    }
}
