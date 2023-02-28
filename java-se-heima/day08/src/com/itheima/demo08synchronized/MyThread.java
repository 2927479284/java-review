package com.itheima.demo08synchronized;

public class MyThread extends Thread {
    //定义一个供3个线程共享的票源
    private static int ticket = 100;
    //继承的方式,锁对象必须是静态的,保证唯一
    private static Student stu = new Student();
    //线程任务:卖票==>票依次减少
    @Override
    public void run() {
        //增加一个死循环:让线程重复卖票
        while (true){
            synchronized (stu){
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
