package com.deean;

import com.deean.dnmall.bean.ShoppingCartVO;
import com.deean.dnmall.mapper.ShoppingCartMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

/**
 * Author: Deean
 * Date: 2023-12-28 23:32
 * FileName: api/src/test/java/com/deean
 * Description:
 */

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class ShoppingCartMapperTest {

    @Resource
    private ShoppingCartMapper shoppingCartMapper;

    @Test
    public void listShoppingCartTest() {
        List<ShoppingCartVO> shoppingCartVOS = shoppingCartMapper.selectCartByUserId(1);
        for (ShoppingCartVO shoppingCartVO : shoppingCartVOS) {
            System.out.println(shoppingCartVO);
        }
    }

    @Test
    public void addShoppingCartTest() {
        int i = shoppingCartMapper.updateCartNumByCartId(5, 2);
        assert(i > 0);
        System.out.println(i);
    }
}
