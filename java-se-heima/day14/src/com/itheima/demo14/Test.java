package com.itheima.demo14;

/**
 * 定义一个测试类,在测试类的方法上使用TimeLimit注解,给注解的属性设置方法运行的时间
 */
public class Test {

    @TestLimit(time = 5000)
    public void test() throws Exception {
        Thread.sleep(1000);
    }
}
