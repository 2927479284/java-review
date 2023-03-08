package com.itheima.demo07Test;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/*
    定义一个工具类
    根据类的全类名(com.itheima.demo07Test.Cat),创建对象返回(new Cat==>反射)
 */
public class BeanFactory {
    /*
        定义一个静态方法,根据参数传递id,创建对象返回
        参数String id==>Animal
        返回值: Cat对象,Dog对象
     */
    public static Object getInstacne(String id)  {
        try {
            //使用xml解析技术,获取bean元素的className的属性值(全类名)
            SAXReader sax = new SAXReader();
            Document document = sax.read("day15\\inter.xml");
            Element beanEle = (Element) document.selectSingleNode("//bean[@id='"+id+"']");
            String className = beanEle.attributeValue("className");
            //使用反射技术,根据全类名,获取class文件对象
            Class clazz = Class.forName(className);
            //使用Class中的方法newInstance创建对象返回
            Object obj = clazz.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
