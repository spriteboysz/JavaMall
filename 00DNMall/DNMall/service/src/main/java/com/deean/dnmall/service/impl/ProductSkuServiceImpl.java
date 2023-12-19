package com.deean.dnmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.deean.dnmall.bean.ProductSku;
import com.deean.dnmall.service.ProductSkuService;
import com.deean.dnmall.mapper.ProductSkuMapper;
import org.springframework.stereotype.Service;

/**
* @author Deean
* @description 针对表【product_sku(商品规格;每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计)】的数据库操作Service实现
* @createDate 2023-12-19 22:49:53
*/
@Service
public class ProductSkuServiceImpl extends ServiceImpl<ProductSkuMapper, ProductSku>
    implements ProductSkuService{

}




