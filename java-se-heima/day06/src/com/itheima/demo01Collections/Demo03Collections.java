package com.itheima.demo01Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo03Collections {
    public static void main(String[] args) {
        ArrayList<String> list02 = new ArrayList<>();
        list02.add("aa");
        list02.add("AA");
        list02.add("AD");
        list02.add("bb");
        list02.add("12");
        list02.add("ab");
        Collections.sort(list02, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //先按照字符串的第一个字符进行降序排序
                int a =  o2.charAt(0)-o1.charAt(0);//'a'-'A'==>97-65
                if(a==0){
                    //首字母相等,在按照第二个字母降序排序
                    a = o2.charAt(1)-o1.charAt(1);
                }
                return a;
            }
        });
        System.out.println(list02);//[bb, ab, aa, AD, AA, 12]

        Collections.sort(list02, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                /*
                    String类成员方法:
                        int compareTo(String anotherString)
                            按字典(编码表)顺序比较两个字符串。
                 */
                //字符串降序排序
                return o2.compareTo(o1);
            }
        });
        System.out.println(list02);//[bb, ab, aa, AD, AA, 12]

        Collections.sort(list02, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //字符串升序
                return o1.compareTo(o2);
            }
        });
        System.out.println(list02);//[12, AA, AD, aa, ab, bb]

        System.out.println("--------------------------自写测试[字符串排序]--------------------------------------");
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("d");
        strings.add("s");
        strings.add("q");
        strings.add("w");
        strings.add("e");
        strings.add("z");
        strings.add("g");
        strings.add("j");
        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);//o1比o2 降序 反之降序
            }
        });
        System.out.println(strings);
    }
}
