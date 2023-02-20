package com.itheima.demo09Test;

import java.util.Scanner;

/*
    综合案例1-封装用户输入的数据到对象中
    我们经常要在浏览器的页面中让用户输入一些数据
    然后获取这些数据,把数据存储到一个对象中
    具体需求如下:学生练习
    1.定义Scanner对象
    2.使用Scanner对象中的方法nextline,获取用户输入的用户名(例如: “jack”)
    3.使用Scanner对象中的方法nextline,获取用户输入的密码(例如: “1234”)
    4.使用Scanner对象中的方法nextline,获取用户输入的年龄(例如: “18”)
    5.使用Scanner对象中的方法nextline,获取用户输入的身高(例如: “1.75”)
    6.使用Scanner对象中的方法nextline,获取用户输入的是否婚配(例如:“true“:结婚;”false”:未结婚)
    7.定义User类,属性包含(用户名:String类型,密码:String类型,年龄:int类型,身高:double类型,婚配:boolean类型)
    8.把用户输入的数据封装到User对象中(个别的数据需要类型转换后赋值)
    9.最终打印用户的各项数据
 */
public class Demo01Test {
    public static void main(String[] args) {
        //1.定义Scanner对象
        Scanner sc = new Scanner(System.in);
        //2.使用Scanner对象中的方法nextline,获取用户输入的用户名(例如: “jack”)
        System.out.println("请输入用户名:");
        String username = sc.nextLine();
        //3.使用Scanner对象中的方法nextline,获取用户输入的密码(例如: “1234”)
        System.out.println("请输入密码:");
        String password = sc.nextLine();
        //4.使用Scanner对象中的方法nextline,获取用户输入的年龄(例如: “18”)
        System.out.println("请输入年龄:");
        String age = sc.nextLine();
        //5.使用Scanner对象中的方法nextline,获取用户输入的身高(例如: “1.75”)
        System.out.println("请输入身高:");
        String height = sc.nextLine();
        //6.使用Scanner对象中的方法nextline,获取用户输入的是否婚配(例如:“true“:结婚;”false”:未结婚)
        System.out.println("请输入是否婚配(例如:“true“:结婚;”false”:未结婚):");
        String hp = sc.nextLine();
        //8.把用户输入的数据封装到User对象中(个别的数据需要类型转换后赋值)
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setAge(Integer.parseInt(age));
        user.setHeigth(Double.parseDouble(height));
        user.setHp(Boolean.parseBoolean(hp));
        //9.最终打印用户的各项数据
        System.out.println(user);
    }
}
