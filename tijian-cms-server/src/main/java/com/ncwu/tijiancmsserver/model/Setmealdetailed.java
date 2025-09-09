package com.ncwu.tijiancmsserver.model;

public class Setmealdetailed {
    /**
    * 套餐明细编号（无意义主键）
    */
    private Integer sdid;

    /**
    * 套餐编号
    */
    private Integer smid;

    /**
    * 检查项编号
    */
    private Integer ciid;

    public Integer getSdid() {
        return sdid;
    }

    public void setSdid(Integer sdid) {
        this.sdid = sdid;
    }

    public Integer getSmid() {
        return smid;
    }

    public void setSmid(Integer smid) {
        this.smid = smid;
    }

    public Integer getCiid() {
        return ciid;
    }

    public void setCiid(Integer ciid) {
        this.ciid = ciid;
    }
}