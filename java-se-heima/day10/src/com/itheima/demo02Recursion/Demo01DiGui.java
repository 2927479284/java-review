package com.itheima.demo02Recursion;

/*
    注意事项:
	1.递归必须有结束的条件,保证方法自己调用自己能停止下来,否则会抛出栈内存溢出的错误
	2.递归有结束的条件,但是递归的次数也不能太多了,否则会抛出栈内存溢出的错误
	3.构造方法禁止递归
 */
public class Demo01DiGui {
    public static void main(String[] args) {
        //a();
        b(1);
    }

    /*
        3.构造方法禁止递归
     */
    /*public Demo01DiGui() {
        Demo01DiGui();
    }*/

    /*
            2.递归有结束的条件,但是递归的次数也不能太多了,否则会抛出栈内存溢出的错误
            10713 11408
                Exception in thread "main" java.lang.StackOverflowError
         */
    private static void b(int i) {
        System.out.println(i);
        if(i==20000){
            return;//结束方法
        }
        b(++i);
    }

    /*
        1.递归必须有结束的条件,保证方法自己调用自己能停止下来,否则会抛出栈内存溢出的错误
        Exception in thread "main" java.lang.StackOverflowError
        方法调用的次数太多了,栈内存中存不下了,就会抛出栈内存溢出的错误
     */
    private static void a() {
        System.out.println("a方法");
        a();
    }
}
