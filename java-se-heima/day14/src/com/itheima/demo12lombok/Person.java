package com.itheima.demo12lombok;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private String sex;
    private int heigth;
}
