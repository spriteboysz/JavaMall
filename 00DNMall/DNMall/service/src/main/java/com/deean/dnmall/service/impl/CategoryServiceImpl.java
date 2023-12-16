package com.deean.dnmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.deean.dnmall.bean.Category;
import com.deean.dnmall.service.CategoryService;
import com.deean.dnmall.mapper.CategoryMapper;
import org.springframework.stereotype.Service;

/**
* @author Deean
* @description 针对表【category(商品分类)】的数据库操作Service实现
* @createDate 2023-12-16 21:51:19
*/
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category>
    implements CategoryService{

}




