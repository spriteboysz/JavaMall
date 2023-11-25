package com.deean.mybatisplusdemo.mapper;

import com.deean.mybatisplusdemo.bean.Book;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BookMapperTest {

    @Resource
    private BookMapper bookMapper;

    @Test
    public void queryTest01() {
        List<Book> books = bookMapper.selectList(null);
        books.forEach(book -> System.out.println());
    }
}