package com.ncwu.tijiancmsserver.model;

public class Checkitem {
    /**
    * 检查项编号
    */
    private Integer ciid;

    /**
    * 检查项名称
    */
    private String ciname;

    /**
    * 检查项内容
    */
    private String cicontent;

    /**
    * 检查项意义
    */
    private String meaning;

    /**
    * 备注
    */
    private String remarks;

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

    public String getCicontent() {
        return cicontent;
    }

    public void setCicontent(String cicontent) {
        this.cicontent = cicontent;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}