package com.deean.mybatisplusdemo.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Deean
 * Date: 2023-11-24 21:46
 * FileName: src/main/java/com/deean/mybatisplusdemo/bean
 * Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("users")
public class User {
    @TableId
    private Integer userId;
    private String userName;
    private String userPassword;
    private String userRealname;
    private String userGender;
    private String userTel;
    private String userDesc;
}
