package com.itheima.demo06Annotation;

/*
    使用自定义注解(重点)
    注解可以使用的位置:
        包上,类上|接口上|枚举上|注解上,成员变量上,成员方法上,构造方法上,局部变量上,方法的参数上...
    注意:
        1.同一个位置,同名的注解,只能使用一次
        2.同一个位置,不同的注解,可以写多个
        3.在不同的位置,同名的注解,可以多次使用
    格式:
        1.没有属性的注解:@注解名 直接使用
        2.有属性的注解:必须使用键值对的方式,给所有的属性赋值之后,才能使用
            @注解名(属性名=属性值,属性名=属性值,属性名=属性值,...属性名=属性值)
            a.有默认值的属性,可以不用赋值,使用默认值
            b.有多个属性需要赋值,多个属性之间需要使用逗号分隔开
            c.属性的数据类型是数组,那么属性的值需要使用一个大括号包裹起来,说明这是一个属性的值
                public abstract String[] arr();
                arr={"aa","bb","cc","dd"}
                数组的值只有一个,那么可以省略大括号
                arr = {"aa"} 简化为  arr="aa"
           d.注解中只有一个属性,属性名叫value
             或者注解中有其他的属性,但是其他的属性必须有默认值
             那么在给value属性赋值的时候,可以省略属性名,直接写属性值
 */
@MyAnno01
@MyAnno02(a = 10,arr={"aa","bb","cc","dd"})
@MyAnno03(value=true)
public class UseMyAnno {
    @MyAnno01
    @MyAnno02(a = 100,d=1.1,arr="aa")
    @MyAnno03(false)
    private String name;
    @MyAnno01
    private int age;

    @MyAnno01
    public UseMyAnno() {
    }

    public UseMyAnno(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @MyAnno01
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
