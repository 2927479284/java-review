package com.itheima.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/RegisterServlet1")
public class RegisterServlet1 extends HttpServlet {

    List<User> userList = new ArrayList<>();

    {
        userList.add(new User("jack", 17));
        userList.add(new User("lucy", 23));
        userList.add(new User("大熊", 67));
        userList.add(new User("二熊", 32));
    }

    // 接收请求
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.接收请求参数
        String username = request.getParameter("username");
        // 2.根据用户名去查数据库
        User user = find(username);
        // 3.将user—>json
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        // 4.将json返回给客户端
        // 4-1 指定响应体的数据类型，字符集
        response.setContentType("application/json;charset=utf-8");
        // 4-2 response响应
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