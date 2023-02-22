package com.itheima.demo03variableArgs;

/*
    可变参数:
        是JDK1.5之后出现的新特性
    作用:
        【作为方法的形式参数使用,可以接收任意个同种数据类型的实际参数】
        当我们定义一个方法,方法参数的数据类型已经确定了,但是参数的个数不确定,就可以使用可变参数
    格式:
        修饰符 返回值类型 方法名(数据类型...变量名){
            方法体;
        }
    数据类型...变量名:可变参数
    int...a:可以接收任意个int类型的整数(不传递参数,传递1个参数,传递10个参数....传递100个参数...)
    String...a:可以接收任意个String类型的字符串(不传递参数,传递1个参数,传递10个参数....传递100个参数...)
    -------------------------------------------------
    注意:可变参数的底层就是一个数组,定义不同长度的数组,来存储传递的不同个数
 */
public class Demo01 {
    public static void main(String[] args) {
        //getSum();
        //getSum(10);
        int s1 = getSum(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        System.out.println("s1:"+s1);//s1:550
        int s2 = getSum(10, 20);
        System.out.println("s2:"+s2);//s2:30
    }

    /*
        定义一个方法,计算n个int类型整数和并返回
        已知:数据类型int
        未知:传递多少个参数
        解决:使用可变参数解决
        --------------------------------------------
        getSum();那么可变参数就会创建一个长度为0的数组,存储数据 int[] a = new int[]{ };
        getSum(10);那么可变参数就会创建一个长度为1的数组,存储数据 int[] a = new int[]{10};
        getSum(10,20);那么可变参数就会创建一个长度为2的数组,存储数据 int[] a = new int[]{10,20};
        ...
        getSum(10,20,30,40,50,60,70,80,90,100);那么可变参数就会创建一个长度为10的数组,
            存储数据 int[] a = new int[]{10,20,30,40,50,60,70,80,90,100};
     */
    public static int getSum(int...a){
        //System.out.println(a);
        //System.out.println(a.length);
        int sum = 0;
        for (int i : a) {
            sum+=i;
        }
        return sum;
    }
    /*
        定义一个方法,计算两四个int类型整数的和并返回
     */
    /*public static int getSum(int a,int b,int c,int d){
        return a+b+c+d;
    }*/

    /*
        定义一个方法,计算两三个int类型整数的和并返回
     */
    /*public static int getSum(int a,int b,int c){
        return a+b+c;
    }*/

    /*
        定义一个方法,计算两个int类型整数的和并返回
     */
    /*public static int getSum(int a,int b){
        return a+b;
    }*/
}
