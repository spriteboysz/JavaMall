package com.deean.dnmall.mapper;

import com.deean.dnmall.bean.ShoppingCart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deean.dnmall.bean.ShoppingCartVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Deean
* @description 针对表【shopping_cart(购物车)】的数据库操作Mapper
* @createDate 2023-12-25 22:57:16
* @Entity com.deean.dnmall.bean.ShoppingCart
*/
public interface ShoppingCartMapper extends BaseMapper<ShoppingCart> {
    List<ShoppingCartVO> selectCartByUserId(int userId);

    int updateCartNumByCartId(@Param("cartId") int cartId,
                              @Param("cartNum") int cartNum);

    List<ShoppingCartVO> selectShoppingcartByCartIds(List<Integer> cart_ids);
}




