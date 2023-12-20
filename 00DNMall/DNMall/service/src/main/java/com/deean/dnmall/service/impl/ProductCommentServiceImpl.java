package com.deean.dnmall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.deean.dnmall.bean.ProductComment;
import com.deean.dnmall.bean.ProductCommentVO;
import com.deean.dnmall.mapper.ProductCommentMapper;
import com.deean.dnmall.service.ProductCommentService;
import com.deean.dnmall.vo.ResStatus;
import com.deean.dnmall.vo.ResultVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Deean
 * @description 针对表【product_comment(商品评价)】的数据库操作Service实现
 * @createDate 2023-12-20 21:53:51
 */
@Service
public class ProductCommentServiceImpl extends ServiceImpl<ProductCommentMapper, ProductComment>
        implements ProductCommentService {

    @Resource
    private ProductCommentMapper productCommentMapper;


    @Override
    public ResultVO listCommontsByProductId(int productId, int pageNum, int limit) {
        //1.根据商品id查询总记录数
        QueryWrapper<ProductComment> wrapper = new QueryWrapper<>();
        //eq() 等于
        wrapper.eq("product_id", productId);

        Long count = productCommentMapper.selectCount(wrapper);

        //2.计算总页数（必须确定每页显示多少条  pageSize = limit）
        int pageCount = (int) (count % limit == 0 ? count / limit : count / limit + 1);

        //3.查询当前页的数据（因为评论中需要用户信息，因此需要连表查询---自定义）
        int start = (pageNum - 1) * limit;
        List<ProductCommentVO> list = productCommentMapper.selectCommentsByProductId(productId, start, limit);

        return new ResultVO(ResStatus.success, "success", list);
    }
}




