package com.itheima.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.domain.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JacksonTest {


    // java to  json
    @Test
    public void test01()throws Exception{
        // 创建json转换工具
        ObjectMapper objectMapper = new ObjectMapper();

        // 对象
        User user = new User("jack", 18);
        String json = objectMapper.writeValueAsString(user);
        System.out.println(json); // {"username":"jack","age":18}

        // map
        Map map = new HashMap();
        map.put("username", "lucy");
        map.put("age", 23);
        String json2 = objectMapper.writeValueAsString(map);
        System.out.println(json2); //  {"username":"lucy","age":23}

        // list
        List<User> list = new ArrayList<>();
        list.add(new User("安其拉", 11));
        list.add(new User("王昭君", 21));
        list.add(new User("庄周", 27));
        String json3 = objectMapper.writeValueAsString(list);
        System.out.println(json3); // [{"username":"安其拉","age":11},{},{}]
    }


    // json to java
    @Test
    public void test02()throws Exception{
        // 创建jackson工具类
        ObjectMapper objectMapper = new ObjectMapper();

        // 对象json -> user
        String json  ="{\"username\":\"jack\",\"age\":18}";
        User user = objectMapper.readValue(json, User.class);
        System.out.println(user);

        // map集合json -> map
        String json2 = "{\"username\":\"lucy\",\"age\":23}";
        Map map = objectMapper.readValue(json2, Map.class);
        System.out.println(map);

        // list集合json -> list
        String json3 = "[{\"username\":\"安其拉\",\"age\":11},{\"username\":\"王昭君\",\"age\":21},{\"username\":\"庄周\",\"age\":27}]";
        List list = objectMapper.readValue(json3, List.class);
        System.out.println(list);

    }
}
