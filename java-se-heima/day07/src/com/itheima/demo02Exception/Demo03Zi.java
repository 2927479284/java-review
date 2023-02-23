package com.itheima.demo02Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo03Zi extends Demo02Fu {
    //子类重写父类方法时,子类可以抛出和父类方法相同的异常
    @Override
    public void show01() throws NullPointerException, IndexOutOfBoundsException { }

    /*
        子类重写父类方法时,抛出父类异常的子类
        ArrayIndexOutOfBoundsException:数组索引越界异常 extends IndexOutOfBoundsException:索引越界异常
        StringIndexOutOfBoundsException:数组索引越界异常 extends IndexOutOfBoundsException:索引越界异常
     */
    @Override
    //public void show02() throws ArrayIndexOutOfBoundsException { }
    public void show02() throws StringIndexOutOfBoundsException { }

    //子类重写父类方法时,可以不抛出异常
    @Override
    public void show03() { }

    //父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常
    //overridden method does not throw 'java.lang.Exception'
    /*@Override
    public void show04()throws Exception { }*/

    //此时子类方法中产生异常，只能捕获处理，不能声明抛出
    @Override
    public void show04() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse("2022-324");
            System.out.println("[A]:"+date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
