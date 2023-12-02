package com.deean.mybatisplusdemo02.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName members
 */
@TableName(value = "members")
@Data
public class Member implements Serializable {
    @TableId
    private Integer memberId;

    private String memberNick;

    private String memberGender;

    private Integer memberAge;

    private String memberCity;

    private static final long serialVersionUID = 1L;
}