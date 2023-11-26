package com.deean.dnmall.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 用户地址
 * @TableName user_address
 */
@TableName(value ="user_address")
@Data
public class UserAddress implements Serializable {
    /**
     * 地址主键id
     */
    @TableId(type = IdType.AUTO)
    private Integer addrId;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 收件人姓名
     */
    private String addrReceiverName;

    /**
     * 收件人手机号
     */
    private String addrReceiverMobile;

    /**
     * 省份
     */
    private String addrProvince;

    /**
     * 城市
     */
    private String addrCity;

    /**
     * 区县
     */
    private String addrArea;

    /**
     * 详细地址
     */
    private String addrDetail;

    /**
     * 邮编
     */
    private String addrPostCode;

    /**
     * 状态,1正常，0无效
     */
    private Integer addrStatus;

    /**
     * 是否默认地址 1是;1:是  0:否
     */
    private Integer addrDefault;

    /**
     * 创建时间
     */
    private Date addrCreateTime;

    /**
     * 更新时间
     */
    private Date addrUpdateTime;

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}