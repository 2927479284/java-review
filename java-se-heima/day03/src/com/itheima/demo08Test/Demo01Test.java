package com.itheima.demo08Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    综合案例1：汽车销售公司类结构设计
    1.目前公司销售以下几种车：
        奔驰轿车(BanzCars)、宝马轿车(BMWCars)、奔驰SUV(BanzSuv)、宝马SUV(BMWSuv)
    2.所有的车辆都要记录以下信息：
        属性：品牌、型号、颜色、价格
        方法：运行(run)
        奔驰轿车最高运行时速：200公里
        宝马轿车最高运行时速：230公里
        奔驰SUV最高运行时速：190公里
        宝马SUV最高运行时速：220公里
    3.宝马车的所有车系都有”GPS”功能。
    4.公司有销售员，可以销售任何车型：
       (注：定义销售员类(Sales)，定义销售方法(sell(...))，参数是?)  sell(Car car){ car.run();}
    系统中既有父类又有接口,先定义接口,在定义父类,在定义子类|实现类
 */
public class Demo01Test {
    public static void main(String[] args) throws ParseException {
        //使用空参数构造方法创建BMWCars对象
        BMWCars bmw = new BMWCars();
        bmw.setType("宝马");
        bmw.setBrand("730");
        bmw.setColor("白色");
        bmw.setPrice(50);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2022-3-18");
        bmw.setDate(date);
        System.out.println(bmw);//Car{type='宝马', brand='730', color='白色', price=50.0, date=Fri Mar 18 00:00:00 CST 2022}

        BanZCars bzc = new BanZCars("奔驰","c100","黑色",20,sdf.parse("2000-2-2"));
        System.out.println(bzc);//Car{type='奔驰', brand='c100', color='黑色', price=20.0, date=Wed Feb 02 00:00:00 CST 2000}

        //创建销售员类对象
        Sales sales = new Sales();
        sales.sell(bmw);
        sales.sell(bzc);
    }
}
