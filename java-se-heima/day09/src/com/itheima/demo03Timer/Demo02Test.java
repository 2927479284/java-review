package com.itheima.demo03Timer;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
    使用定时器发送生日祝福
    操作步骤:
    1.定义一个只执行一次的定时器。
    2. 在定时器中指定任务，该任务用于向控制台发送祝福

    思考：如果每年都要给用户发送生日提醒，那么该怎么实现

 */
public class Demo02Test {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2022-3-27 11:53:10");
        //1.定义一个只执行一次的定时器。
        Timer timer = new Timer();
        /*timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("黑马程序员祝您生日快乐!");
            }
        },date);*/

        //思考：如果每年都要给用户发送生日提醒，那么该怎么实现
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("黑马程序员祝您生日快乐!");
            }
        },date,1000L*60*60*24*365);
    }
}
