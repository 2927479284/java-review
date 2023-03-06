package com.itheima.demo01ByteBuffer;

import java.nio.ByteBuffer;
import java.util.Arrays;

/*
    缩小范围-flip
    - public Buffer flip()：缩小limit的范围。 获取读取的有效数据0到position之间的数据
      - 将limit设置为当前position位置； [0, 1, 2, 0, 0, 0, 0, 0, 0, 0]  position=3 limit=10
      - 将当前position位置设置为0；   position=0 limit=3  new String(bytes,0,len)
 */
public class Demo08flip {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        buffer.put((byte)10);
        buffer.put((byte)20);
        buffer.put((byte)30);
        System.out.println("flip前==>位置:"+buffer.position()+",限制:"+buffer.limit());//flip前==>位置:3,限制:10
        buffer.flip();
        System.out.println("flip后==>位置:"+buffer.position()+",限制:"+buffer.limit());//flip后==>位置:0,限制:3
    }
}
