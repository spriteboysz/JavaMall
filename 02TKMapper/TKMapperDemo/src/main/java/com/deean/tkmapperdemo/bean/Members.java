package com.deean.tkmapperdemo.bean;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 表名：members
*/
@AllArgsConstructor
@NoArgsConstructor
public class Members {
    @Id
    @Column(name = "member_id")
    private Integer memberId;

    @Column(name = "member_nick")
    private String memberNick;

    @Column(name = "member_gender")
    private String memberGender;

    @Column(name = "member_age")
    private Integer memberAge;

    @Column(name = "member_city")
    private String memberCity;

    /**
     * @return memberId
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * @param memberId
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * @return memberNick
     */
    public String getMemberNick() {
        return memberNick;
    }

    /**
     * @param memberNick
     */
    public void setMemberNick(String memberNick) {
        this.memberNick = memberNick;
    }

    /**
     * @return memberGender
     */
    public String getMemberGender() {
        return memberGender;
    }

    /**
     * @param memberGender
     */
    public void setMemberGender(String memberGender) {
        this.memberGender = memberGender;
    }

    /**
     * @return memberAge
     */
    public Integer getMemberAge() {
        return memberAge;
    }

    /**
     * @param memberAge
     */
    public void setMemberAge(Integer memberAge) {
        this.memberAge = memberAge;
    }

    /**
     * @return memberCity
     */
    public String getMemberCity() {
        return memberCity;
    }

    /**
     * @param memberCity
     */
    public void setMemberCity(String memberCity) {
        this.memberCity = memberCity;
    }
}