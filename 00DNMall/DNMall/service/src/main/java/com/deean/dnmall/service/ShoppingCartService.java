package com.deean.dnmall.service;

import com.deean.dnmall.bean.ShoppingCart;
import com.baomidou.mybatisplus.extension.service.IService;
import com.deean.dnmall.vo.ResultVO;

/**
* @author Deean
* @description 针对表【shopping_cart(购物车)】的数据库操作Service
* @createDate 2023-12-25 22:57:16
*/
public interface ShoppingCartService extends IService<ShoppingCart> {
    ResultVO addShoppingCart(ShoppingCart cart);

    ResultVO listShoppingCartsByUserId(int userId);

    ResultVO updateCartNum(int cartId,int cartNum);
}
