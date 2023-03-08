package com.itheima.demo06parseXML;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/*
    使用dom4j解析xml文档
        获取xml文档中所有的元素,属性和文本
    解析步骤:一层一层解析
        1.导入dom4j的jar包
        2.创建dom4j核心类SAXReader对象
        3.使用SAXReader对象中的方法read,读取xml文档到内存中,生成Document对象
        4.使用Document对象中的方法getRootElement,获取根元素beans
        5.使用根元素Element对象中的方法elements,获取beans根元素下边所有的bean元素,存储到一个List集合中
        6.遍历List集合,获取每一个bean元素
        7.使用bean元素Element中的方法attributeValue,根据属性名获取属性值(id,className)
        8.使用bean元素Element中的方法elements,获取bean元素下边所有的property元素,存储到一个List集合中
        9.遍历List集合,获取每一个property元素
        10.使用property元素Element对象中的方法attributeValue,根据属性名获取属性值(name,value)
        11.使用property元素Element对象中的方法getText,获取标签中的文本(标签体)
   注意:
       使用dom4j解析xml文档,要求项目名称和路径,模块的名称不能有中文,空格等
 */
public class Demo01dom4j {
    public static void main(String[] args) throws DocumentException {
        //2.创建dom4j核心类SAXReader对象
        SAXReader sax = new SAXReader();
        //3.使用SAXReader对象中的方法read,读取xml文档到内存中,生成Document对象
        Document document = sax.read("day15\\bean.xml");
        //4.使用Document对象中的方法getRootElement,获取根元素beans
        Element rootElement = document.getRootElement();
        System.out.println(rootElement.getName());
        //5.使用根元素Element对象中的方法elements,获取beans根元素下边所有的bean元素,存储到一个List集合中
        List<Element> beanEleList = rootElement.elements();
        //6.遍历List集合,获取每一个bean元素
        for (Element beanELe : beanEleList) {
            System.out.println("\t"+beanELe.getName());
            //7.使用bean元素Element中的方法attributeValue,根据属性名获取属性值(id,className)
            String id = beanELe.attributeValue("id");
            String className = beanELe.attributeValue("className");
            System.out.println("\t\tbean元素的属性id="+id);
            System.out.println("\t\tbean元素的属性className="+className);
            //8.使用bean元素Element中的方法elements,获取bean元素下边所有的property元素,存储到一个List集合中
            List<Element> propEleList = beanELe.elements();
            //9.遍历List集合,获取每一个property元素
            for (Element propEle : propEleList) {
                System.out.println("\t\t\t"+propEle.getName());
                //10.使用property元素Element对象中的方法attributeValue,根据属性名获取属性值(name,value)
                String name = propEle.attributeValue("name");
                String value = propEle.attributeValue("value");
                System.out.println("\t\t\t\tproperty元素的属性name:"+name);
                System.out.println("\t\t\t\tproperty元素的属性value:"+value);
                //11.使用property元素Element对象中的方法getText,获取标签中的文本
                String text = propEle.getText();
                System.out.println("\t\t\t\tproperty元素的文本:"+text);
            }
        }
    }
}
