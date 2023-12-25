package com.deean.dnmall.controller;

import com.deean.dnmall.bean.ShoppingCart;
import com.deean.dnmall.service.ShoppingCartService;
import com.deean.dnmall.vo.ResStatus;
import com.deean.dnmall.vo.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

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

    @Resource
    private ShoppingCartService shoppingCartService;

    @GetMapping("/list")
    @Operation(summary = "购物车列表")
    public ResultVO listCart(String token) {
        System.out.println("---购物车列表接口---");
        return new ResultVO(ResStatus.success, "success", null);
    }

    @PostMapping("/add")
    @Operation(summary = "添加购物车")
    public ResultVO addCart(@RequestBody ShoppingCart cart, @RequestHeader("token")String token) {
        return shoppingCartService.addShoppingCart(cart);
    }
}
