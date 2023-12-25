package com.deean.dnmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.deean.dnmall.bean.ShoppingCart;
import com.deean.dnmall.service.ShoppingCartService;
import com.deean.dnmall.mapper.ShoppingCartMapper;
import org.springframework.stereotype.Service;

/**
* @author Deean
* @description 针对表【shopping_cart(购物车)】的数据库操作Service实现
* @createDate 2023-12-25 22:57:16
*/
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart>
    implements ShoppingCartService{

}




