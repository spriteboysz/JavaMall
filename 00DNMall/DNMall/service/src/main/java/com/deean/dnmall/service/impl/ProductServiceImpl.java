package com.deean.dnmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.deean.dnmall.bean.Product;
import com.deean.dnmall.bean.ProductVO;
import com.deean.dnmall.mapper.ProductMapper;
import com.deean.dnmall.service.ProductService;
import com.deean.dnmall.vo.ResStatus;
import com.deean.dnmall.vo.ResultVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Deean
 * @description 针对表【product(商品;商品信息相关表：分类表，商品图片表，商品规格表，商品参数表)】的数据库操作Service实现
 * @createDate 2023-12-16 22:04:20
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product>
        implements ProductService {

    @Resource
    private ProductMapper productMapper;

    @Override
    public ResultVO listRecommendProducts() {
        List<ProductVO> productVOS = productMapper.selectRecommendProducts();
        return new ResultVO(ResStatus.success, "success", productVOS);
    }
}




