package com.deean.dnmall.controller;

import com.deean.dnmall.vo.ResultVO;
import com.deean.dnmall.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Deean
 * Date: 2023-11-20 23:26
 * FileName: api/src/main/java/com/deean/dnmall/controller
 * Description:
 */

@RestController
@RequestMapping("/user")
@Tag(name = "用户管理类")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/login")
    @Operation(summary = "用户登录")
    public ResultVO login(String name, String password) {
        return userService.checkLogin(name, password);
    }
}
