package com.deean.dnmall.controller;

import com.deean.dnmall.service.UserService;
import com.deean.dnmall.vo.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
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
@Tag(name = "用户管理类", description = "用户管理类测试")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/login")
    @Operation(summary = "用户登录")
    @Parameters({@Parameter(name = "name", description = "用户名"),
            @Parameter(name = "password", description = "密码")})
    public ResultVO login(String name, String password) {
        return userService.checkLogin(name, password);
    }

    @PostMapping("/register")
    @Operation(summary = "用户注册")
    @Parameters({@Parameter(name = "name", description = "用户名"),
            @Parameter(name = "password", description = "密码")})
    public ResultVO register(String name, String password) {
        return userService.register(name, password);
    }
}
