package com.itheima.demo09Test;

public class Sales extends Worker {
    public Sales() {
    }

    public Sales(String name, String sex, String birthday) {
        super(name, sex, birthday);
    }

    @Override
    public void work() {
        System.out.println("售货员的工作：销售货物");
    }
}
