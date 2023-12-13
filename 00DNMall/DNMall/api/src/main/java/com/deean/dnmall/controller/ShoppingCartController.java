package com.deean.dnmall.controller;

import com.deean.dnmall.vo.ResStatus;
import com.deean.dnmall.vo.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Deean
 * Date: 2023-12-13 23:16
 * FileName: api/src/main/java/com/deean/dnmall/controller
 * Description:
 */

@RestController
@RequestMapping("/shoppingcart")
@CrossOrigin
@Tag(name = "ShoppingCartManager", description = "购物车管理")
public class ShoppingCartController {

    @GetMapping("/list")
    @Operation(summary = "购物车列表")
    public ResultVO listCart() {
        System.out.println("---购物车列表接口---");
        return new ResultVO(ResStatus.success, "success", null);
    }
}
