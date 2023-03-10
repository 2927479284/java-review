package com.itheima.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.domain.User;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/RegisterServlet2")
public class RegisterServlet2 extends HttpServlet {

    List<User> userList = new ArrayList<>();

    {
        userList.add(new User("jack", 17));
        userList.add(new User("lucy", 23));
        userList.add(new User("大熊", 67));
        userList.add(new User("二熊", 32));
    }

    // 接收post请求 ，前端在请求体中：{username: "jack"}
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.接收json参数
        // 1-1 获取请求体的io流
        ServletInputStream inputStream = request.getInputStream();
        // 1-2 创建jackson工具
        ObjectMapper objectMapper = new ObjectMapper();
        // 1-3 json-> user(map)
        User param = objectMapper.readValue(inputStream, User.class);
        System.out.println(param);
        // 2.查询数据库
        User user = find(param.getUsername());
        // 3.返回
        // 3-1 将返回user -> json
        String json = objectMapper.writeValueAsString(user);
        // 3-2 指定响应体数据类型和字符集
        response.setContentType("application/json;charset=utf-8");
        // 3-3 response响应到客户端
        response.getWriter().write(json);

    }

    User find(String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}