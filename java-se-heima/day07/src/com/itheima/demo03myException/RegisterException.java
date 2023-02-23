package com.itheima.demo03myException;

//自定义异常类是一个编译期异常
public class RegisterException extends Exception{
    public RegisterException() {
    }

    public RegisterException(String message) {
        super(message);
    }
}
