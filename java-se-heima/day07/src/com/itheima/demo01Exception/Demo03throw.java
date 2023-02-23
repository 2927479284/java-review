package com.itheima.demo01Exception;

/*
    throw关键字使用
    作用:
        让我们在[方法中]抛出指定的异常对象
        没有使用throw关键字,程序执行的过程中出现了异常,JVM会创建异常相关的对象,并抛出异常对象
 */
public class Demo03throw {
    public static void main(String[] args) {
        int[] arr = null;
//        int[] arr = {10,20,30};
        int element = getElement(arr, 3);
        System.out.println(element);
    }

    /*
        定义一个方法,获取数组指定索引处的元素并返回
        在工作中一般都会对方法传递的实际参数做一些合法性的校验
            参数合法,在使用参数
            参数不合法,就可以使用抛出异常的方式,告之方法的调用者,参数有问题
     */
    public static int getElement(int[] arr,int index){
        /*
            对参数int[] arr进行一个非空判断
            如果数组arr的值null,那么我们就抛出一个空指针异常
            告之方法的调用者,传递的数组arr的值是null
         */
        if(arr==null){
            throw new NullPointerException("您传递的数组arr的值是null");
        }

        /*
            对参数int index数组索引,进行一个校验,判断index是否在数组索引范围内
            如果index不在数组索引的范围内,那么我们就抛数组索引越界异常
            告之方法的调用者,传递的数组的索引超出了范围
         */
/*        if(index<0 ||index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("您传递的数组索引["+index+"]超出了数组索引的范围");
        }*/

        int e = arr[index];
        return e;
    }
}
