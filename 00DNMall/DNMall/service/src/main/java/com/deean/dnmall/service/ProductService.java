package com.deean.dnmall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.deean.dnmall.bean.Product;
import com.deean.dnmall.vo.ResultVO;

/**
 * @author Deean
 * @description 针对表【product(商品;商品信息相关表：分类表，商品图片表，商品规格表，商品参数表)】的数据库操作Service
 * @createDate 2023-12-16 22:04:20
 */
public interface ProductService extends IService<Product> {
    ResultVO listRecommendProducts();

    ResultVO getProductBasicInfo(int productId);
}
