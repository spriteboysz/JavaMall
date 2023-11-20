package com.deean.dnmall.controller;

import com.deean.dnmall.vo.ResultVO;
import com.deean.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Author: Deean
 * Date: 2023-11-20 23:26
 * FileName: api/src/main/java/com/deean/dnmall/controller
 * Description:
 */

@Controller
@ResponseBody
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/login")
    public ResultVO login(String name, String password) {
        return userService.checkLogin(name, password);
    }
}
