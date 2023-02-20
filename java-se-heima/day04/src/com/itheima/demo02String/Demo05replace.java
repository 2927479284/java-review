package com.itheima.demo02String;

/*
    replace:替换
    target:目标
    replacement:新字符串
    7.String replace(String target, String replacement)  把大的字符串中所有的目标字符串,替换为新的字符串
	"abc你好abc我好abc大家好":把字符串中的"abc"替换为"@_@"==>"@_@你好@_@我好@_@大家好
	目标字符串:String target==>abc
	替换的新字符串:tring replacement==>@_@
 */
public class Demo05replace {
    public static void main(String[] args) {
        String s1 = "abc你好abc我好abc大家好";
        //需求:把字符串中的"abc"替换为"@_@"
        String s2 = s1.replace("abc", "@_@");
        System.out.println("原字符串:"+s1);
        System.out.println("新字符串:"+s2);
    }
}
