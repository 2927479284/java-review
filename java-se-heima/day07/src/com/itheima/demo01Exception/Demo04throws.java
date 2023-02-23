package com.itheima.demo01Exception;

/*
    throws关键字使用
    异常处理的第一种方式
    作用:
        throw关键字抛出的是编译期异常,我们就必须的处理这个异常
        可以使用throws关键字把异常对象抛出给方法的调用者处理,最终可以抛出给JVM处理(中断)
    弊端:
        最终会把异常对象抛出给JVM,JVM会中断我们当前正在执行的程序
        那么异常之后代码代码就不会执行了
 */
public class Demo04throws {
    /*
        main(String[] args) throws Exception main方法继续把异常对象Exception抛出给JVM处理
     */
    public static void main(String[] args) throws Exception {
        //int[] arr = null;
        int[] arr = {10,20,30};
        int element = getElement(arr, 3);
        System.out.println(element);
        System.out.println("后续100行代码");
    }

    /*
        定义一个方法,获取数组指定索引处的元素并返回
        getElement(int[] arr,int index) throws Exception 把异常对象Exception抛出给main方法处理
     */
    public static int getElement(int[] arr,int index) throws Exception {
        /*
            对参数int[] arr进行一个非空判断
            如果数组arr的值null,那么我们就抛出一个空指针异常
            告之方法的调用者,传递的数组arr的值是null
         */
        if(arr==null){
            throw new Exception("您传递的数组arr的值是null");
        }

        /*
            对参数int index数组索引,进行一个校验,判断index是否在数组索引范围内
            如果index不在数组索引的范围内,那么我们就抛数组索引越界异常
            告之方法的调用者,传递的数组的索引超出了范围
         */
        if(index<0 ||index>arr.length-1){
            throw new Exception("您传递的数组索引["+index+"]超出了数组索引的范围");
        }

        int e = arr[index];
        return e;
    }
}
