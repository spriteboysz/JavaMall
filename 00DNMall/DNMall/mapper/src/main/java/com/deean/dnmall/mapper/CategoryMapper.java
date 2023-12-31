package com.deean.dnmall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deean.dnmall.bean.Category;
import com.deean.dnmall.bean.CategoryVO;

import java.util.List;

/**
* @author Deean
* @description 针对表【category(商品分类)】的数据库操作Mapper
* @createDate 2023-12-16 21:51:19
* @Entity com.deean.dnmall.bean.Category
*/
public interface CategoryMapper extends BaseMapper<Category> {
    List<CategoryVO> selectAllCategories(int parentId);

    List<CategoryVO> selectFirstLevelCategories();
}
