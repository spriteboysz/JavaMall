package com.deean.dnmall.mapper;

import com.deean.dnmall.bean.ProductSku;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author Deean
* @description 针对表【product_sku(商品规格;每一件商品都有不同的规格，不同的规格又有不同的价格和优惠力度，规格表为此设计)】的数据库操作Mapper
* @createDate 2023-12-19 22:49:53
* @Entity com.deean.dnmall.bean.ProductSku
*/
public interface ProductSkuMapper extends BaseMapper<ProductSku> {

}




