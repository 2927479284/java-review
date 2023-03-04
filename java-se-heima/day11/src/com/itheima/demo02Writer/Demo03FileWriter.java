package com.itheima.demo02Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    字符输出流写数据的其他方法(重点)
    public void write(int c) ：写出一个字符。
	public void write(char[] cbuf) ：写字符数组中的所有字符
	public abstract void write(char[] b, int off, int len) ：写字符数组中的一部分字符 off:开始索引 len:写的个数
	public void write(String str) ：写出一个字符串
	public void write(String str, int off, int len) 写入字符串的一部分off:开始索引 len:写的个数
 */
public class Demo03FileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day11\\4.txt");
        //public void write(int c) ：写出一个字符。
        fw.write('a');//a

        //public void write(char[] cbuf) ：写字符数组中的所有字符
        char[] chars = {'你','好','@','$','1','2','A','B'};
        fw.write(chars);//你好@$12AB

        //public abstract void write(char[] b, int off, int len) ：写字符数组中的一部分字符 off:开始索引 len:写的个数
        //需求:写入字符数组中'1'和'2'这两个字符
        fw.write(chars,4,2);//12

        //public void write(String str) ：写出一个字符串
        fw.write("你若安好,便是晴天!");//你若安好,便是晴天!

        //public void write(String str, int off, int len) 写入字符串的一部分off:开始索引 len:写的个数
        //需求:写入字符中的"安好"
        fw.write("你若,便是晴天!",2,2);//安好

        fw.close();
    }
}
