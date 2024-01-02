package com.deean.dnmall.controller;

import com.deean.dnmall.service.UserAddressService;
import com.deean.dnmall.vo.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

/**
 * Author: Deean
 * Date: 2024-01-02 22:48
 * FileName: api/src/main/java/com/deean/dnmall/controller
 * Description:
 */

@RestController
@RequestMapping("/user-address")
@Tag(name = "UserAddressManager", description = "用户地址管理")
@CrossOrigin
public class UserAddressController {

    @Resource
    private UserAddressService userAddressService;

    @GetMapping("/list")
    @Operation(summary = "用户地址列表")
    @Parameters({@Parameter(name = "userId", description = "用户ID")})
    public ResultVO listCart(Integer userId, @RequestHeader("token") String token) {
        System.out.println(token);
        return userAddressService.listAddrsByUserId(userId);
    }
}
