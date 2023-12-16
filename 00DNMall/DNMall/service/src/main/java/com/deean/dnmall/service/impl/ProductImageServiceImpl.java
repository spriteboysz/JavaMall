package com.deean.dnmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.deean.dnmall.bean.ProductImage;
import com.deean.dnmall.service.ProductImageService;
import com.deean.dnmall.mapper.ProductImageMapper;
import org.springframework.stereotype.Service;

/**
* @author Deean
* @description 针对表【product_image(商品图片)】的数据库操作Service实现
* @createDate 2023-12-16 22:04:20
*/
@Service
public class ProductImageServiceImpl extends ServiceImpl<ProductImageMapper, ProductImage>
    implements ProductImageService{

}




