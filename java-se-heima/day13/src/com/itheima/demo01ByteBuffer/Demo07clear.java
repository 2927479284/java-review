package com.itheima.demo01ByteBuffer;

import java.nio.ByteBuffer;
import java.util.Arrays;

/*
    还原-clear
    - public Buffer clear()：还原缓冲区的状态。
      - 将position设置为：0
      - 将限制limit设置为容量capacity；
 */
public class Demo07clear {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        System.out.println("创建完ByteBuffer==>位置:"+buffer.position()+",限制:"+buffer.limit());//创建完ByteBuffer==>位置:0,限制:10
        buffer.put((byte)10);
        buffer.put((byte)20);
        buffer.put((byte)30);
        buffer.limit(5);
        System.out.println("clear前==>位置:"+buffer.position()+",限制:"+buffer.limit());//clear前==>位置:3,限制:5
        buffer.clear();
        System.out.println("clear后==>位置:"+buffer.position()+",限制:"+buffer.limit());//clear后==>位置:0,限制:10
        System.out.println(Arrays.toString(buffer.array()));//[10, 20, 30, 0, 0, 0, 0, 0, 0, 0]
    }
}
