package com.deean;

import com.deean.dnmall.bean.CategoryVO;
import com.deean.dnmall.mapper.CategoryMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

/**
 * Author: Deean
 * Date: 2023-12-16 22:18
 * FileName: api/src/test/java/dnmall/mapper
 * Description:
 */

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class CategoryMapperTest {

    @Resource
    private CategoryMapper categoryMapper;

    @Test
    public void categoryMapperTest() {
        List<CategoryVO> categoryVOS = categoryMapper.selectAllCategories(0);
        for (CategoryVO categoryVO : categoryVOS) {
            System.out.println(categoryVO);
        }
    }
}
