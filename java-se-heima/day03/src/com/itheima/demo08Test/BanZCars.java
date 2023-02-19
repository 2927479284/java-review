package com.itheima.demo08Test;

import java.util.Date;

/*
    定义奔驰轿车类,是汽车Car一种,所以继承Car类
 */
public class BanZCars extends  Car{
    public BanZCars() {
    }

    public BanZCars(String type, String brand, String color, double price, Date date) {
        super(type, brand, color, price, date);
    }

    @Override
    public void run() {
        System.out.println("奔驰轿车最高运行时速：200公里");
    }
}
