package com.itheima.demo03variableArgs;

import java.util.ArrayList;

public class Demo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        method(10,1.1,list,true,false,true,false,true,true,false);
    }

    //可变参数的注意事项
    //1.一个方法的参数列表中只能写一个可变参数
    //public static void method(String...a,int...b){ }

    //2.方法的参数列表如果有多个参数,可变参数必须写在末尾
    //Vararg parameter must be the last in the list
    //public static void method(int a, double b,boolean...boo ,ArrayList<String> list){ }
    //public static void method(int a, double b,ArrayList<String> list,boolean...boo){ }

    //3.看java底层源码
    //public static void method(Object...obj){}
    public static <T> T[] method(T...t){
        return t;
    }
}
