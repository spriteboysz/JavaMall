package com.deean.mybatisplusdemo.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName members
 */
@TableName(value ="members")
@Data
public class Member implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer memberId;

    /**
     * 
     */
    private String memberNick;

    /**
     * 
     */
    private String memberGender;

    /**
     * 
     */
    private Integer memberAge;

    /**
     * 
     */
    private String memberCity;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}