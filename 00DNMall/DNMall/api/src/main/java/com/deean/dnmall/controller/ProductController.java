package com.deean.dnmall.controller;

import com.deean.dnmall.service.ProductCommentService;
import com.deean.dnmall.service.ProductService;
import com.deean.dnmall.vo.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
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
    @Resource
    private ProductCommentService productCommentService;


    @Operation(summary = "商品基本信息查询接口")
    @GetMapping("/detail-info/{product_id}")
    private ResultVO getProductBasicInfo(@PathVariable("product_id") int productId) {
        return productService.getProductBasicInfo(productId);
    }

    @Operation(summary = "商品参数信息查询接口")
    @GetMapping("/param-info/{product_id}")
    private ResultVO getProductParamInfo(@PathVariable("product_id") int productId) {
        return productService.getProductParamInfo(productId);
    }

    @Operation(summary = "商品评论信息查询接口")
    @GetMapping("/detail-comments/{product_id}")
    @Parameters({
            @Parameter(name = "pageNum", required = true),
            @Parameter(name = "limit", required = true)
    })
    public ResultVO getProductComments(@PathVariable("product_id") int productId, int pageNum, int limit) {
        return productCommentService.listCommentsByProductId(productId, pageNum, limit);
    }

    @Operation(summary = "商品评价统计查询接口")
    @GetMapping("/detail-comment-count/{product_id}")
    public ResultVO getProductCommentsCount(@PathVariable("product_id") int productId) {
        return productCommentService.getCommentCountByProductId(productId);
    }
}
