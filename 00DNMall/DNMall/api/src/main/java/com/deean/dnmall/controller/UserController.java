package com.deean.dnmall.controller;

import com.deean.dnmall.vo.ResultVO;
import com.deean.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Deean
 * Date: 2023-11-20 23:26
 * FileName: api/src/main/java/com/deean/dnmall/controller
 * Description:
 */

@RestController
@RequestMapping("/user")
@Schema(name="", description="")
@Tag(name = "UserController")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/login")
    @Operation(summary = "获取用户信息", description = "获取用户信息")
    public ResultVO login(String name, String password) {
        return userService.checkLogin(name, password);
    }
}
