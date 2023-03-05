package com.itheima.demo02InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
    java.net.InetAddress:此类表示互联网协议 (IP) 地址。
    获取对象的方式:使用静态方法
        static InetAddress getLocalHost() 返回本地主机。你自己计算机的ip地址
        static InetAddress getByName(String host) 在给定主机名的情况下确定主机的 IP 地址。
    成员方法:
        String getHostName()获取此 IP 地址的主机名。
        String getHostAddress() 返回 IP 地址字符串（以文本表现形式）。
 */
public class Demo01InetAddress {
    public static void main(String[] args) throws UnknownHostException {
        show02();
    }

    /*
        static InetAddress getByName(String host) 在给定主机名的情况下确定主机的 IP 地址。
        参数:
            String host:传递主机名称,ip地址,域名
     */
    private static void show02() throws UnknownHostException {
        //InetAddress inet = InetAddress.getByName("daofeng");
        //InetAddress inet = InetAddress.getByName("192.168.0.101");
        InetAddress inet = InetAddress.getByName("www.itheima.com");//www.itheima.com/47.95.137.221
        System.out.println(inet.getHostName());
        System.out.println(inet.getHostAddress());
        System.out.println(inet);//daofeng/192.168.0.101
    }

    /*
        static InetAddress getLocalHost() 返回本地主机。你自己计算机的ip地址
        UnknownHostException:未知主机异常
     */
    private static void show01() throws UnknownHostException {
        InetAddress inet = InetAddress.getLocalHost();
        System.out.println(inet);//daofeng/192.168.0.101  计算机名/计算机ip地址

        String hostName = inet.getHostName();
        System.out.println(hostName);//daofeng

        String hostAddress = inet.getHostAddress();
        System.out.println(hostAddress);//192.168.0.101
    }
}
