package com.itheima.demo08Annotation;

/*
    使用Book注解
 */
//@Book(value = "斗罗大陆",authors = {"唐家三少"})
public class UserBook {
    //@Book(value = "斗破苍穹",price = 88.8,authors = {"大土豆","小土豆"})
    private String name;

    @Book(value = "斗罗大陆",authors = {"唐家三少"})
    public UserBook(String name) {
        this.name = name;
    }

    @Book(value = "斗罗大陆",authors = {"唐家三少"})
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
