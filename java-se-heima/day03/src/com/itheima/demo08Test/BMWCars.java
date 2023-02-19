package com.itheima.demo08Test;

import java.util.Date;

/*
    定义宝马轿车类,是汽车Car一种,所以继承Car类
    宝马轿车有GPS功能,实现IGPS接口
 */
public class BMWCars extends  Car implements IGPS{
    public BMWCars() {
    }

    public BMWCars(String type, String brand, String color, double price, Date date) {
        super(type, brand, color, price, date);
    }

    @Override
    public void run() {
        System.out.println("宝马轿车最高运行时速：230公里");
    }

    @Override
    public void useGPS() {
        System.out.println("宝马轿车可以使用GPS功能!");
    }
}
