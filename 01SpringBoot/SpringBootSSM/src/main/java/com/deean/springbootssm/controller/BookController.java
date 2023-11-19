package com.deean.springbootssm.controller;

import com.deean.springbootssm.bean.Book;
import com.deean.springbootssm.service.BookService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Author: Deean
 * Date: 2023-11-19 17:31
 * FileName: src/main/java/com/deean/springbootssm/controller
 * Description:
 */

@Controller
@RequestMapping("/book")
public class BookController {

    @Resource
    BookService bookService;

    @RequestMapping("/add")
    @ResponseBody
    public Book addBook(Book book) {
        return bookService.addBook(book);
    }

    @RequestMapping("/list")
    public String listBook(Model model) {
        List<Book> books = bookService.listBook();
        model.addAttribute("books", books);
        return "book";
    }

}
