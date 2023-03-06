package com.itheima.demo01ByteBuffer;

import java.nio.ByteBuffer;
import java.util.Arrays;

/*
    向ByteBuffer添加数据
    - public ByteBuffer put(byte b)：向当前可用位置添加数据。
    - public ByteBuffer put(byte[] byteArray)：向当前可用位置添加一个byte[]数组
    - public ByteBuffer put(byte[] byteArray,int offset,int len)：添加一个byte[]数组的一部分
    - byte[] array()获取此缓冲区的 byte 数组
 */
public class Demo02put {
    public static void main(String[] args) {
        //创建一个长度为10的ByteBuffer对象
        ByteBuffer buffer = ByteBuffer.allocate(10);
        //使用array方法取出ByteBuffer内部的数组
        byte[] arr = buffer.array();
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        //public ByteBuffer put(byte b)：向当前可用位置添加数据(字节)。
        buffer.put((byte)10);
        buffer.put((byte)20);
        buffer.put((byte)30);
        System.out.println(Arrays.toString(buffer.array()));//[10, 20, 30, 0, 0, 0, 0, 0, 0, 0]

        //public ByteBuffer put(byte[] byteArray)：向当前可用位置添加一个byte[]数组
        byte[] bytes = {21,22,23,24};
        buffer.put(bytes);
        System.out.println(Arrays.toString(buffer.array()));//[10, 20, 30, 21, 22, 23, 24, 0, 0, 0]

        /*
            public ByteBuffer put(byte[] byteArray,int offset,int len)：添加一个byte[]数组的一部分
            int offset:数组的开始索引
            int len:添加个数
         */
        buffer.put(bytes,2,2);
        System.out.println(Arrays.toString(buffer.array()));//[10, 20, 30, 21, 22, 23, 24, 23, 24, 0]
        buffer.put((byte)10);
        System.out.println(Arrays.toString(buffer.array()));//[10, 20, 30, 21, 22, 23, 24, 23, 24, 10]
        //buffer.put((byte)88);//BufferOverflowException:超出了缓冲区的范围
    }
}
