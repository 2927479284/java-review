package com.itheima.demo14LinkedHashSet;

import java.util.Collection;
import java.util.LinkedHashSet;

public class demo01 {

    public static void main(String[] args) {

        Collection strings = new LinkedHashSet<>();
        strings.add("ss");
        boolean ss = strings.remove("ss");
        System.out.println(strings);
    }
}
