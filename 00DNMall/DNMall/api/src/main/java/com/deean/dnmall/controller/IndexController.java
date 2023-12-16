package com.deean.dnmall.controller;

import com.deean.dnmall.service.CategoryService;
import com.deean.dnmall.service.RotationChartService;
import com.deean.dnmall.vo.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Deean
 * Date: 2023-12-15 22:24
 * FileName: api/src/main/java/com/deean/dnmall/controller
 * Description:
 */

@RestController
@RequestMapping("/index")
@Tag(name = "IndexManager", description = "首页管理")
@CrossOrigin
public class IndexController {

    @Resource
    private RotationChartService rotationChartService;

    @Resource
    private CategoryService categoryService;

    @GetMapping("/index-image")
    @Operation(summary = "轮播图管理")
    public ResultVO listRotationChar() {
        return rotationChartService.listRotationChart();
    }

    @GetMapping("/index-category")
    @Operation(summary = "主页分类管理")
    public ResultVO listCategory() {
        return categoryService.listCategories();
    }
}
