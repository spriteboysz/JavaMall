package com.deean.dnmall.controller;

import com.deean.dnmall.bean.ShoppingCart;
import com.deean.dnmall.service.ShoppingCartService;
import com.deean.dnmall.vo.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

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

    @PostMapping("/add")
    @Operation(summary = "添加购物车")
    public ResultVO addCart(@RequestBody ShoppingCart cart, @RequestHeader("token") String token) {
        System.out.println(token);

        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        cart.setCartTime(dateFormat.format(date));
        return shoppingCartService.addShoppingCart(cart);
    }

    @GetMapping("/list")
    @Operation(summary = "购物车列表")
    @Parameters({@Parameter(name = "userId", description = "用户ID")})
    public ResultVO listCart(Integer userId, @RequestHeader("token") String token) {
        System.out.println(token);
        return shoppingCartService.listShoppingCartsByUserId(userId);
    }

    @PutMapping("/update/{cid}/{num}")
    public ResultVO updateNum(@PathVariable("cid") Integer cartId,
                              @PathVariable("num") Integer cartNum,
                              @RequestHeader("token") String token) {
        System.out.println(token);
        return shoppingCartService.updateCartNum(cartId, cartNum);
    }
}
