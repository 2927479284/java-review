package com.itheima.demo04lambda;

import java.util.Arrays;
import java.util.Comparator;

/*
    使用Lambda表达式重写有参数有返回值的方法(重点)
    需求:
    1.定义一个Person类,包含属性(姓名,年龄)
    2.定义一个存储长度为3的数组,存储Person对象
    3.定义三个Person对象存储数组中
    4.使用Arrays数组工具类中的方法sort,根据比较器产生的规则对Person对象进行排序
 */
public class Demo02Lambda {
    public static void main(String[] args) {
        //2.定义一个存储长度为3的数组,存储Person对象
        Person[] arr = new Person[3];
        //3.定义三个Person对象存储数组中
        arr[0] = new Person("刘备",50);
        arr[1] = new Person("张飞",18);
        arr[2] = new Person("关羽",28);
        //4.使用Arrays数组工具类中的方法sort,根据比较器产生的规则对Person对象进行排序
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                //根据年龄降序排序
                return o2.getAge()-o1.getAge();
            }
        });
        System.out.println(Arrays.toString(arr));

        //使用lambda表达式简化Comparator接口的匿名内部类
        Arrays.sort(arr,(Person o1, Person o2)->{
            //根据年龄升序排序
            return o1.getAge()-o2.getAge();
        });
        System.out.println(Arrays.toString(arr));
    }
}
