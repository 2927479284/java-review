package com.itheima.demo08synchronized;

/*
    卖票案例:创建3个线程,卖同100张票
    出现了线程安全问题:卖出了重复的票和不存在的票
    解决线程安全问题的第一种方式:使用同步代码块
    格式:
        synchronized(锁对象){
            可能产生线程安全问题的代码(访问了共享数据的代码)
        }
    原理:
        使用同步代码块把一段代码锁住,只让一个线程进入到代码块中执行卖票的代码
    注意:
        1.同步代码块使用的锁对象可以是任意的对象
               Student s = new Student();Object obj = new Object();String s = "abc"; //底层是一个字符数组
        2.必须保证所有的线程使用的是同一个锁对象
 */
public class RunnableImpl implements Runnable {
    //定义一个供3个线程共享的票源
    private int ticket = 100;
    //定义一个锁对象:供所有的线程使用
    //private Student stu = new Student();
    //private Object obj = new Object();
    private String str = "abc";

    //线程任务:卖票==>票依次减少
    @Override
    public void run() {
        //增加一个死循环:让线程重复卖票
        while (true){
            //同步代码块
            synchronized (str){
                //对票进行判断大于0在卖票
                if(ticket>0){
                    //卖出每张票需要10毫秒
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"现在正在卖第"+ticket+"张票!");
                    ticket--;
                }else{
                    break;
                }
            }
        }
    }
}
