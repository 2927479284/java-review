package com.itheima.demo01ByteBuffer;

import java.nio.ByteBuffer;

/*
    获取-get
    - byte get(int index): 获取缓冲区中指定索引处的元素
 */
public class Demo03get {
    public static void main(String[] args) {
        //创建一个包含指定元素的ByteBuffer
        byte[] bytes = {65,66,67,68,69};
        ByteBuffer buffer = ByteBuffer.wrap(bytes);
        byte b1 = buffer.get(0);
        System.out.println("b1:"+b1);//b1:65
        System.out.println(buffer.get(1));//66
        //System.out.println(buffer.get(5));//IndexOutOfBoundsException
    }
}
