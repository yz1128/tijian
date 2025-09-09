package com.ncwu.tijiancmsserver.model;

import java.util.Date;

public class Users {
    /**
    * 用户编号（手机号码）
    */
    private String userid;

    /**
    * 密码
    */
    private String password;

    /**
    * 真实姓名
    */
    private String realname;

    /**
    * 用户性别（1：男；0女）
    */
    private Integer sex;

    /**
    * 身份证号
    */
    private String identitycard;

    /**
    * 出生日期
    */
    private Date birthday;

    /**
    * 用户类型（1：普通用户；2：东软内部员工；3：其他）
    */
    private Integer usertype;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getIdentitycard() {
        return identitycard;
    }

    public void setIdentitycard(String identitycard) {
        this.identitycard = identitycard;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }
}