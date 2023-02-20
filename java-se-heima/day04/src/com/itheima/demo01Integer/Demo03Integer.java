package com.itheima.demo01Integer;

/*
    基本类型与字符串之间的转换(重点,经常使用)
 */
public class Demo03Integer {
    public static void main(String[] args) {
        //1.基本类型数据==>字符串类型
        //(重点)a.基本类型数据+"":工作中经常使用
        String s1 = ""+10;//"10"
        System.out.println(s1+10);//"1010"

        //b.可以使用包装类中的静态方法toString
        String s2 = Integer.toString(10);//"10"
        System.out.println(s2+100);//"10"+100==>"10100"

        //c.可以使用String类中的静态方法valueOf
        String s3 = String.valueOf(10);//"10"
        System.out.println(s3+1000);//"10"+100==>"101000"

        //2.字符串类型==>基本类型数据(特别重要)
        int a = Integer.parseInt("100");
        System.out.println(a+10);//110

        double d = Double.parseDouble("8.8");
        System.out.println(d+1.1);//9.9

        //把字符串转换为char类型,需要使用String类的方法charAt(索引)
        char c = "abc".charAt(0);
        System.out.println(c);//a
        System.out.println("abc".charAt(1));//b
        System.out.println("abc".charAt(2));//c

        //parseXXX方法,参数必须传递基本数据类型的字符串,否则会抛出数字格式化异常,布尔类型除外
        //int e = Integer.parseInt("哈哈");//NumberFormatException: For input string: "哈哈"

        //布尔类型只有两个值:true  false
        boolean b1 = Boolean.parseBoolean("true");
        System.out.println("b1:"+b1);//b1:true
        boolean b2 = Boolean.parseBoolean("false");
        System.out.println("b2:"+b2);//b2:false
        boolean b3 = Boolean.parseBoolean("abc");//字符串不是true,得到的全是false
        System.out.println("b3:"+b3);//b3:false
    }
}
