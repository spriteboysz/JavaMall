package com.deean.springbootssm.dao;

import com.deean.springbootssm.bean.Book;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration()
class BookDAOTest {

    @Resource
    private BookDAO bookDAO;

    @Test
    void queryBook() {
        List<Book> books = bookDAO.queryBook();
        for (Book book : books) {
            System.out.println(book);
        }
    }
}