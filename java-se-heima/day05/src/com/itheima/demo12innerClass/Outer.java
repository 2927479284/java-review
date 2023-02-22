package com.itheima.demo12innerClass;

/*
    2.局部内部类:定义在其他类的方法中
    定义格式:
        修饰符 class 外部类名{
            修饰符 返回值类型 外部类方法名(参数列表){
                (final)class 局部内部类名{
                    局部内部类的成员变量;
                    局部内部类的成员方法();
                }

                局部内部类名 变量名 = new 局部内部类名();
                变量名.局部内部类的成员变量
                变量名.局部内部类的成员方法();
            }
        }
    使用格式:局部内部类的作用域就在方法中有效,出了方法就消失了
        必须在方法中定义完毕之后,立即使用
 */
public class Outer {
    //定义外部类的成员方法
    public void outer(){
        //定义局部内部类
        final class Inner{
            //定义局部内部类成员变量
            private String name;
            private int age;

            public Inner() {
            }

            public Inner(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return "Inner{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }
        }

        //在定义完局部内部类之后,必须在方法结束前创建对象使用
        Inner in = new Inner("迪丽热巴",18);
        System.out.println(in);
    }
}
