package com.itheima.demo05BufferedStream;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

/*
    练习:文本排序
    需求:
        把出师表这篇文章按照(1,2,3,4,5...9)排序
    分析:
        1.创建ArrayList集合,泛型使用String
        2.创建BufferedReader对象,构造方法中传递FileReader
        3.创建BufferedWriter对象,构造方法中传递FileWriter
        4.使用BufferedReader对象中的方法readLine,以行的方式读取文件
        5.把读取到的每行文本,存储到ArrayList集合中
        6.使用Collections集合工具类中的方法sort,对元素进行排序
        7.遍历集合,获取每一行文本
        8.使用BufferedWriter对象中的方法write,把每行文本写入到内存缓冲区中
        9.使用BufferedWriter对象中的方法newLine,每写完一行文本之后,写一个换行
        10.释放资源(会先调用flush方法刷新数据)
 */
public class Demo07Test {
    public static void main(String[] args) throws IOException {
        //1.创建ArrayList集合,泛型使用String
        ArrayList<String> list = new ArrayList<>();
        //2.创建BufferedReader对象,构造方法中传递FileReader
        BufferedReader br = new BufferedReader(new FileReader("day11\\csblx.txt"));
        //3.创建BufferedWriter对象,构造方法中传递FileWriter
        BufferedWriter bw = new BufferedWriter(new FileWriter("day11\\csbzx.txt"));
        //4.使用BufferedReader对象中的方法readLine,以行的方式读取文件
        String line;
        while ((line=br.readLine())!=null){
            //5.把读取到的每行文本,存储到ArrayList集合中
            list.add(line);
        }
        //6.使用Collections集合工具类中的方法sort,对元素进行排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //按照字符串首字母升序排序
                //return o1.charAt(0)-o2.charAt(0);
                //按照字符串.前边的数字排序
                return Integer.parseInt(o1.split("\\.")[0])-Integer.parseInt(o2.split("\\.")[0]);
            }
        });
        //7.遍历集合,获取每一行文本
        for (String s : list) {
            //8.使用BufferedWriter对象中的方法write,把每行文本写入到内存缓冲区中
            bw.write(s);
            //9.使用BufferedWriter对象中的方法newLine,每写完一行文本之后,写一个换行
            bw.newLine();
        }
        //10.释放资源(会先调用flush方法刷新数据)
        bw.close();
        br.close();
    }
}
