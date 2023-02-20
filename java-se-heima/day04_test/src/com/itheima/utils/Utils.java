package com.itheima.utils;

import com.itheima.superclass.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/*
    定义一个工具类
    工具类中的变量和方法一般都是静态的,通过类名可以直接使用
    一般的工具类都会私有空参数构造方法:不让用户创建对象
 */
public class Utils {
    //私有构造方法
    private Utils() {}

    //定义学生的id和教师的id
    public static int stuId;//默认值0
    public static int tecId;//默认值0

    /*
        定义一个打印Student|Teacher信息的静态方法
        参数:
            Person p:可以接收任意的子类对象==>多态
            Student对象,Teacher对象
        返回值:
            无
     */
    public static void printPerson(Person p){
        System.out.println("编号\t姓名\t\t性别\t\t生日\t\t\t年龄\t\t描述");
        System.out.println(p.toString());
    }

    /*
        定义一个打印学生集合|教师集合的静态方法
        参数:ArrayList<? extends Person>
            ? extends Person:泛型的上限限定
            传递ArrayList集合的泛型,只能是Person的子类或者Person本身
            ArrayList<Student>,ArrayList<Teacher>
        返回值:无
     */
    public static void printArrayList(ArrayList<? extends Person> list){
        System.out.println("*****************************************************");
        System.out.println("编号\t姓名\t\t性别\t\t生日\t\t\t年龄\t\t描述");
        //遍历集合,获取每一个对象
        for (int i = 0; i < list.size(); i++) {
            Person p = list.get(i);
            System.out.println(p.toString());
        }
        System.out.println("*****************************************************");
    }

    /*
        定义一个根据生日计算年龄的静态方法
        参数:
            String birthday
        返回值:
            int age
     */
    public static int birthdayToAge(String birthday){
        //把字符串格式的生日解析为Date日期类型
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //把变量定义在try的外边,可以提高变量的作用域,方便后边使用
        Date birthdayDate = null;
        try {
            birthdayDate = sdf.parse(birthday);
        } catch (ParseException e) {
            return -1;//输入的日期不符合模式,返回-1
        }

        //获取当前系统的日历对象
        Calendar calendarNow = Calendar.getInstance();
        Calendar calendarBir = Calendar.getInstance();
        //使用Calendar类中的方法setTime,把日期Date对象转换为日历Calendar对象
        calendarBir.setTime(birthdayDate);

        //使用Calendar类中的方法before,判断当前日期是否小于出生日期:是=>人还没有出生,返回-1
        //boolean before(Object when)判断此 Calendar 表示的时间是否在指定 Object 表示的时间之前，返回判断结果。
        if(calendarNow.before(calendarBir)){
            return -1;//人还没有出生,返回-1
        }

        //获取当前日历中的年月日
        int yearNow = calendarNow.get(Calendar.YEAR);
        int monthNow = calendarNow.get(Calendar.MONTH);
        int dateNow = calendarNow.get(Calendar.DATE);

        //获取生日日历中的年月日
        int yearBir = calendarBir.get(Calendar.YEAR);
        int monthBir = calendarBir.get(Calendar.MONTH);
        int dateBir = calendarBir.get(Calendar.DATE);
        //计算年龄
        //使用当前的年份与出生日期的年份相减,初步的计算年龄
        int age = yearNow-yearBir;
        //使用当前月份与出生日期的月份比较
        if(monthNow<=monthBir){
            //如果当前的月份小于等于出生月份,先比较月份是否相等
            if(monthNow==monthBir){
                //如果月份相等在比较日
                if(dateNow<dateBir){
                    //如果当前日小于出入日,生日还没有过,把生日-1
                    age--;
                }
            }else{
                //当前的月份小于出生的月份,生日还没有过,把生日-1
                age--;
            }
        }
        //如果当前的月份大于出生月份,生日已经过了,直接返回age
        return age;
    }
}