package com.itheima.demo05GenericClass;

public class Demo02 {
    public static void main(String[] args) {
        Student<String,Integer,Double> s = new Student<>();
        Student<String,String,String> s2 = new Student<>();
        Student<Double,Character,String> s3 = new Student<>();
    }
}
