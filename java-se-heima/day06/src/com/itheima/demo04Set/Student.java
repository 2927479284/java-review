package com.itheima.demo04Set;

public class Student {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    /*
        重写Object类的hashCode方法:了解
            name.hashCode()+age;
        ---------------------------------------
        Student s1 = new Student("a",10);
        Student s2 = new Student("a",10);
        set.add(s1);计算s1的哈希值 97+10=107 在集合中找有没有107这个哈希值的元素,发现没有,直接把s1存储到集合中
        set.add(s2);计算s2的哈希值 97+10=107 在集合中找有没有107这个哈希值的元素,发现有,s2.equals(s1)==>true
            两个元素的哈希值相同,equals返回true,认定两个元素相同,不会把s2存储到Set集合中
        --------------------------------------------------------------------------------
        Student s3 = new Student("b",9);
        set.add(s3);计算s2的哈希值 98+9=107 在集合中找有没有107这个哈希值的元素,发现有,s3.equals(s1)==>false
             两个元素的哈希值相同,equals返回false,认定两个元素不同,会把s3存储到Set集合中
        --------------------------------------------------------------------------------
        降低不同元素出现相同哈希值的概率
             name.hashCode()*2+age;
             set.add(s1);计算s1的哈希值 97*2+10=204
             set.add(s3);计算s3的哈希值 98*2+9=205 发现集合中没有205这个哈希值的元素,直接存储到集合中
             name.hashCode()*31+age;
     */
    /*@Override
    public int hashCode() {
        return name.hashCode()+age;
    }*/
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    public Student() {
    }

    public Student(String name, int age) {
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
