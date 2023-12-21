package com.deean.dnmall.service;

import com.deean.dnmall.bean.ProductComment;
import com.baomidou.mybatisplus.extension.service.IService;
import com.deean.dnmall.vo.ResultVO;

/**
* @author Deean
* @description 针对表【product_comment(商品评价)】的数据库操作Service
* @createDate 2023-12-20 21:53:51
*/
public interface ProductCommentService extends IService<ProductComment> {

    ResultVO getCommentCountByProductId(int productId);

    ResultVO listCommentsByProductId(int productId, int pageNum, int limit);
}
