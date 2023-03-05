package com.itheima.demo01Junit;

import org.junit.Test;

/*
    junit的作用:可以单独的运行某一个方法(对方法进行测试)
    使用步骤
        1.导入junit的jar包
        2.在要运行的方法上边,添加一个@Test注解(需要导包)
        3.点击方法左边的绿色三角或者鼠标右键点击方法,选择Run 方法,运行方法
          点击类左边的绿色的三角或者鼠标右键点击类名,选择Run 类名,可以运行类中所有被@Test修饰的方法
          鼠标右键点击模块,选择'Run All Tests',可以运行模块中所有类里被@Test修饰的方法
 */
public class Demo01Junit{

    public static void main(String[] args) {
        System.out.println("aa");
    }
    @Test
    public void show01(){
        System.out.println("show01方法");
    }

    @Test
    public void show02(){
        System.out.println("show02方法");
    }

    @Test
    public void show03(){
        System.out.println("show03方法");
    }
}
