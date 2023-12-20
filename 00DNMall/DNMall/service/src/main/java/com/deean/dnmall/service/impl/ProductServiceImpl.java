package com.deean.dnmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.deean.dnmall.bean.*;
import com.deean.dnmall.mapper.ProductImageMapper;
import com.deean.dnmall.mapper.ProductMapper;
import com.deean.dnmall.mapper.ProductParamMapper;
import com.deean.dnmall.mapper.ProductSkuMapper;
import com.deean.dnmall.service.ProductService;
import com.deean.dnmall.vo.ResStatus;
import com.deean.dnmall.vo.ResultVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
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
    @Resource
    private ProductImageMapper productImageMapper;
    @Resource
    private ProductSkuMapper productSkuMapper;
    @Resource
    private ProductParamMapper productParamMapper;


    @Override
    public ResultVO listRecommendProducts() {
        List<ProductVO> productVOS = productMapper.selectRecommendProducts();
        return new ResultVO(ResStatus.success, "success", productVOS);
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public ResultVO getProductBasicInfo(int productId) {
        // 1.商品基本信息
        HashMap<String, Object> map = new HashMap<>();
        map.put("product_id", productId);
        map.put("product_status", 1);
        List<Product> products = productMapper.selectByMap(map);

        if (!products.isEmpty()) {
            // 2. 商品图片信息
            HashMap<String, Object> map1 = new HashMap<>();
            map1.put("product_id", productId);
            List<ProductImage> productImages = productImageMapper.selectByMap(map1);
            // 3. 商品SKU信息
            HashMap<String, Object> map2 = new HashMap<>();
            map2.put("product_id", productId);
            map2.put(" sku_status", 1);
            List<ProductSku> productSkus = productSkuMapper.selectByMap(map2);

            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("product", products.getFirst());
            hashMap.put("productImage", productImages);
            hashMap.put("productSku", productSkus);
            return new ResultVO(ResStatus.success, "success", hashMap);
        } else {
            return new ResultVO(ResStatus.fail, "fail", null);
        }
    }

    @Override
    public ResultVO getProductParamInfo(int productId) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("product_id", productId);
        List<ProductParam> productParams = productParamMapper.selectByMap(map);
        if (productParams.isEmpty()) {
            return new ResultVO(ResStatus.fail, "fail", null);
        } else {
            return new ResultVO(ResStatus.success, "success", productParams);
        }
    }
}



