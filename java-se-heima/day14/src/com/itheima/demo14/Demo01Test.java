package com.itheima.demo14;

import java.lang.reflect.Method;

/** 注解和反射的综合案例二(重点)
 *  需求:测试方法运行所需的时间上限
 *      方法运行超出了设置的时间上限,打印false
 *      方法运行没有超出了设置的时间上限,打印true
 */
public class Demo01Test {

    public static void main(String[] args) throws Exception{
        Class<Test> testClass = Test.class;
        Method test = testClass.getMethod("test");
        Test test1 = testClass.newInstance();
        if (test.isAnnotationPresent(TestLimit.class)){
            //存在该注解 执行方法
            TestLimit annotation = test.getAnnotation(TestLimit.class);
            long l = System.currentTimeMillis();
            test.invoke(test1);
            long l1 = System.currentTimeMillis();
            long jieguo = l1-l;
            System.out.println(jieguo);
            if (annotation.time()>jieguo){
                System.out.println("通过");
            }else {
                System.out.println("方法执行时间大于 最大指定时间 未通过");
            }
        }
    }

}
