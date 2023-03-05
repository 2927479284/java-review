package com.itheima.demo03TCP;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 自写tcp服务端代码
 */
public class TCPServerDemo {


    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len  = 0;
        while ((len = inputStream.read(bytes))!=-1){
            System.out.println((new String(bytes,0,len)));
        }
        inputStream.close();
        socket.close();
    }
}
