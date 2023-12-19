package com.deean.dnmall.controller;

import com.deean.dnmall.service.ProductService;
import com.deean.dnmall.vo.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

/**
 * Author: Deean
 * Date: 2023-12-19 23:12
 * FileName: api/src/main/java/com/deean/dnmall/controller
 * Description:
 */

@RestController
@RequestMapping("/product")
@Tag(name = "ProductManager", description = "商品页管理")
@CrossOrigin
public class ProductController {

    @Resource
    private ProductService productService;

    @Operation(summary = "商品基本信息查询接口")
    @GetMapping("/detail-info/{product_id}")
    private ResultVO getProductBasicInfo(@PathVariable("product_id") int productId) {
        return productService.getProductBasicInfo(productId);
    }
}
