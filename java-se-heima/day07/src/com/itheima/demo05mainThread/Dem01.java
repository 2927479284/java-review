package com.itheima.demo05mainThread;

/*
    主线程(了解-扩展知识点)
        执行main(主)方法的线程,叫主线程
 */
public class Dem01 {
    public static void main(String[] args) {
        Person p1 = new Person("小明");
        p1.run();

        /*
            Exception in thread "main"
            java.lang.ArithmeticException: / by zero
         */
        System.out.println(0/0);

        Person p2 = new Person("小红");
        p2.run();
    }
}
