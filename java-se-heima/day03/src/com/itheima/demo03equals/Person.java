package com.itheima.demo03equals;

public class Person extends Object {
    private String name;
    private int age;

    /*
        Object类的equals方法,默认比较两个对象的地址值,没有意义(地址值肯定不同)
        重写equals方法,比较两个对象的属性值(name,age)
        快捷键:alt+inert==>选择equals() and hashCode()
        方法中的this:调用方法的对象p1
        方法的参数o:传递的参数p2
     */
    @Override
    public boolean equals(Object o) {
        //if语句目的:两个对象的地址相同,说是同一个对象,直接返回true,可以提高效率
        if (this == o){
            return true;
        }
        /*
            o == null==>传递的参数是null,使用p1和null比较地址值肯定不同,直接返回false,可以提高效率
            getClass() != o.getClass():使用反射技术,判断o(p2)是否为Person类型,不是Person类型直接返回false,可以提高效率
                等价于!(o instanceof Person):判断某个对象是否属于某种数据类型
         */
        /*if (o == null || !(o instanceof Person)){
            return false;
        }*/
        if (o == null || this.getClass() != o.getClass()){
            return false;
        }

        /*
            Object o = p2 = new Person("李四",18);
            多态: 父类的类型变量指向了子类的对象
            多态弊端:不能使用子类特有的成员变量和成员方法
         */
        Person person = (Person) o;

        //先比较两个人的年龄是否相同,不相同直接返回false
        if (this.age != person.age){
            return false;
        }
        //this.name.equals(person.name) "张三".equals("李四"):String类重写了equals,比较的字符串的内容是否相同
        return this.name != null ? this.name.equals(person.name) : person.name == null;
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
