package com.itheima.demo08Test;

import java.util.Date;

/*
    定义宝马SUV类,是汽车Car一种,所以继承Car类
    宝马SUV有GPS功能,实现IGPS接口
 */
public class BMWSUV extends  Car implements IGPS{
    public BMWSUV() {
    }

    public BMWSUV(String type, String brand, String color, double price, Date date) {
        super(type, brand, color, price, date);
    }

    @Override
    public void run() {
        System.out.println("宝马SUV最高运行时速：220公里");
    }

    @Override
    public void useGPS() {
        System.out.println("宝马SUV可以使用GPS功能!");
    }
}
