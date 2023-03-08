package com.itheima.demo06parseXML;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.util.List;

/*
    使用xpath和dom4j快速定位解析xml文件(重点)
    注意:
        xpath是基于dom4的基础之上开发的
        想要使用xpath,必须同时引入xpath和dom4j的jar包
    实现步骤:
        1.导入xpath和dom4j的jar包
        2.创建dom4j核心类SAXReader对象
        3.使用SAXReader对象中的方法read,读取xml文档到内存中,生成Document对象
        4.使用Document对象中的方法selectNodes|selectSingleNode解析xml文档
             List<Element> selectNodes("xpath表达式") 获取符合xpath表达式的多个元素,存储List集合中
             Node selectSingleNode("xpath表达式")获取符合xpath表达式的唯一元素
   -----------------------------------------------------------------------------------
   xpath表达式常用查询形式
        - 第一种查询形式
              //*: 所有元素
        - 第二种查询形式
              //BBB： 表示和这个名称相同，表示只要名称是BBB 都得到
              //bean:获取xml文档中所有bean元素
              //property:获取xml文档中所有property元素
        - 第三种查询形式
              /AAA/DDD/BBB： 表示一层一层的，AAA下面 DDD下面的BBB
              /beans/bean/property:一层一层的查找获取
        - 第四种查询形式
              //BBB[1]：表示第一个BBB元素 //bean[1]
              //BBB[2]：表示第二个BBB元素 //bean[2]
              ...
              //BBB[last()]：表示最后一个BBB元素 //bean[last()]
        - 第五种查询形式
              //BBB[@id]： 表示只要BBB元素上面有id属性 都得到
              //bean[@className]： 表示只要bean元素上面有className属性 都得到
        - 第六种查询形式
              //BBB[@id='001'] 表示元素名称是BBB,在BBB上面有id属性，并且id的属性值是001
              //bean[@id='001'] 表示元素名称是bean,在bean上面有id属性，并且id的属性值是001
 */
public class Demo02xpath {
    public static void main(String[] args) throws DocumentException {
        //2.创建dom4j核心类SAXReader对象
        SAXReader sax = new SAXReader();
        //3.使用SAXReader对象中的方法read,读取xml文档到内存中,生成Document对象
        Document document = sax.read("day15\\beans.xml");//路径就是io流相对路径
        //4.使用Document对象中的方法selectNodes|selectSingleNode解析xml文档
        //获取xml文档中的所有元素
        List<Element> list01 = document.selectNodes("//*");
        for (Element ele : list01) {
            System.out.println(ele.getName());
        }
        System.out.println("----------------------------");
        //获取xml文档中所有bean元素(包含儿子和孙子)
        List<Element> list02 = document.selectNodes("//bean");
        for (Element ele : list02) {
            System.out.println(ele.getName()+"\t"+ele.attributeValue("id"));
        }
        System.out.println("----------------------------");
        //获取beans下边所有的bean(只有儿子,没有孙子)
        List<Element> list03 = document.selectNodes("/beans/bean");
        for (Element ele : list03) {
            System.out.println(ele.getName()+"\t"+ele.attributeValue("id"));
        }
        System.out.println("----------------------------");
        //获取beans下边所有的bean中的所有property
        List<Element> list04 = document.selectNodes("/beans/bean/property");
        for (Element ele : list04) {
            System.out.println(ele.getName()+"\t"+ele.attributeValue("value"));
        }
        System.out.println("----------------------------");
        //获取所有bean中的第一个bean
        Element bean01 = (Element) document.selectSingleNode("//bean[1]");
        System.out.println(bean01.getName()+"\t"+bean01.attributeValue("id"));
        //获取所有bean中的第二个bean
        Element bean02 = (Element) document.selectSingleNode("//bean[2]");
        System.out.println(bean02.getName()+"\t"+bean02.attributeValue("id"));
        //获取所有bean中的最后一个bean
        Element beanlast = (Element) document.selectSingleNode("//bean[last()]");
        System.out.println(beanlast.getName()+"\t"+beanlast.attributeValue("id"));
        System.out.println("----------------------------");
        //获取所有bean中包含className属性的
        List<Element> list05 = document.selectNodes("//bean[@className]");
        for (Element ele : list05) {
            System.out.println(ele.getName()+"\t"+ele.attributeValue("id"));
        }
        System.out.println("----------------------------");
        //获取元素名称是bean,在bean上面有id属性，并且id的属性值是001
        Element bean001 = (Element) document.selectSingleNode("//bean[@id='001']");
        System.out.println(bean001.getName()+"\t"+bean001.attributeValue("id"));
        //获取元素名称是bean,在bean上面有className属性的,并且className的属性值是"cn.itcast.demo.Student"
        Element beanStudent = (Element) document.selectSingleNode("//bean[@className='cn.itcast.demo.Student']");
        System.out.println(beanStudent.getName()+"\t"+beanStudent.attributeValue("className"));
    }
}
