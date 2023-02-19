package com.itheima.demo08Test;

import java.util.Date;

/*
    定义奔驰SUV类,是汽车Car一种,所以继承Car类
 */
public class BanZSUV extends  Car{
    public BanZSUV() {
    }

    public BanZSUV(String type, String brand, String color, double price, Date date) {
        super(type, brand, color, price, date);
    }

    @Override
    public void run() {
        System.out.println("奔驰SUV最高运行时速：190公里");
    }
}
