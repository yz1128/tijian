package com.ncwu.tijiancmsserver.model;

public class Overallresult {
    /**
    * 总检结论项编号
    */
    private Integer orid;

    /**
    * 总检结论项标题
    */
    private String title;

    /**
    * 总检结论项内容
    */
    private String content;

    /**
    * 所属预约编号
    */
    private Integer orderid;

    public Integer getOrid() {
        return orid;
    }

    public void setOrid(Integer orid) {
        this.orid = orid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }
}