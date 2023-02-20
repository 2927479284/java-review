package com.itheima.demo09Test;

/**
 * 收银员
 */
public class Cashier extends Worker{
    public Cashier() {
    }

    public Cashier(String name, String sex, String birthday) {
        super(name, sex, birthday);
    }

    @Override
    public void work() {
        System.out.println("收银员的工作：收钱");
    }
}
