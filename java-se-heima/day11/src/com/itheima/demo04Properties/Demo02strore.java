package com.itheima.demo04Properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
    Properties集合中的方法store(了解-扩展)
    我们可以使用Properties集合中的方法store,把集合中的临时数据,持久化到硬盘的文件中存储(持久化:内存==>硬盘)
    void store(OutputStream out, String comments)
    void store(Writer writer, String comments)
    参数:
        OutputStream out:传递字节输出流,不能写中文(乱码)
        Writer writer:传递字符输出流,可以写中文
        String comments:注释,解释说明写的文件是干什么用的,不能写中文,会出现乱码,默认Unicode编码表
    使用步骤:
        1.创建Properties集合对象,往集合中存储一些键值对
        2.使用Properties集合中的方法store,把集合中的临时数据,持久化到硬盘的文件中存储
 */
public class Demo02strore {
    public static void main(String[] args) throws IOException {
        //1.创建Properties集合对象,往集合中存储一些键值对
        Properties prop = new Properties();
        prop.setProperty("liuyan","18");
        prop.setProperty("迪丽热巴","19");
        prop.setProperty("古力娜扎","20");
        prop.setProperty("赵丽颖","21");
        //2.使用Properties集合中的方法store,把集合中的临时数据,持久化到硬盘的文件中存储
        /*FileOutputStream fis = new FileOutputStream("day11\\prop1.txt");
        prop.store(fis,"save data");
        fis.close();*/
        //流对象只使用一次,可以使用匿名对象,使用完毕会自动释放资源
        prop.store(new FileOutputStream("day11\\prop1.txt"),"save data");
        prop.store(new FileWriter("day11\\prop2.txt"),"save data");
        //注意:后在工作中把保存键值对的文件叫配置文件,一般都是以.properties结尾
        prop.store(new FileWriter("day11\\prop.properties"),"save data");
    }
}
