package com.itheima.demo02Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    关闭和刷新的区别(面试)
    - flush:把内存缓冲区中的数据刷新到文件中,刷新完之后,流对象可以继续使用
    - close:释放资源,在释放资源之前,把内存缓冲区中的数据刷新到文件中
        刷新完之后,流对象就已经关闭了,就不能在使用了
    问题:
        3.txt文件中有什么?  大家好
 */
public class Demo02flushAndclose {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day11\\3.txt");
        fw.write('大');
        fw.flush();
        fw.write('家');
        fw.flush();
        fw.write('好');
        fw.close();
        //fw.write('!');//IOException: Stream closed 流已经关闭了,就不能在使用了
    }
}
