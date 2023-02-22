package com.itheima.demo03forEach;

import java.util.ArrayList;
import java.util.Collection;

public class Demo03 {
    public static void main(String[] args) {
        Collection<String> arr=new ArrayList<String>();
        arr.add("张无忌");
        arr.add("张翠山");
        arr.add("赵敏");
        arr.add("杨不悔");
        for (String str : arr) {
            if(str.equals("张翠山")){
                arr.remove(str);
            }
        }
        for (String name : arr) {
            System.out.println(name);
        }

    }
}
