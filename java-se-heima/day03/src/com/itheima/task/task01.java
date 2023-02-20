package com.itheima.task;

/**
 * 请按标准格式定义一个“手机类”，它有三个属性：品牌(String)、颜色(String)、价格(double)
 * 	请编写测试类，创建两个“手机对象”并为它们的属性赋值，并能直接打印手机对象的属性信息。
 */
public class task01 {

    public static void main(String[] args) {
        phone huawei = new phone("华为", "蓝色", 9999.99);
        phone xiaomi = new phone("小米", "黑色", 8888.88);
        System.out.println(huawei);
        System.out.println(xiaomi);
    }
}
class phone{

    String brand;

    String color;

    Double price;

    public phone(String brand, String color, Double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "phone{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
