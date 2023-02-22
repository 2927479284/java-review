package com.itheima.demo06Test;

/*
    1.定义我一个Phone手机类
        a.包含属性:名称,价格,品牌
        b.重写hashCode和equals方法(保证唯一)
 */
public class Phone {
    //名称
    private String name;
    //价格
    private double price;
    //品牌
    private String brand;

    public Phone() {
    }

    public Phone(String name, double price, String brand) {
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;

        if (Double.compare(phone.price, price) != 0) return false;
        if (name != null ? !name.equals(phone.name) : phone.name != null) return false;
        return brand != null ? brand.equals(phone.brand) : phone.brand == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
