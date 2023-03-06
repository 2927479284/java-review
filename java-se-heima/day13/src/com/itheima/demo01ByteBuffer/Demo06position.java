package com.itheima.demo01ByteBuffer;

import java.nio.ByteBuffer;
import java.util.Arrays;

/*
    位置-position
    - 位置position是指：当前可写入的索引。位置不能小于0，并且不能大于"限制"。
    - 有两个相关方法：
      - public int position()：获取当前可写入位置索引。
      - public Buffer position(int p)：更改当前可写入位置索引。
 */
public class Demo06position {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        System.out.println(buffer.position());//0(当前可写入的索引)

        buffer.put((byte)10);//往position为0的索引添加数据
        buffer.put((byte)20);//往position为1的索引添加数据
        buffer.put((byte)30);//往position为2的索引添加数据
        System.out.println(buffer.position());//3(当前可写入的索引)
        System.out.println(Arrays.toString(buffer.array()));//[10, 20, 30, (p)0, 0, 0, 0, 0, 0, 0]

        //更改当前可以写入的索引位置为1
        buffer.position(1);
        System.out.println(Arrays.toString(buffer.array()));//[10, (p)20, 30, 0, 0, 0, 0, 0, 0, 0]
        buffer.put((byte)88);//往position为1的索引添加数据
        buffer.put((byte)99);//往position为2的索引添加数据
        System.out.println(Arrays.toString(buffer.array()));//[10, 88, 99, (p)0, 0, 0, 0, 0, 0, 0]
    }
}
