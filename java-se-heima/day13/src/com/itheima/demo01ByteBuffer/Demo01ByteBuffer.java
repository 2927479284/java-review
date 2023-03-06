package com.itheima.demo01ByteBuffer;

import java.nio.ByteBuffer;
import java.util.Arrays;

/*
    创建ByteBuffer
    - 没有构造方法可以创建ByteBuffer，可以通过它的一些“静态方法”获取ByteBuffer对象。
    - 常用三个静态方法：   new byte[10];  默认值 0,0,0...0
      - public static ByteBuffer allocate(int  capacity)：使用一个“容量”来创建一个“间接字节缓存区”——程序的“堆”空间中创建。
      - public static ByteBuffer allocateDirect(int capacity)：使用一个“容量”来创建一个“直接字节缓存区”——系统内存。   {1,2,3,4,5}
      - public static ByteBuffer wrap(byte[] byteArray)：使用一个“byte[]数组”创建一个“间接字节缓存区”。
 */
public class Demo01ByteBuffer {
    public static void main(String[] args) {
        ByteBuffer buffer1 = ByteBuffer.allocate(10);//包含byte数组[0,0,0,..0]==>间接字节缓冲区(堆)
        System.out.println(buffer1);//java.nio.HeapByteBuffer[pos=0 lim=10 cap=10]

        ByteBuffer buffer2 = ByteBuffer.allocateDirect(10);//包含byte数组[0,0,0,..0]==>直接字节缓冲区(系统)
        System.out.println(buffer2);//java.nio.DirectByteBuffer[pos=0 lim=10 cap=10]

        byte[] bytes = "你好".getBytes();
        System.out.println(Arrays.toString(bytes));//[-28, -67, -96, -27, -91, -67]
        ByteBuffer buffer3 = ByteBuffer.wrap(bytes);//包含byte数组[-28, -67, -96, -27, -91, -67]==>间接字节缓冲区(堆)
        System.out.println(buffer3);//java.nio.HeapByteBuffer[pos=0 lim=6 cap=6]
    }
}
