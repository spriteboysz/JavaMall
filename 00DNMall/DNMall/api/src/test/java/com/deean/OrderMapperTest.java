package com.deean;

import com.deean.dnmall.bean.Order;
import com.deean.dnmall.mapper.OrderMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

/**
 * Author: Deean
 * Date: 2023-12-30 18:15
 * FileName: api/src/test/java/com/deean
 * Description:
 */

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class OrderMapperTest {

    @Resource
    private OrderMapper orderMapper;

    @Test
    public void orderMapperTest() {
        List<Order> orders = orderMapper.selectList(null);
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
