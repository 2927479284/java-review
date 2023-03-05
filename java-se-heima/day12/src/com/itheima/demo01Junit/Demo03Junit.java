package com.itheima.demo01Junit;

import org.junit.*;

/*
    Junit相关的注解:
    @Test:
        用来修饰方法，该方法是单元测试的方法,可以单独运行方法
    @Before：在...前边
        用来修饰方法，该方法会在每一个测试方法执行之前[自动]执行一次。
    @After：在...后边
        用来修饰方法，该方法会在每一个测试方法执行之后[自动]执行一次
     @BeforeClass：
        用来静态修饰方法，该方法会在所有测试方法之前[自动]执行一次，而且只执行一次
     @AfterClass：
        用来静态修饰方法，该方法会在所有测试方法之后[自动]执行一次，而且只执行一次
     注意:
        1.@Before,@After,@BeforeClass,@AfterClass:这四个注解修饰的方法不能单独执行
        2.@Before,@After,@BeforeClass,@AfterClass:这四个注解修饰的方法会[自动]在@Test修饰方法前后运行
 */
public class Demo03Junit {
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

    @Before
    public void before(){
        System.out.println("before方法");
    }

    @After
    public void after(){
        System.out.println("after方法");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass方法");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("afterClass方法");
    }
}
