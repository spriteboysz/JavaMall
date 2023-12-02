package com.deean.mybatisplusdemo02.mapper;

import com.deean.mybatisplusdemo02.bean.Book;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class BookMapperTest {

    @Resource
    private BookMapper bookMapper;

    @Test
    public void queryTest01() {
        List<Book> books = bookMapper.selectList(null);
        books.forEach(System.out::println);
    }
}