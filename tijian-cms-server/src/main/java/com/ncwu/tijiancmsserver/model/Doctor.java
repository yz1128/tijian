package com.ncwu.tijiancmsserver.model;

public class Doctor {
    /**
    * 医生编号
    */
    private Integer docid;

    /**
    * 医生编码
    */
    private String doccode;

    /**
    * 真实姓名
    */
    private String realname;

    /**
    * 密码
    */
    private String password;

    /**
    * 性别
    */
    private Integer sex;

    /**
    * 所属科室（1：检验科；2：内科；3：外科）
    */
    private Integer deptno;

    public Integer getDocid() {
        return docid;
    }

    public void setDocid(Integer docid) {
        this.docid = docid;
    }

    public String getDoccode() {
        return doccode;
    }

    public void setDoccode(String doccode) {
        this.doccode = doccode;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }
}