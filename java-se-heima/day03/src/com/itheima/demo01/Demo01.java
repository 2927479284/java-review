package com.itheima.demo01;

/*
    代码块:被{ }包裹的一块代码
 */
public class Demo01 {
    public static void main(String[] args) {
        /*
            1.局部代码块:写在方法中的代码块
            作用:可以改变变量的作用域
            变量的作用域:在{ }所在的范围内有效
            定义一个变量,只想使用一次,可以写在局部代码块中,使用完毕会立即消失
         */
        int a = 10;
        {
            int b = 20;
            System.out.println(b);
        }
        //System.out.println(b);//Cannot resolve symbol 'b'
        //System.out.println(c);//Cannot resolve symbol 'c'
        System.out.println(a);
        System.out.println("--------------------------");
        Person p1 = new Person();
        System.out.println(p1.getName()+"\t"+p1.getAge());
        Person p2 = new Person("小明",18);
        System.out.println(p2.getName()+"\t"+p2.getAge());
        System.out.println("-----------------------");
        //遍历Person类的静态数组arr
        for (int i = 0; i < Person.arr.length; i++) {
            System.out.println(Person.arr[i]);
        }
        System.out.println("---------------");
        System.out.println("bb:"+Person.bb);
    }
}
