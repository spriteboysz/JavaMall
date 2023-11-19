package com.deean.springbootssm.service.impl;

import com.deean.springbootssm.bean.Book;
import com.deean.springbootssm.dao.BookDAO;
import com.deean.springbootssm.service.BookService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: Deean
 * Date: 2023-11-19 17:29
 * FileName: src/main/java/com/deean/springbootssm/service/impl
 * Description:
 */

@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookDAO bookDAO;

    @Override
    public List<Book> listBook() {
        return bookDAO.queryBook();
    }

    @Override
    public Book addBook(Book book) {
        int i = bookDAO.insertBook(book);
        if (i > 0) {
            return book;
        }
        return null;
    }
}
