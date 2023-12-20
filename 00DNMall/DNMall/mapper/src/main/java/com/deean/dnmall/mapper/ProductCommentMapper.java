package com.deean.dnmall.mapper;

import com.deean.dnmall.bean.ProductComment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deean.dnmall.bean.ProductCommentVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author Deean
* @description 针对表【product_comment(商品评价)】的数据库操作Mapper
* @createDate 2023-12-20 21:53:51
* @Entity com.deean.dnmall.bean.ProductComment
*/
public interface ProductCommentMapper extends BaseMapper<ProductComment> {
    /**
     * 根据商品id分页查询评论信息
     * @param productId 商品ID
     * @param start 起始索引
     * @param limit 查询条数
     */
    List<ProductCommentVO> selectCommentsByProductId(@Param("productId")  int productId,
                                                     @Param("start") int start,
                                                     @Param("limit") int limit);
}




