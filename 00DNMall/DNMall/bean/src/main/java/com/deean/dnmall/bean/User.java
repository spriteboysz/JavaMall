package com.deean.dnmall.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Author: Deean
 * Date: 2023-11-20 23:01
 * FileName: bean/src/main/java/com/deean/dnmall/dao
 * Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@Schema(name = "User", description = "用户实体类")
public class User {
    private int userId;
    private String userName;
    private String userPassword;
}
