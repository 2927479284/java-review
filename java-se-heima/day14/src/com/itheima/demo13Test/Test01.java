package com.itheima.demo13Test;

/**
 * 测试自定义注解@Mytest
 */

public class Test01 {

    @Mytest
    public void test(){
        System.out.println("自定义注解test方法执行成功");
    }
}
