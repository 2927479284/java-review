package com.itheima.demo04Set;


/**
 *     哈希值(扩展知识点_了解)
 *     Obejct类有一个方法:
 *         int hashCode() 返回该对象的哈希码值。
 *     哈希值:就是一个十进制的整数,由操作系统返回
 *     hashCode方法底层源码:
 *         public native int hashCode();
 *         native:本地方法,调用不是java语言写的方法,调用操作系统(其他语言)底层的方法
 *     toString方法源码:对象的地址值
 *         public String toString() {
 *             return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *         }
 *         Integer.toHexString(hashCode()):把十进制(0-9)的整数,转换为十六进制(0-9,a-f)
 *     ----------------------------------------------------------------------------------
 *     hashCode返回的对象的地址值,是一个假的虚拟的地址(看着玩),不是对象实际在内存中地址
 */
public class Demo02HashCode{
    public static void main(String[] args) {
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);//1163157884==>1
        System.out.println(p1.toString());//com.itheima.demo04Set.Person@4554617c==>1

        Person p2 = new Person();
        System.out.println(p2.hashCode());//1956725890==>1
        System.out.println(p2.toString());//com.itheima.demo04Set.Person@74a14482==>1
        System.out.println(p1==p2);//比较的两个对象的实际地址 false
    }
}
