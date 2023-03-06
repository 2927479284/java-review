package com.itheima.demo07BSTCP;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * B/S底层原理.通过ServerSocket完成
 */
public class TCPServerDemo01Test {

    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true){
            Socket socket = serverSocket.accept();
            new Thread(()->{
                try {
                    InputStream inputStream = socket.getInputStream();
                    OutputStream outputStream = socket.getOutputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    String path = bufferedReader.readLine();//GET /day12/web/index.html HTTP/1.1
                    String[] s = path.split(" ");
                    String substring = s[1].substring(1);// day12/web/index.html
                    //C:\Users\Administrator.DESKTOP-31RFSET\Desktop\java-review\java-se-heima\day12\web\index.html
                    FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Administrator.DESKTOP-31RFSET\\Desktop\\java-review\\java-se-heima\\"+substring);
                    //增加以下三行代码的目的:告之客户端浏览器,写回的是html类型的文件,让客户端以网页的形式显示文件,而不是文本
                    outputStream.write("HTTP/1.1 200 OK\r\n".getBytes());
                    outputStream.write("Content-Type:text/html\r\n".getBytes());
                    outputStream.write("\r\n".getBytes());
                    byte[] bytes = new byte[1024];
                    int len = 0;
                    while ((len = fileInputStream.read()) != -1){
                        outputStream.write(bytes,0,len);
                    }
                    socket.close();
                    inputStream.close();
                    outputStream.close();
                    fileInputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }).start();

        }
    }
}
