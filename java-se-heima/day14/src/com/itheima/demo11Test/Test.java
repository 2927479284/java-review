package com.itheima.demo11Test;

//2.定义一个测试类,在测试类的方法上使用TimeLimit注解,给注解的属性设置方法运行的时间
public class Test {
    @TimeLimit(time = 10000)
    public void run(){
        try {
            Thread.sleep(12000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
