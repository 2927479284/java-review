package com.itheima.demo07payTicket;

/*
    卖票案例:创建3个线程,卖同100张票
 */
public class RunnableImpl implements Runnable {
    //定义一个供3个线程共享的票源
    private int ticket = 100;
    //线程任务:卖票==>票依次减少
    @Override
    public void run() {
        //增加一个死循环:让线程重复卖票
        while (true){
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
