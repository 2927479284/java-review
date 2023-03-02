package com.itheima.demo03Timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
    定时器的使用
 */
public class Demo01Timer {
    public static void main(String[] args) throws ParseException {
        show04();
    }

    /*
        void schedule(TimerTask task, Date firstTime, long period) 安排指定的任务在指定的时间开始进行重复的固定延迟执行。
		参数:
			task - 所要安排的任务。定时器到时间之后要执行的任务
			time - 执行任务的时间。从什么日期开始执行任务
			period - 执行各后续任务之间的时间间隔，单位是毫秒。定时器开始执行之后,每隔多少毫秒重复执行
     */
    private static void show04() throws ParseException {
        //需求:创建一个反复执行的定时器,在2022年3月27日11:46:35第一次执行定时任务,之后每间隔3秒钟执行一次
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2022-03-27 11:46:40");
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("哈哈");
            }
        },date,3000);
    }

    /*
        void schedule(TimerTask task, Date time) 安排在指定的时间执行指定的任务,只会执行一次
		参数:
			task - 所要安排的任务。定时器到时间之后要执行的任务
			time - 执行任务的时间。从什么日期开始执行任务 2022年3月27日11:42:35
		注意:
		    设置的时间如果已经过了,那么任务就会直接执行
     */
    private static void show03() throws ParseException {
        //需求:创建一个执行一次的定时器,在2022年3月27日11:42:35执行定时任务
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2022-03-27 11:42:50");
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("哈哈");
                timer.cancel();//终止
            }
        },date);
    }

    /*
       void schedule(TimerTask task, long delay, long period)
		在指定的毫秒值之后,执行指定的任务,之后每隔固定的毫秒数重复执行定时任务
		参数:
			task - 所要安排的任务。定时器到时间之后要执行的任务
			delay - 执行任务前的延迟时间，单位是毫秒。 多个毫秒之后开始执行TimerTask任务
			period - 执行各后续任务之间的时间间隔，单位是毫秒。定时器开始执行之后,每隔多少毫秒重复执行
     */
    private static void show02() {
        //需求:创建一个反复执行的定时器,3秒钟之后第一次执行,之后每隔1秒钟执行一次(打印系统的时间和日期)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(sdf.format(new Date()));
            }
        },3000,1000);
    }

    /*
        void schedule(TimerTask task, long delay) 在指定的毫秒值之后,执行指定的任务,只会执行一次
		 参数:
			task - 所要安排的任务。定时器到时间之后要执行的任务
			delay - 执行任务前的延迟时间，单位是毫秒。 多个毫秒之后开始执行TimerTask任务
     */
    private static void show01() {
        //需求:创建一个执行一次的定时器,5秒钟之后执行定时任务
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("c4爆炸了!");
                timer.cancel();//在任务结束,取消定时器
            }
        },5000);

    }
}
