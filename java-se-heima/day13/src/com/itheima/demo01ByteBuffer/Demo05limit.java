package com.itheima.demo01ByteBuffer;

import java.nio.ByteBuffer;

/*
    限制-limit
    - 限制：limit：表示如果设置“限制为某一个位置，那么此位置后的位置将不可用”。
    - 有两个相关方法：
      - public int limit()：获取此缓冲区的限制。
      - public Buffer limit(int newLimit)：设置此缓冲区的限制。
 */
public class Demo05limit {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        //限制:10(10和10以后的索引就不可以在使用了)
        System.out.println("容量:"+buffer.capacity()+",限制:"+buffer.limit());//容量:10,限制:10

        //修改ByteBuffer的限制为3(3和3以后的索引就不可以在使用了)
        buffer.limit(3);
        System.out.println("容量:"+buffer.capacity()+",限制:"+buffer.limit());//容量:10,限制:3
        buffer.put((byte)10);//index:0
        buffer.put((byte)20);//index:1
        buffer.put((byte)30);//index:2
        //buffer.put((byte)40);//index:3 BufferOverflowException:超出了缓冲区的限制
    }
}
