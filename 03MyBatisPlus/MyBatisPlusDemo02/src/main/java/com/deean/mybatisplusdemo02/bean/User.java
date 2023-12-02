package com.deean.mybatisplusdemo02.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

/**
 * @TableName users
 */
@TableName(value = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    @TableId
    private Integer userId;

    private String userName;

    private String userPassword;

    private String userRealname;

    private String userGender;

    private String userTel;

    private String userDesc;

    @Serial
    private static final long serialVersionUID = 1L;
}