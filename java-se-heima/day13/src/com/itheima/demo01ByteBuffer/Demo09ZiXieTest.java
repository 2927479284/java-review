package com.itheima.demo01ByteBuffer;


import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * Buffer 自写测试
 */
public class Demo09ZiXieTest {

    public static void main(String[] args) throws Exception{
        ByteBuffer allocate = ByteBuffer.allocate(10);
        byte[] array = allocate.array();
        allocate.put((byte) 100);
        System.out.println(Arrays.toString(array));
    }
}
