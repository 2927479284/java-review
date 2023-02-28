package com.itheima.demo09synchronized;

/*
    卖票案例:创建3个线程,卖同100张票
    出现了线程安全问题:卖出了重复的票和不存在的票
    解决线程安全问题的第二种方式:使用同步方法
    步骤:
        1.把访问了共享数据的代码,抽取出来,放到一个方法中
        2.给方法添加一个synchronized关键字,这个方法就是一个同步方法
    格式:
        修饰符 synchronized 返回值类型 方法名(参数列表){
            可能产生线程安全问题的代码(访问了共享数据的代码)
        }
    原理:
        使用一个同步方法把代码锁住,只让一个线程进入到方法执行卖票的代码

 */
public class RunnableImpl implements Runnable {
    //定义一个供3个线程共享的票源
    private static int ticket = 100;
    //线程任务:卖票==>票依次减少
    @Override
    public void run() {
        //System.out.println("this:"+this);
        //增加一个死循环:让线程重复卖票
        while (true){
            //调用同步方法
            //payTicket();
            //调用静态的同步方法
            payTicketStatic();
            if(ticket<=0){
                break;
            }
        }
    }

    /*
        了解
        定义一个静态同步方法,把访问了共享数据的代码,抽取到方法中
        问题:静态的同步方法的锁对象是谁? 是this吗? 不this:this是创建对象才有的
        静态方法优先于对象进入到内存中
        静态方法的锁对象是:本类的class文件对象 RunnableImpl.class==>唯一(反射)
     */
    public static /*synchronized*/ void payTicketStatic(){
        synchronized (RunnableImpl.class){
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
            }
        }
    }

    /*
        定义一个同步方法,把访问了共享数据的代码,抽取到方法中
        原理:也是使用一个锁对象,把代码锁住,只让一个线程进入到方法中执行
        同步方法使用的锁对象是谁? this==>创建的本类对象==>new RunnableImpl()
     */
    public synchronized void payTicket(){
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
        }
    }

    /*public  void payTicket(){
        synchronized (this){
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
            }
        }
    }*/
}
