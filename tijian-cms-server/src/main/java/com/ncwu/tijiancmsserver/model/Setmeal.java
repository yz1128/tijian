package com.ncwu.tijiancmsserver.model;

public class Setmeal {
    /**
    * 套餐编号
    */
    private Integer smid;

    /**
    * 套餐名称
    */
    private String name;

    /**
    * 套餐类型（1：男士餐套；0：女士套餐）
    */
    private Integer type;

    /**
    * 套餐价格
    */
    private Integer price;

    public Integer getSmid() {
        return smid;
    }

    public void setSmid(Integer smid) {
        this.smid = smid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}