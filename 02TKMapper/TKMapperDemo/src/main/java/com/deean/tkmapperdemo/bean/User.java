package com.deean.tkmapperdemo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Author: Deean
 * Date: 2023-11-23 23:15
 * FileName: src/main/java/com/deean/tkmapperdemo/bean
 * Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    private Integer userId;
    private String userName;
    private String userPassword;
    private String userRealname;
    private String userGender;
    private String userTel;
    private String userDesc;
}
