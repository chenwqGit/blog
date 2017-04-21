package com.blog.common.t01.pojo;

public class User {
    private Integer id;

    private String userName;

    private String password;

    private String userNo;

    private String userType;

    private String gender;

    private String phoneNo;

    private String email;

    private String pwdExpiration;

    private Integer pwdErrTime;

    private String enable;

    private String updateDt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo == null ? null : phoneNo.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPwdExpiration() {
        return pwdExpiration;
    }

    public void setPwdExpiration(String pwdExpiration) {
        this.pwdExpiration = pwdExpiration == null ? null : pwdExpiration.trim();
    }

    public Integer getPwdErrTime() {
        return pwdErrTime;
    }

    public void setPwdErrTime(Integer pwdErrTime) {
        this.pwdErrTime = pwdErrTime;
    }

    public String getEnable() {
        return enable;
    }

    public void setEnable(String enable) {
        this.enable = enable == null ? null : enable.trim();
    }

    public String getUpdateDt() {
        return updateDt;
    }

    public void setUpdateDt(String updateDt) {
        this.updateDt = updateDt == null ? null : updateDt.trim();
    }
}