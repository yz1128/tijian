package com.ncwu.tijiancmsserver.model;

public class Checkitemdetailed {
    /**
    * 检查项明细编号
    */
    private Integer cdid;

    /**
    * 检查项细明名称
    */
    private String name;

    /**
    * 检查项明细单位
    */
    private String unit;

    /**
    * 检查项细明正常值范围中的最小值
    */
    private Double minrange;

    /**
    * 检查项细明正常值范围中的最大值
    */
    private Double maxrange;

    /**
    * 检查项细明正常值（非数字型）
    */
    private String normalvalue;

    /**
    * 检查项验证范围说明文字
    */
    private String normalvaluestring;

    /**
    * 检查项明细类型（1：数值围范验证型；2：数值相等验证型；3：无需验证型；4：描述型；5：其它）
    */
    private Integer type;

    /**
    * 所属检查项编号
    */
    private Integer ciid;

    /**
    * 备注
    */
    private String remarks;

    public Integer getCdid() {
        return cdid;
    }

    public void setCdid(Integer cdid) {
        this.cdid = cdid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getMinrange() {
        return minrange;
    }

    public void setMinrange(Double minrange) {
        this.minrange = minrange;
    }

    public Double getMaxrange() {
        return maxrange;
    }

    public void setMaxrange(Double maxrange) {
        this.maxrange = maxrange;
    }

    public String getNormalvalue() {
        return normalvalue;
    }

    public void setNormalvalue(String normalvalue) {
        this.normalvalue = normalvalue;
    }

    public String getNormalvaluestring() {
        return normalvaluestring;
    }

    public void setNormalvaluestring(String normalvaluestring) {
        this.normalvaluestring = normalvaluestring;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCiid() {
        return ciid;
    }

    public void setCiid(Integer ciid) {
        this.ciid = ciid;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}