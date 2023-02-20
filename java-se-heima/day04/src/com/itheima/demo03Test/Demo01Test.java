package com.itheima.demo03Test;

/*
    类名作为方法参数和返回值类型
    类名:Student
    引用数据类型作为参数和返回值:传递的是对象的地址值,返回的也是对象的地址值
 */
public class Demo01Test {
    public static void main(String[] args) {
        Student s1 = new Student("张三",18);
        System.out.println(s1);//@140e19d
        //调用show方法,实参传递一个Student对象,给形参赋值
        show(s1);//@140e19d
        System.out.println("-------------------------");

        //Student s4 = getStudent();=s3=@17327b6==>new Student("李四",20);
        Student s4 = getStudent();
        System.out.println(s4.getName()+"\t"+s4.getAge());//李四	20
    }

    /*
        定义一个方法,方法的返回值类型使用Student
            方法的返回值类型使用Student,方法中就需要返回一个Student对象(值)
            方法的返回值类型使用int,方法中就需要返回一个整数10(值)
            方法的返回值类型使用String,方法中就需要返回一个字符串"aaa"(值)
            方法的返回值类型使用double[],方法中就需要返回一个数组对象 new double[10];(值)
     */
    public static Student getStudent(){
        Student s3 = new Student("李四",20);
        System.out.println(s3);//@17327b6
        return s3;//@17327b6
    }

    /*
        定义一个方法,方法的形式参数类型使用Student
        Student s2 = s1 = @140e19d==>new Student("张三",18);
     */
    public static void show(Student s2){
        System.out.println(s2.getName()+"\t"+s2.getAge());
    }
}
