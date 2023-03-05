package com.itheima.demo01Junit;

import org.junit.Assert;

/*
    作用
      预测判断某个条件一定成立,  如果条件不成立，则直接崩溃(抛异常)

    使用方式
        Assert.assertEquals(期望结果 , 实际结果);
        两个参数: 第一个代表预判值,  第二个代表实际结果
         如果预判正确就会绿色通过
         如果预判错误就会红色失败
 */
public class Demo04Junit {
    public static void main(String[] args) {
        //断言正确,无任何结果
        Assert.assertEquals(true,"helloworld".contains("hello"));

        /*
            AssertionError:断言异常
                expected:<true> 期望的是true
                but was:<false> 得到的实际结果是false
         */
        //Assert.assertEquals(true,"helloworld".contains("你好"));

        Assert.assertEquals(10,Integer.parseInt("10"));

        /*
            AssertionError: 断言异常
                expected:<10>期望的是10
                but was:<11>得到的实际结果是11
         */
        Assert.assertEquals(10,Integer.parseInt("11"));
    }
}
