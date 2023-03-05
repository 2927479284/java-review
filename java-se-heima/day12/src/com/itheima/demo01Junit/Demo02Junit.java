package com.itheima.demo01Junit;

import org.junit.Test;

/*
    Junit的注意事项
        1.没有添加@Test注解的方法,不能使用Junit运行的
        2.Junit只能运行public修饰的,没有参数,没有返回值的非静态方法
 */
public class Demo02Junit {
    //1.没有添加@Test注解的方法,不能使用Junit运行的
    public void show01(){
        System.out.println("Demo02Junit show01方法");
    }

    //java.lang.Exception: Method show02() should be public 方法show02应该被public修饰
    //@Test
    private void show02(){
        System.out.println("Demo02Junit show02方法");
    }

    //java.lang.Exception: Method show03 should have no parameters 方法show03应该没有参数
    //@Test
    public void show03(int a){
        System.out.println("Demo02Junit show03方法"+a);
    }

    //java.lang.Exception: Method show04() should be void 方法show04应是void修饰
    //@Test
    public String show04(){
        System.out.println("Demo02Junit show04方法");
        return "hello";
    }

    //java.lang.Exception: Method show05() should not be static 方法show05应该没有static修饰
    //@Test
    public static void show05(){
        System.out.println("Demo02Junit show05方法");
    }

    //定义一个可以使用Junit运行的方法
    @Test
    public void method(){
        //调用哪些不能直接使用junit运行的方法
        show01();
        show02();
        show03(10);
        String s = show04();
        System.out.println(s);
        show05();
    }
}
