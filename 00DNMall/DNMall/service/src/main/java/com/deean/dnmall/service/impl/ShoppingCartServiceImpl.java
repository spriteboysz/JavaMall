package com.deean.dnmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.deean.dnmall.bean.ShoppingCart;
import com.deean.dnmall.bean.ShoppingCartVO;
import com.deean.dnmall.mapper.ShoppingCartMapper;
import com.deean.dnmall.service.ShoppingCartService;
import com.deean.dnmall.vo.ResStatus;
import com.deean.dnmall.vo.ResultVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Deean
 * @description 针对表【shopping_cart(购物车)】的数据库操作Service实现
 * @createDate 2023-12-25 22:57:16
 */
@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart>
        implements ShoppingCartService {

    @Resource
    private ShoppingCartMapper shoppingCartMapper;

    @Override
    public ResultVO addShoppingCart(ShoppingCart cart) {
        int insert = shoppingCartMapper.insert(cart);
        if (insert > 0) {
            return new ResultVO(ResStatus.success, "success", null);
        } else {
            return new ResultVO(ResStatus.fail, "fail", null);
        }
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ResultVO listShoppingCartsByUserId(int userId) {
        List<ShoppingCartVO> list = shoppingCartMapper.selectCartByUserId(userId);
        System.out.println(list);
        return new ResultVO(ResStatus.success, "success", list);
    }

    @Override
    public ResultVO updateCartNum(int cartId, int cartNum) {
        int i = shoppingCartMapper.updateCartNumByCartId(cartId, cartNum);
        if (i > 0) {
            return new ResultVO(ResStatus.success, "update success", null);
        } else {
            return new ResultVO(ResStatus.fail, "update fail", null);
        }
    }

    @Override
    public ResultVO listShoppingCartsByCartIds(String cart_ids) {
        String[] arr = cart_ids.split(",");
        List<Integer> cartIds = new ArrayList<>();
        for (String s : arr) {
            cartIds.add(Integer.parseInt(s));
        }
        List<ShoppingCartVO> shoppingCartVOS = shoppingCartMapper.selectShoppingcartByCartIds(cartIds);
        return new ResultVO(ResStatus.success, "success", shoppingCartVOS);
    }
}




