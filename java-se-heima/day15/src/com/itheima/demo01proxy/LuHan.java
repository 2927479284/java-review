package com.itheima.demo01proxy;

//定义鹿晗类,实现Star接口  ctrl+r:查找并替换
public class LuHan implements Star{
    @Override
    public void changGe() {
        System.out.println("鹿晗在唱歌!");
    }

    @Override
    public void tiaoWu() {
        System.out.println("鹿晗在跳舞!");
    }

    @Override
    public void rap() {
        System.out.println("鹿晗在rap!");
    }

    @Override
    public void daLanQiu() {
        System.out.println("鹿晗在打篮球!");
    }

    @Override
    public void tiZuQiu() {
        System.out.println("鹿晗在踢足球!");
    }

    @Override
    public String zhiBoDaiHuo(double moeny) {
        System.out.println("鹿晗在直播带货,在卖辣条,一包辣条"+moeny+"钱!");
        return "鹿晗给粉丝免费赠送辣条了";
    }
}
