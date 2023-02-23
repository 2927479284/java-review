package com.itheima.demo04Exception;

//自定义异常类是一个运行期异常
public class RegisterException extends RuntimeException{
    public RegisterException() {
    }

    public RegisterException(String message) {
        super(message);
    }
}
