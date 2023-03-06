package com.itheima.demo01ByteBuffer;

import java.nio.ByteBuffer;

/*
    容量-capacity
    - Buffer的容量(capacity)是指：Buffer所能够包含的元素的最大数量。
      定义了Buffer后，容量是不可变的(底层是一个数组)。
      int capacity() 返回此缓冲区的容量。
 */
public class Demo04capacity {
    public static void main(String[] args) {
        ByteBuffer b1 = ByteBuffer.allocate(20);
        System.out.println(b1.capacity());//20(容量:底层数组长度)

        ByteBuffer b2 = ByteBuffer.wrap("hello".getBytes());
        System.out.println(b2.capacity());//5(容量:底层数组长度)
    }
}
