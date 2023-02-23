package com.itheima.demo01Exception;

/*
    Throwable类中定义的异常处理逻辑(了解)
    java.lang.Throwable:异常和错误的父类,里边定义的方法所有的异常类都可以使用
        String getMessage​() 返回此可抛出的简短描述。
        String toString​()  重写Object类toString方法,返回此throwable的详细消息字符串。
        void printStackTrace​() JVM在控制台打印异常信息,默认调用的方法,打印异常信息最全面的
    以上3个异常的处理方法,我们可以使用,也可以自定义异常的处理逻辑
 */
public class Demo07Throwable {
    public static void main(String[] args){
        try {
            throw new Exception("异常了");
        } catch (Exception e) {//Exception e = new Exception("异常了");
            //String getMessage​() 返回此可抛出的简短描述。
            String message = e.getMessage();
            System.out.println(message);//异常了

            //String toString​()  重写Object类toString方法,返回此throwable的详细消息字符串。
            String s = e.toString();
            System.out.println(s);//java.lang.Exception: 异常了
            System.out.println(e);//java.lang.Exception: 异常了


/*
                void printStackTrace​() JVM在控制台打印异常信息,默认调用的方法,打印异常信息最全面的
                java.lang.Exception: 异常了
	            at com.itheima.demo01Exception.Demo07Throwable.main(Demo07Throwable.java:14)
*/

            e.printStackTrace(System.out);

            //以上3种打印异常信息的方法,都不使用,自定义异常的处理逻辑
            System.out.println("哈哈终于出现了异常了"+e);//哈哈终于出现了异常了java.lang.Exception: 异常了
        }

        System.err.println("error报错");
        System.out.println("后续代码!");

    }
}
