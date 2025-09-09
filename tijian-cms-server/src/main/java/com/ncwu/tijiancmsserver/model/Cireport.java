package com.ncwu.tijiancmsserver.model;

public class Cireport {
    /**
    * 检查项报告主键
    */
    private Integer cirid;

    /**
    * 检查项编号
    */
    private Integer ciid;

    /**
    * 检查项名称
    */
    private String ciname;

    /**
    * 所属预约编号
    */
    private Integer orderid;

    public Integer getCirid() {
        return cirid;
    }

    public void setCirid(Integer cirid) {
        this.cirid = cirid;
    }

    public Integer getCiid() {
        return ciid;
    }

    public void setCiid(Integer ciid) {
        this.ciid = ciid;
    }

    public String getCiname() {
        return ciname;
    }

    public void setCiname(String ciname) {
        this.ciname = ciname;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }
}