package com.deean;

import com.deean.dnmall.bean.ProductVO;
import com.deean.dnmall.mapper.ProductMapper;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

/**
 * Author: Deean
 * Date: 2023-12-16 23:14
 * FileName: api/src/test/java/com/deean
 * Description:
 */

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class ProductMapperTest {

    @Resource
    private ProductMapper productMapper;

    @Test
    public void productMapperTest() {
        List<ProductVO> productVOS = productMapper.selectRecommendProducts();
        productVOS.forEach(System.out::println);
    }
}
