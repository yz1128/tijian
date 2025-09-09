package com.ncwu.tijiancmsserver.model;

public class Hospital {
    /**
    * 医院编号
    */
    private Integer hpid;

    /**
    * 医院名称
    */
    private String name;

    /**
    * 医院图片
    */
    private String picture;

    /**
    * 医院电话
    */
    private String telephone;

    /**
    * 医院地址
    */
    private String address;

    /**
    * 营业时间
    */
    private String businesshours;

    /**
    * 采血截止时间
    */
    private String deadline;

    /**
    * 预约人数规则
    */
    private String rule;

    /**
    * 医院状态（1：正常；2：其他）
    */
    private Integer state;

    public Integer getHpid() {
        return hpid;
    }

    public void setHpid(Integer hpid) {
        this.hpid = hpid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBusinesshours() {
        return businesshours;
    }

    public void setBusinesshours(String businesshours) {
        this.businesshours = businesshours;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}