package com.deean.dnmall.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.deean.dnmall.bean.ProductComment;
import com.deean.dnmall.bean.ProductCommentVO;
import com.deean.dnmall.mapper.ProductCommentMapper;
import com.deean.dnmall.service.ProductCommentService;
import com.deean.dnmall.util.PageHelper;
import com.deean.dnmall.vo.ResStatus;
import com.deean.dnmall.vo.ResultVO;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.HashMap;
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
    public ResultVO getCommentCountByProductId(int productId) {

        QueryWrapper<ProductComment> wrapper = new QueryWrapper<>();
        //1.查询当前商品评价的总数
        HashMap<String, Object> hash = new HashMap<>();
        hash.put("product_id", productId);
        wrapper.allEq(hash);
        Long total = productCommentMapper.selectCount(wrapper);

        //2.查询好评评价数
        hash.put("comment_type", 1);
        wrapper.clear();
        wrapper.allEq(hash);
        Long goodTotal = productCommentMapper.selectCount(wrapper);

        //3.查询中评评价数
        hash.put("comment_type", 0);
        wrapper.clear();
        wrapper.allEq(hash);
        Long midTotal = productCommentMapper.selectCount(wrapper);

        //4.查询差评评价数
        hash.put("comment_type", -1);
        wrapper.clear();
        wrapper.allEq(hash);
        Long badTotal = productCommentMapper.selectCount(wrapper);

        //5.计算好评率
        double percent = (Double.parseDouble(goodTotal + "") / Double.parseDouble(total + "")) * 100;
        String percentValue = (percent + "").substring(0, (percent + "").lastIndexOf(".") + 3);

        HashMap<String, Object> map = new HashMap<>();
        map.put("total", total);
        map.put("goodTotal", goodTotal);
        map.put("midTotal", midTotal);
        map.put("badTotal", badTotal);
        map.put("percent", percentValue);

        return new ResultVO(ResStatus.success, "success", map);
    }

    @Override
    public ResultVO listCommentsByProductId(int productId, int pageNum, int limit) {
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

        return new ResultVO(ResStatus.success, "success", new PageHelper<>(count, pageCount, list));
    }
}




