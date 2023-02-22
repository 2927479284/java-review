package com.itheima.demo06Test;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
    购物车具体要求如下:学生练习
    1.定义我一个Phone手机类
        a.包含属性:名称,价格,品牌
        b.重写hashCode和equals方法
    2.创建一个HashMap集合,作为购物车
    3.在控制台循环3次输入要购买的手机名称,价格,品牌
    4.把用户输入的手机数据封装到一个Phone对象中
    5.判断Map集合中是否有这次添加的手机对象
    a.有,取出对应的value值(购买数量),value++,存储到Map集合中(更新商品的数量)
    b.没有,手机第一次添加,往Map集合中添加(Phone对象,1);
    4.定义一个方法,参数传递Map集合,在方法中遍历Map集合,展示手机的属性和购买数量
 */
public class Demo03Test {
    public static void main(String[] args) {
        //2.创建一个HashMap集合,作为购物车
        HashMap<Phone,Integer> map = new HashMap<>();
        //3.在控制台循环3次输入要购买的手机名称,价格,品牌
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("请输入第"+i+"个手机的名称:");
            String name = sc.next();
            System.out.println("请输入第"+i+"个手机的价格:");
            double price = sc.nextDouble();
            System.out.println("请输入第"+i+"个手机的品牌:");
            String brand = sc.next();
            //4.把用户输入的手机数据封装到一个Phone对象中
            Phone phone = new Phone(name,price,brand);
            //5.判断Map集合中是否有这次添加的手机对象
            if(map.containsKey(phone)){
                //a.有,取出对应的value值(购买数量),value++,存储到Map集合中(更新商品的数量)
                Integer value = map.get(phone);
                value++;
                map.put(phone,value);
            }else{
                //b.没有,手机第一次添加,往Map集合中添加(Phone对象,1);
                map.put(phone,1);
            }
        }
        //调用打印的方法
        printMap(map);
    }

    //4.定义一个方法,参数传递Map集合,在方法中遍历Map集合,展示手机的属性和购买数量
    public static void printMap(HashMap<Phone,Integer> map){
        System.out.println("-------------购物车------------");
        Set<Phone> set = map.keySet();
        for (Phone key : set) {
            Integer value = map.get(key);
            System.out.println(key+" 购买数量:"+value);
        }
    }
}
