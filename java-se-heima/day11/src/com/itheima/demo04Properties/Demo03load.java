package com.itheima.demo04Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
    Properties集合中的方法load(重点)
    我们可以使用Properties集合中的方法load,把硬盘文件中保存的键值对,在读取到内存中的集合里边使用(硬盘==>内存)
    void load(InputStream inStream) 参数传递字节输入流,不能读取含有中文的文件
    void load(Reader reader) 参数传递字符输入流,可以读取含有中文的文件
    使用步骤:
        1.创建Properties集合对象
        2.使用Properties集合中的方法load,把硬盘文件中保存的键值对,在读取到内存中的集合里边使用
        3.打印集合,查看结果
    注意:
        在存储键值对的配置文件中,可以使用#作为注释,被注释的键值对不会被读取
        在存储键值对的配置文件中,键与值中间可以使用=,空格等一些符号作为分隔符号
        在存储键值对的配置文件中,键与值默认都是String类型,不需要添加引号,会画蛇添足
 */
public class Demo03load {
    public static void main(String[] args) throws IOException {
        //1.创建Properties集合对象
        Properties prop = new Properties();
        //2.使用Properties集合中的方法load,把硬盘文件中保存的键值对,在读取到内存中的集合里边使用
        //prop.load(new FileInputStream("day11\\prop.properties"));
        prop.load(new FileReader("day11\\prop.properties"));
        //3.打印集合,查看结果
        System.out.println(prop);
    }
}
