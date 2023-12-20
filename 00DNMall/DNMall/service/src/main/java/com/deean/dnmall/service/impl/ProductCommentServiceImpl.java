package com.deean.dnmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.deean.dnmall.bean.ProductComment;
import com.deean.dnmall.service.ProductCommentService;
import com.deean.dnmall.mapper.ProductCommentMapper;
import org.springframework.stereotype.Service;

/**
* @author Deean
* @description 针对表【product_comment(商品评价)】的数据库操作Service实现
* @createDate 2023-12-20 21:53:51
*/
@Service
public class ProductCommentServiceImpl extends ServiceImpl<ProductCommentMapper, ProductComment>
    implements ProductCommentService{

}




