package com.deean.dnmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.deean.dnmall.bean.Order;
import com.deean.dnmall.service.OrderService;
import com.deean.dnmall.mapper.OrderMapper;
import org.springframework.stereotype.Service;

/**
* @author Deean
* @description 针对表【orders(订单)】的数据库操作Service实现
* @createDate 2023-12-30 18:10:14
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService{

}




