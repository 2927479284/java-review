package com.itheima.demo08Test;

/*
    定义销售员类
 */
public class Sales {
    /*
        定义销售方法(sell(...)),可以销售任意类型的车
        多态:方法的参数使用父类类型,可以接收Car任意的子类对象
        Car car = new BanZCars();
        Car car = new BanZSUV()
        Car car = new BMWCars()
        Car car = new BMWSUV()
     */
    public void sell(Car car){
        car.run();

        //扩展:判断车实现类IGPS接口,调用使用GPS功能
        if( car instanceof BMWCars){
            BMWCars b1 = (BMWCars)car;
            b1.useGPS();
        }

        if( car instanceof BMWSUV){
            BMWSUV b2 = (BMWSUV)car;
            b2.useGPS();
        }
    }
}
