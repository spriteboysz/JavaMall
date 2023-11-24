package com.deean.tkmapperdemo.bean;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 表名：users
*/
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "user_realname")
    private String userRealname;

    @Column(name = "user_gender")
    private String userGender;

    @Column(name = "user_tel")
    private String userTel;

    @Column(name = "user_desc")
    private String userDesc;

    /**
     * @return userId
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return userPassword
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * @param userPassword
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * @return userRealname
     */
    public String getUserRealname() {
        return userRealname;
    }

    /**
     * @param userRealname
     */
    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname;
    }

    /**
     * @return userGender
     */
    public String getUserGender() {
        return userGender;
    }

    /**
     * @param userGender
     */
    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    /**
     * @return userTel
     */
    public String getUserTel() {
        return userTel;
    }

    /**
     * @param userTel
     */
    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    /**
     * @return userDesc
     */
    public String getUserDesc() {
        return userDesc;
    }

    /**
     * @param userDesc
     */
    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }
}