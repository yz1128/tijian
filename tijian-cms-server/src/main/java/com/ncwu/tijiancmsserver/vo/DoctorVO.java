package com.ncwu.tijiancmsserver.vo;

public class DoctorVO {
    /**
     * 医生编号
     */
    private Integer docId;

    /**
     * 医生编码
     */
    private String docCode;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 密码
     */
    private String passWord;

    /**
     * 性别
     */
    private Integer Sex;

    /**
     * 所属科室（1：检验科；2：内科；3：外科）
     */
    private Integer deptNo;

    public Integer getDocId() {
        return docId;
    }

    public void setDocId(Integer docId) {
        this.docId = docId;
    }

    public String getDocCode() {
        return docCode;
    }

    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getSex() {
        return Sex;
    }

    public void setSex(Integer sex) {
        Sex = sex;
    }

    public Integer getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Integer deptNo) {
        this.deptNo = deptNo;
    }
}
