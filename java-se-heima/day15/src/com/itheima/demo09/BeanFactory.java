package com.itheima.demo09;


import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

/**
 * 类工厂
 */
public class BeanFactory {

    public static Object beanFactory (String id) throws Exception{
        SAXReader saxReader = new SAXReader();
        Document read = saxReader.read("C:\\Users\\Administrator.DESKTOP-31RFSET\\Desktop\\java-review\\java-se-heima\\day15\\inter1.xml");
        Element node = (Element) read.selectSingleNode("//bean[@id='"+id+"']");
        String className = node.attributeValue("className");
        Class<?> aClass = Class.forName(className);
        Object o = aClass.newInstance();
        return o;
    }
}
