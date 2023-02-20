package com.itheima.demo09Test;

/*
    7.定义User类,属性包含(用户名:String类型,密码:String类型,年龄:int类型,身高:double类型,婚配:boolean类型)
 */
public class User {
    private String username;
    private String password;
    private int age;
    private double heigth;
    private boolean hp;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", heigth=" + heigth +
                ", hp=" + hp +
                '}';
    }

    public User() {
    }

    public User(String username, String password, int age, double heigth, boolean hp) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.heigth = heigth;
        this.hp = hp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }

    public boolean isHp() {
        return hp;
    }

    public void setHp(boolean hp) {
        this.hp = hp;
    }
}
