package com.deean.dnmall.controller;

import com.deean.dnmall.service.UserService;
import com.deean.dnmall.vo.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

/**
 * Author: Deean
 * Date: 2023-11-20 23:26
 * FileName: api/src/main/java/com/deean/dnmall/controller
 * Description:
 */

// API: http://localhost:8080/swagger-ui/index.html#/UserManager/
@RestController
@RequestMapping("/user")
@Tag(name = "UserManager", description = "用户管理类测试")
@CrossOrigin
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/login")
    @Operation(summary = "用户登录")
    @Parameters({@Parameter(name = "username", description = "用户名"),
            @Parameter(name = "password", description = "密码")})
    public ResultVO login(String username, String password) {
        return userService.checkLogin(username, password);
    }

    @PostMapping("/register")
    @Operation(summary = "用户注册")
    @Parameters({@Parameter(name = "username", description = "用户名"),
            @Parameter(name = "password", description = "密码")})
    public ResultVO register(String username, String password) {
        System.out.println("===" + username);
        return userService.userRegister(username, password);
    }
}
