package com.itheima.demo05GenericClass;

public class Demo01 {
    public static void main(String[] args) {
        Person p = new Person();
        //默认就是Object
        p.setName("aa");
        p.setName(true);
        p.setName(1);

        Person<String> p1 = new Person<>();
        p1.setName("jack");
        String n = p1.getName();
        System.out.println(n);

        Person<Integer> p2 = new Person<>();
        p2.setName(10);
        Integer a = p2.getName();
        System.out.println(a);
    }
}

class Demo011{
    public static void main(String[] args) {

        DongWu<Object, Integer> stringIntegerDongWu = new DongWu<>();
        Object s = stringIntegerDongWu.get(1);
        System.out.println(s);

    }
}

class DongWu<A,B>{
    private A name;

    public A getName() {
        return name;
    }

    public void setName(A name) {
        this.name = name;
    }

    public A get(B b){
        return (A) b;
    }
}