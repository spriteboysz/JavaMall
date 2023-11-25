package com.deean.dnmall.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户
 * @TableName user
 */
@TableName(value ="user")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    /**
     * 主键id;用户id
     */
    @TableId(type = IdType.AUTO)
    private Integer userId;

    /**
     * 用户名;用户名
     */
    private String userName;

    /**
     * 密码;密码
     */
    private String userPassword;

    /**
     * 昵称;昵称
     */
    private String userNickName;

    /**
     * 真实姓名;真实姓名
     */
    private String userRealName;

    /**
     * 头像;头像
     */
    private String userImage;

    /**
     * 手机号;手机号
     */
    private String userMobile;

    /**
     * 邮箱地址;邮箱地址
     */
    private String userEmail;

    /**
     * 性别;M(男) or F(女)
     */
    private String userSex;

    /**
     * 生日;生日
     */
    private Date userBirth;

    /**
     * 注册时间;创建时间
     */
    private Date userCreateTime;

    /**
     * 更新时间;更新时间
     */
    private Date userUpdateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}