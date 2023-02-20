package com.itheima.main;

import com.itheima.student.Student;
import com.itheima.teacher.Teacher;
import com.itheima.utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

/*
    一级菜单设计和实现
    分析:
        1.定义一个ArrayList集合,泛型使用Student,存储学员对象
        2.定义一个ArrayList集合,泛型使用Teacher,存储学教师对象
        3.创建Scanner对象
        4.定义一个死循环
        5.在死循环中打印一级菜单
        6.使用Scanner获取用户输入的功能选项
        7.根据用户输入的功能选项,选择对应的功能(switch,if)
 */
public class MainApp {
    public static void main(String[] args) {
        //1.定义一个ArrayList集合,泛型使用Student,存储学员对象
        ArrayList<Student> students = new ArrayList<>();
        //2.定义一个ArrayList集合,泛型使用Teacher,存储学教师对象
        ArrayList<Teacher> teachers = new ArrayList<>();
        //3.创建Scanner对象
        Scanner sc = new Scanner(System.in);
        //4.定义一个死循环
        while (true){
            //5.在死循环中打印一级菜单
            System.out.println("-------------------欢迎使用管理系统--------------------");
            System.out.println("1.学员信息管理   2.教师信息管理   3.退出");
            //6.使用Scanner获取用户输入的功能选项
            System.out.println("请选择您要执行的功能:");
            int choose = sc.nextInt();
            //7.根据用户输入的功能选项,选择对应的功能(switch,if)
            switch (choose){
                case 1:
                    //调用学员信息管理方法
                    studentManager(students,sc);
                    break;
                case 2:
                    //调用教师信息管理方法
                    teacherManager(teachers,sc);
                    break;
                case 3:
                    //3.退出
                    System.out.println("欢迎下次使用,拜拜!");
                    System.exit(0);//终止JVM
                default:
                    //输入的不是1,2,3:提示错误信息
                    System.out.println("您输入的有误,请重新输入!");
                    break;
            }
        }
    }

    /*
        教师信息管理方法
     */
    private static void teacherManager(ArrayList<Teacher> teachers, Scanner sc) {
        //1.定义一个死循环,让功能重复执行
        while (true){
            //2.在死循环中打印二级菜单
            System.out.println("【教师信息管理】");
            System.out.println("1.添加教师  2.修改教师  3.删除教师  4.查询教师  5.返回");
            //3.使用Scanner获取用户输入的功能选项
            System.out.println("请输入功能序号:");
            int choose = sc.nextInt();
            //4.根据用户输入的功能选项,选择对应的功能(switch,if)
            switch (choose){
                case 1:
                    //1.添加教师==>调用添加教师的方法
                    addTeacher(teachers,sc);
                    break;
                case 2:
                    //2.修改教师==>调用修改教师的方法
                    updateTeacher(teachers,sc);
                    break;
                case 3:
                    //3.删除教师==>调用删除教师的方法
                    deleteTeacher(teachers,sc);
                    break;
                case 4:
                    //4.查询教师==>调用查询教师的方法
                    selectTeacher(teachers);
                    break;
                case 5:
                    //5.返回
                    return;//结束教师管理方法
                default:
                    //输入的不是1,2,3,4,5:提示错误信息
                    System.out.println("您输入的有误,请重新输入!");
                    break;
            }
        }
    }

    /*
        查询教师的方法
        1.对存储教师的集合长度进行判断
        2.集合的长度为0,集合中没有教师,提示"【查询结果】无数据"
        3.集合的长度不为0,集合中有教师,调用工具类中遍历集合的方法
     */
    private static void selectTeacher(ArrayList<Teacher> students) {
        System.out.println("【查询教师功能】");
        //1.对存储教师的集合长度进行判断
        if(students.size()==0){
            //2.集合的长度为0,集合中没有教师,提示"【查询结果】无数据"
            System.out.println("【查询结果】无数据");
        }else{
            //3.集合的长度不为0,集合中有教师,调用工具类中遍历集合的方法
            Utils.printArrayList(students);
        }
    }

    /*
        删除教师的方法
        1.获取用户输入的要删除的教师id
        2.遍历存储教师的ArrayList集合,获取每一个Student对象
        3.使用用户输入的教师id和遍历得到的教师id比较
        4.id一样,找到了,调用工具类中打印教师信息的方法,打印教师信息
        5.获取用户输入的删除选项(y|n)
        6.判断用户输入的删除选项
            输入是y:删除教师
                a.使用ArrayList集合中的方法remove删除教师对象
                b.删除成功,提示"【成功】ID是"+id+"的数据已被删除!"
                c.结束删除方法
            输入不是y:取消删除
                a.提示"【取消】删除操作被取消!"
                b.结束删除方法
        7.遍历结束了,还没有找到要修改的教师,提示"【错误】学习ID:"+id+"没找到!"
     */
    private static void deleteTeacher(ArrayList<Teacher> students, Scanner sc) {
        System.out.println("【删除教师功能】");
        //1.获取用户输入的要删除的教师id
        System.out.println("请输入要删除的教师id:");
        int id = sc.nextInt();
        //2.遍历存储教师的ArrayList集合,获取每一个Student对象
        for (int i = 0; i < students.size(); i++) {
            Teacher s = students.get(i);
            //3.使用用户输入的教师id和遍历得到的教师id比较
            if(id==s.getId()){
                //4.id一样,找到了,调用工具类中打印教师信息的方法,打印教师信息
                System.out.println("【查询结果】要删除的教师信息:");
                System.out.println("*****************************************************");
                Utils.printPerson(s);
                System.out.println("*****************************************************");
                //5.获取用户输入的删除选项(y|n)
                System.out.println("【确认】您确定要删除这条信息吗(y|n)?");
                String yAndN = sc.next();
                //6.判断用户输入的删除选项
                if("y".equalsIgnoreCase(yAndN)){
                    //输入是y:删除教师
                    //a.使用ArrayList集合中的方法remove删除教师对象
                    //students.remove(s);//根据学生对象删除
                    students.remove(i);//根据学生索引删除
                    //b.删除成功,提示"【成功】ID是"+id+"的数据已被删除!"
                    System.out.println("【成功】ID是"+id+"的数据已被删除!");
                    //c.结束删除方法
                    return;
                }else {
                    //输入不是y:取消删除
                    //a.提示"【取消】删除操作被取消!"
                    System.out.println("【取消】删除操作被取消!");
                    //b.结束删除方法
                    return;
                }
            }
        }

        //7.遍历结束了,还没有找到要修改的教师,提示"【错误】学习ID:"+id+"没找到!"
        System.out.println("【错误】学习ID:"+id+"没找到!");
    }

    /*
        修改教师的方法
        1.获取用户输入的要修改的教师id
        2.遍历存储教师的ArrayList集合,获取每一个Student对象
        3.使用用户输入的教师id和遍历得到的教师id比较
        4.id一样,找到了,调用工具类中打印教师信息的方法,打印教师信息
        5.获取用户要修改的教师信息(姓名,性别,出生日期(yyyy-MM-dd))
        6.判断用户输入的是否为0,不是0则修改教师信息
        7.修改成功,提示"【成功】"+id+"是教师信息修改成功!"
        8.修改成功,结束修改方法
        9.遍历结束了,还没有找到要修改的教师,提示"【错误】学习ID:"+id+"没找到!"
     */
    private static void updateTeacher(ArrayList<Teacher> students, Scanner sc) {
        System.out.println("【修改教师功能】");
        //1.获取用户输入的要修改的教师id
        System.out.println("请输入要修改的教师id:");
        int id = sc.nextInt();
        //2.遍历存储教师的ArrayList集合,获取每一个Student对象
        for (int i = 0; i < students.size(); i++) {
            Teacher s = students.get(i);
            //3.使用用户输入的教师id和遍历得到的教师id比较
            if(id==s.getId()){
                //4.id一样,找到了,调用工具类中打印教师信息的方法,打印教师信息
                System.out.println("【查询结果】要修改的教师信息:");
                System.out.println("*****************************************************");
                Utils.printPerson(s);
                System.out.println("*****************************************************");
                //5.获取用户要修改的教师信息(姓名,性别,出生日期(yyyy-MM-dd))
                System.out.println("请输入新的教师姓名(保留原值输入0):");
                String name = sc.next();
                System.out.println("请输入新的教师性别(保留原值输入0):");
                String sex = sc.next();
                System.out.println("请输入新的教师出生日期(保留原值输入0)(yyyy-MM-dd):");
                String birthday = sc.next();
                //6.判断用户输入的是否为0,不是0则修改教师信息
                if(!"0".equals(name)){
                    s.setName(name);
                }
                if(!"0".equals(sex)){
                    s.setSex(sex);
                }
                if(!"0".equals(birthday)){
                    s.setBirthday(birthday);
                }
                //7.修改成功,提示"【成功】ID是"+id+"的教师信息修改成功!"
                System.out.println("【成功】ID是"+id+"的教师信息修改成功!");
                //8.修改成功,结束修改方法
                return;
            }
        }
        //9.遍历结束了,还没有找到要修改的教师,提示"【错误】学习ID:"+id+"没找到!"
        System.out.println("【错误】学习ID:"+id+"没找到!");
    }

    /*
        添加教师的方法
        1.获取用户输入的教师信息(姓名,性别,出生日期(yyyy-MM-dd))
        2.创建Student对象,封装用户输入的信息
        3.把Student对象存储到教师集合中
        4.提示"【成功】教师信息"+name+"添加成功"
     */
    private static void addTeacher(ArrayList<Teacher> students, Scanner sc) {
        System.out.println("【添加教师功能】");
        //1.获取用户输入的教师信息(姓名,性别,出生日期(yyyy-MM-dd))
        System.out.println("请输入教师姓名:");
        String name = sc.next();
        System.out.println("请输入教师性别:");
        String sex = sc.next();
        System.out.println("请输入教师出生日期(yyyy-MM-dd):");
        String birthday = sc.next();
        //2.创建Student对象,封装用户输入的信息
        Teacher stu = new Teacher(++Utils.stuId,name,sex,birthday);
        //3.把Student对象存储到教师集合中
        students.add(stu);
        //4.提示"【成功】教师信息"+name+"添加成功!"
        System.out.println("【成功】教师信息"+name+"添加成功!");
    }

    /*
        学员信息管理方法
        参数:
            ArrayList<Student> students:存储学生对象的集合,用于集合进行增删改查
            Scanner sc:传递Scanner对象,用于输入学生信息
        实现二级菜单:
            1.定义一个死循环,让功能重复执行
            2.在死循环中打印二级菜单
            3.使用Scanner获取用户输入的功能选项
            4.根据用户输入的功能选项,选择对应的功能(switch,if)
     */
    private static void studentManager(ArrayList<Student> students, Scanner sc) {
        //1.定义一个死循环,让功能重复执行
        while (true){
            //2.在死循环中打印二级菜单
            System.out.println("【学员信息管理】");
            System.out.println("1.添加学员  2.修改学员  3.删除学员  4.查询学员  5.返回");
            //3.使用Scanner获取用户输入的功能选项
            System.out.println("请输入功能序号:");
            int choose = sc.nextInt();
            //4.根据用户输入的功能选项,选择对应的功能(switch,if)
            switch (choose){
                case 1:
                    //1.添加学员==>调用添加学员的方法
                    addStudent(students,sc);
                    break;
                case 2:
                    //2.修改学员==>调用修改学员的方法
                    updateStudent(students,sc);
                    break;
                case 3:
                    //3.删除学员==>调用删除学员的方法
                    deleteStudent(students,sc);
                    break;
                case 4:
                    //4.查询学员==>调用查询学员的方法
                    selectStudent(students);
                    break;
                case 5:
                    //5.返回
                    return;//结束学员管理方法
                default:
                    //输入的不是1,2,3,4,5:提示错误信息
                    System.out.println("您输入的有误,请重新输入!");
                    break;
            }
        }
    }

    /*
        查询学员的方法
        1.对存储学员的集合长度进行判断
        2.集合的长度为0,集合中没有学员,提示"【查询结果】无数据"
        3.集合的长度不为0,集合中有学员,调用工具类中遍历集合的方法
     */
    private static void selectStudent(ArrayList<Student> students) {
        System.out.println("【查询学员功能】");
        //1.对存储学员的集合长度进行判断
        if(students.size()==0){
            //2.集合的长度为0,集合中没有学员,提示"【查询结果】无数据"
            System.out.println("【查询结果】无数据");
        }else{
            //3.集合的长度不为0,集合中有学员,调用工具类中遍历集合的方法
            Utils.printArrayList(students);
        }
    }

    /*
        删除学员的方法
        1.获取用户输入的要删除的学员id
        2.遍历存储学员的ArrayList集合,获取每一个Student对象
        3.使用用户输入的学员id和遍历得到的学员id比较
        4.id一样,找到了,调用工具类中打印学员信息的方法,打印学员信息
        5.获取用户输入的删除选项(y|n)
        6.判断用户输入的删除选项
            输入是y:删除学员
                a.使用ArrayList集合中的方法remove删除学员对象
                b.删除成功,提示"【成功】ID是"+id+"的数据已被删除!"
                c.结束删除方法
            输入不是y:取消删除
                a.提示"【取消】删除操作被取消!"
                b.结束删除方法
        7.遍历结束了,还没有找到要修改的学员,提示"【错误】学习ID:"+id+"没找到!"
     */
    private static void deleteStudent(ArrayList<Student> students, Scanner sc) {
        System.out.println("【删除学员功能】");
        //1.获取用户输入的要删除的学员id
        System.out.println("请输入要删除的学员id:");
        int id = sc.nextInt();
        //2.遍历存储学员的ArrayList集合,获取每一个Student对象
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            //3.使用用户输入的学员id和遍历得到的学员id比较
            if(id==s.getId()){
                //4.id一样,找到了,调用工具类中打印学员信息的方法,打印学员信息
                System.out.println("【查询结果】要删除的学员信息:");
                System.out.println("*****************************************************");
                Utils.printPerson(s);
                System.out.println("*****************************************************");
                //5.获取用户输入的删除选项(y|n)
                System.out.println("【确认】您确定要删除这条信息吗(y|n)?");
                String yAndN = sc.next();
                //6.判断用户输入的删除选项
                if("y".equalsIgnoreCase(yAndN)){
                    //输入是y:删除学员
                    //a.使用ArrayList集合中的方法remove删除学员对象
                    //students.remove(s);//根据学生对象删除
                    students.remove(i);//根据学生索引删除
                    //b.删除成功,提示"【成功】ID是"+id+"的数据已被删除!"
                    System.out.println("【成功】ID是"+id+"的数据已被删除!");
                    //c.结束删除方法
                    return;
                }else {
                    //输入不是y:取消删除
                    //a.提示"【取消】删除操作被取消!"
                    System.out.println("【取消】删除操作被取消!");
                    //b.结束删除方法
                    return;
                }
            }
        }

        //7.遍历结束了,还没有找到要修改的学员,提示"【错误】学习ID:"+id+"没找到!"
        System.out.println("【错误】学习ID:"+id+"没找到!");
    }

    /*
        修改学员的方法
        1.获取用户输入的要修改的学员id
        2.遍历存储学员的ArrayList集合,获取每一个Student对象
        3.使用用户输入的学员id和遍历得到的学员id比较
        4.id一样,找到了,调用工具类中打印学员信息的方法,打印学员信息
        5.获取用户要修改的学员信息(姓名,性别,出生日期(yyyy-MM-dd))
        6.判断用户输入的是否为0,不是0则修改学员信息
        7.修改成功,提示"【成功】"+id+"是学员信息修改成功!"
        8.修改成功,结束修改方法
        9.遍历结束了,还没有找到要修改的学员,提示"【错误】学习ID:"+id+"没找到!"
     */
    private static void updateStudent(ArrayList<Student> students, Scanner sc) {
        System.out.println("【修改学员功能】");
        //1.获取用户输入的要修改的学员id
        System.out.println("请输入要修改的学员id:");
        int id = sc.nextInt();
        //2.遍历存储学员的ArrayList集合,获取每一个Student对象
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            //3.使用用户输入的学员id和遍历得到的学员id比较
            if(id==s.getId()){
                //4.id一样,找到了,调用工具类中打印学员信息的方法,打印学员信息
                System.out.println("【查询结果】要修改的学员信息:");
                System.out.println("*****************************************************");
                Utils.printPerson(s);
                System.out.println("*****************************************************");
                //5.获取用户要修改的学员信息(姓名,性别,出生日期(yyyy-MM-dd))
                System.out.println("请输入新的学员姓名(保留原值输入0):");
                String name = sc.next();
                System.out.println("请输入新的学员性别(保留原值输入0):");
                String sex = sc.next();
                System.out.println("请输入新的学员出生日期(保留原值输入0)(yyyy-MM-dd):");
                String birthday = sc.next();
                //6.判断用户输入的是否为0,不是0则修改学员信息
                if(!"0".equals(name)){
                    s.setName(name);
                }
                if(!"0".equals(sex)){
                    s.setSex(sex);
                }
                if(!"0".equals(birthday)){
                    s.setBirthday(birthday);
                }
                //7.修改成功,提示"【成功】ID是"+id+"的学员信息修改成功!"
                System.out.println("【成功】ID是"+id+"的学员信息修改成功!");
                //8.修改成功,结束修改方法
                return;
            }
        }
        //9.遍历结束了,还没有找到要修改的学员,提示"【错误】学习ID:"+id+"没找到!"
        System.out.println("【错误】学习ID:"+id+"没找到!");
    }

    /*
        添加学员的方法
        1.获取用户输入的学员信息(姓名,性别,出生日期(yyyy-MM-dd))
        2.创建Student对象,封装用户输入的信息
        3.把Student对象存储到学员集合中
        4.提示"【成功】学员信息"+name+"添加成功"
     */
    private static void addStudent(ArrayList<Student> students, Scanner sc) {
        System.out.println("【添加学员功能】");
        //1.获取用户输入的学员信息(姓名,性别,出生日期(yyyy-MM-dd))
        System.out.println("请输入学员姓名:");
        String name = sc.next();
        System.out.println("请输入学员性别:");
        String sex = sc.next();
        System.out.println("请输入学员出生日期(yyyy-MM-dd):");
        String birthday = sc.next();
        //2.创建Student对象,封装用户输入的信息
        Student stu = new Student(++Utils.stuId,name,sex,birthday);
        //3.把Student对象存储到学员集合中
        students.add(stu);
        //4.提示"【成功】学员信息"+name+"添加成功!"
        System.out.println("【成功】学员信息"+name+"添加成功!");
    }
}
