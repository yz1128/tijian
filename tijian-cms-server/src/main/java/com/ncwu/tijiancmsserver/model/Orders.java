package com.ncwu.tijiancmsserver.model;

import java.util.Date;

public class Orders {
    /**
    * 订单编号
    */
    private Integer orderid;

    /**
    * 预约日期
    */
    private Date orderdate;

    /**
    * 客户编号
    */
    private String userid;

    /**
    * 所属医院编号
    */
    private Integer hpid;

    /**
    * 所属套餐编号
    */
    private Integer smid;

    /**
    * 订单状态（1：未归档；2：已归档）
    */
    private Integer state;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getHpid() {
        return hpid;
    }

    public void setHpid(Integer hpid) {
        this.hpid = hpid;
    }

    public Integer getSmid() {
        return smid;
    }

    public void setSmid(Integer smid) {
        this.smid = smid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}