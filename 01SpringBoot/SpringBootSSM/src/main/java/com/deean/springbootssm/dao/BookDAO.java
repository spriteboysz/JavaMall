package com.deean.springbootssm.dao;

import com.deean.springbootssm.bean.Book;

import java.util.List;

public interface BookDAO {
    List<Book> queryBook();
}
