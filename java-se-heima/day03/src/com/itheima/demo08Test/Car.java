package com.itheima.demo08Test;

import java.util.Date;

/*
    父类Car:根据子类共性抽取形成
    属性：品牌、型号、颜色、价格、生产日期(Date类型)
         (注：生产日期的接收是String类型，需要转换为Date类型存储到对象中)
 */
public abstract class Car {
    //品牌
    private String type;
    //型号
    private String brand;
    //颜色
    private String color;
    //价格
    private double price;
    //生产日期(Date类型)
    private Date date;

    //定义抽象的run方法
    public abstract void run();

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }

    public Car() {
    }

    public Car(String type, String brand, String color, double price, Date date) {
        this.type = type;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
