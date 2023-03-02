package com.itheima.demo03Timer;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 自写定时器
 */
public class Demo03ZiXie {

    public static void main(String[] args) throws Exception{
        Timer timer = new Timer();

        //1.多少毫秒执行一次
/*        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("我成功执行");
                //timer.cancel();//如果只执行一次 记得关闭定时器
            }
        },3000);*/

        //2.指定时间执行一次
/*        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = simpleDateFormat.parse("2023-03-02 15:26:30");
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("我又被执行成功了");
                //timer.cancel();//如果只执行一次 记得关闭定时器
            }
        },parse);*/

        //3.指定多少毫秒执行一次&轮询多少毫秒执行
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("轮询执行");
            }
        },1000,1000);
    }
}
