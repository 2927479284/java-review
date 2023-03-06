package com.itheima.demo07Test;

/*
    使用Book注解
 */
@Book(value = "斗罗大陆",authors = {"唐家三少"})
public class UserBook {
    @Book(value = "斗破苍穹",price = 88.8,authors = {"大土豆","小土豆"})
    private String name;
}
