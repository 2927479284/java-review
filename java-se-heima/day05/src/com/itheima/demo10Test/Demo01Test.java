package com.itheima.demo10Test;

import java.util.ArrayList;

/*
    综合案例1-查找出集合中年龄最大的学生
    需求:
        1.定义一个学生类Student，包含三个属性姓名、年龄、性别，
            私有成员变量,生成无参，有参构造方法，生成get/set方法并重写toString()方法。
        2.创建三个学生对象存入ArrayList集合中。
        3. 遍历集合遍历输出。（输出格式如：姓名：张三, 年龄：23, 性别：男）
        4. 求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
 */
public class Demo01Test {
    public static void main(String[] args) {
        //2.创建三个学生对象存入ArrayList集合中。
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("小明",18,"男"));
        list.add(new Student("小王",26,"男"));
        list.add(new Student("小红",17,"女"));

        //3. 遍历集合遍历输出。（输出格式如：姓名：张三, 年龄：23, 性别：男）
        for (Student s : list) {
            //System.out.println(s);
            System.out.println("姓名:"+s.getName()+", 年龄:"+s.getAge()+", 性别:"+s.getSex());
        }

        //4. 求出年龄最大的学生，然后将该对象的姓名变为：小猪佩奇。
        //取出集合中的第一个元素,赋值给最大值
        Student max = list.get(0);
        //遍历集合,获取其他学生
        for (Student s : list) {
            //比较获取到的学生年龄>最大值学生的年龄
            if(s.getAge()>max.getAge()){
                //把s赋值给最大值
                max = s;
            }
        }
        //把年龄最大的学生,姓名修改为小猪佩奇
        max.setName("小猪佩奇");
        System.out.println(list);
    }
}
