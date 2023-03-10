package com.itheima.demo08;


/**
 * 李四D实现(demo给他创建对应的动态代理)
 */
public class Ls implements Star{
    @Override
    public void changGe() {
        System.out.println("李四在唱歌");
    }

    @Override
    public void tiaoWu() {
        System.out.println("李四在跳舞");
    }

    @Override
    public void xueXi() {
        System.out.println("李四在学习");
    }

    @Override
    public void daiHuo() {
        System.out.println("李四在直播带货");
    }

    @Override
    public String wenDa(Object o) {
        System.out.println("李四在问答阶段");
        return String.valueOf(o);
    }
}
