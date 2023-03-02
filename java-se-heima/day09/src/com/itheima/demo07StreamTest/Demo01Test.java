package com.itheima.demo07StreamTest;

import java.util.ArrayList;
import java.util.List;

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
public class Demo01Test {
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
        List<String> one1 = new ArrayList<>();
        for (String s : one) {
            if(s.length()==3){
                one1.add(s);
            }
        }
        System.out.println(one1);//[宋远桥, 苏星河, 洪七公, 张无忌, 周伯通]

        //2. 第一个队伍筛选之后只要前3个人,把前3个人存储到一个新的集合中
        List<String> one2 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {//i=0,1,2
            one2.add(one1.get(i));
        }
        System.out.println(one2);//[宋远桥, 苏星河, 洪七公]


        List<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("张三丰");
        two.add("赵丽颖");
        two.add("张二狗");
        two.add("张天爱");
        two.add("张三");

        //3. 第二个队伍只要姓张的成员姓名,把姓张的成员姓名存储到一个新的集合中
        List<String> two1 = new ArrayList<>();
        for (String s : two) {
            if(s.startsWith("张")){
                two1.add(s);
            }
        }
        System.out.println(two1);

        //4. 第二个队伍筛选之后不要前2个人,跳过前2个人,把其余的人存储到一个新的集合中
        List<String> two2 = new ArrayList<>();
        for (int i = 2; i < two1.size(); i++) {
            two2.add(two1.get(i));
        }
        System.out.println(two2);

        //5. 将两个队伍合并为一个队伍,把两个过滤之后集合组合为一个新的集合
        List<String> all = new ArrayList<>();
        /*
            Collection接口中方法
                boolean addAll(Collection<? extends E> c)
                    将指定集合中的所有元素添加到此集合
         */
        all.addAll(one2);
        all.addAll(two2);
        System.out.println(all);//[宋远桥, 苏星河, 洪七公, 张二狗, 张天爱, 张三]

        //6. 根据姓名创建 Person 对象,把Person对象存储到一个新的集合
        List<Person> list = new ArrayList<>();
        for (String s : all) {
            list.add(new Person(s));
        }

        //7. 打印整个队伍的Person对象信息。
        for (Person p : list) {
            System.out.println(p);
        }
    }
}
