package com.itheima.demo07StreamTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
    综合案例(练习)
    现在有两个 ArrayList 集合存储队伍当中的多个成员姓名，要求使用传统的for循环（或增强for循环）
    依次进行以下若干操作步骤：
    1. 第一个队伍只要名字为3个字的成员姓名,把3个字成员的姓名存储到一个新的集合中
    2. 第一个队伍筛选之后只要前3个人,把前3个人存储到一个新的集合中
    3. 第二个队伍只要姓张的成员姓名,把姓张的成员姓名存储到一个新的集合中
    4. 第二个队伍筛选之后不要前2个人,跳过前2个人,把其余的人存储到一个新的集合中
    5. 将两个队伍合并为一个队伍,把两个过滤之后集合组合为一个新的集合
    6. 根据姓名创建 Person 对象,把Person对象存储到一个新的集合
    7. 打印整个队伍的Person对象信息。
 */
public class Demo02Test {
    public static void main(String[] args) {
        List<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("老子");
        one.add("庄子");
        one.add("孙子");
        one.add("洪七公");
        one.add("张无忌");
        one.add("周伯通");
        //1. 第一个队伍只要名字为3个字的成员姓名,把3个字成员的姓名存储到一个新的集合中
        //2. 第一个队伍筛选之后只要前3个人,把前3个人存储到一个新的集合中
        //把one集合转换为Stream流
        Stream<String> oneStream = one.stream().filter(s -> s.length() == 3).limit(3);

        List<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("张三丰");
        two.add("赵丽颖");
        two.add("张二狗");
        two.add("张天爱");
        two.add("张三");

        //3. 第二个队伍只要姓张的成员姓名,把姓张的成员姓名存储到一个新的集合中
        //4. 第二个队伍筛选之后不要前2个人,跳过前2个人,把其余的人存储到一个新的集合中
        //把two集合转换为Stream流
        Stream<String> twoStream = two.stream().filter(s -> s.startsWith("张")).skip(2);

        //5. 将两个队伍合并为一个队伍,把两个过滤之后集合组合为一个新的集合
        //6. 根据姓名创建 Person 对象,把Person对象存储到一个新的集合
        //7. 打印整个队伍的Person对象信息。
        Stream.concat(oneStream,twoStream).map(s -> new Person(s)).forEach(s-> System.out.println(s));

        /*Stream.concat(
                one.stream().filter(s -> s.length() == 3).limit(3),
                two.stream().filter(s -> s.startsWith("张")).skip(2)
        ).map(s -> new Person(s)).forEach(s-> System.out.println(s));*/
    }
}
