package com.itheima.demo04Properties;

import java.util.Properties;
import java.util.Set;

/*
    java.util.Properties集合 extends Hashtable<k,v>集合 implements Map<k,v>接口
    1.Properties 类表示了一个持久的属性集。Properties 可保存在流中或从流中加载。
        Properties集合是一个和IO流相结合的集合
        我们可以使用Properties集合中的方法store,把集合中的临时数据,持久化到硬盘的文件中存储(持久化:内存==>硬盘)
        我们可以使用Properties集合中的方法load,把硬盘文件中保存的键值对,在读取到内存中的集合里边使用(硬盘==>内存)
    2.属性列表中每个键及其对应值都是一个字符串。
        Properties集合是一个双列集合,键和值默认都是String类型,不需要写泛型
 */
public class Demo01Properties {
    public static void main(String[] args) {
        /*
            集合的重点:会使用Properties集合存储数据,会遍历Properties集合把数据取出来
            Properties集合健和值默认都是String类型,有一些和String相关的特有方法
                Object setProperty(String key, String value) 往Properties集合中添加键值对,相当于Map集合的put方法
                String getProperty(String key) 根据key获取value值,相当于Map集合的get方法
                Set<String> stringPropertyNames() 返回此属性列表中的键集,相当于Map集合的keySet方法
         */
        //创建Properties集合对象
        Properties prop = new Properties();
        //使用setProperty往Properties集合中添加键值对
        prop.setProperty("柳岩","18");
        prop.setProperty("迪丽热巴","19");
        prop.setProperty("古力娜扎","20");
        prop.setProperty("赵丽颖","21");
        //使用stringPropertyNames方法取出Properties集合中所有key,存储到一个Set集合中返回
        Set<String> set = prop.stringPropertyNames();
        //遍历Set集合,获取Properties集合的每一个key
        for (String key : set) {
            //使用getProperty方法,根据key获取value
            String value = prop.getProperty(key);
            System.out.println(key+"="+value);
        }
    }
}
