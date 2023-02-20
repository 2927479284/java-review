package com.itheima.demo06Test;

/*
    定义一个描述身份证的类
 */
public class IDCard {
    //身份证号
    private String idNum;
    //身份证签发地
    private String authority;

    public IDCard() {
    }

    public IDCard(String idNum, String authority) {
        this.idNum = idNum;
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "IDCard{" +
                "idNum='" + idNum + '\'' +
                ", authority='" + authority + '\'' +
                '}';
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
