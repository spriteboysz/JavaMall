package com.deean.mybatisplusdemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.deean.mybatisplusdemo.bean.Book;
import com.deean.mybatisplusdemo.service.BookService;
import com.deean.mybatisplusdemo.mapper.BookMapper;
import org.springframework.stereotype.Service;

/**
* @author Deean
* @description 针对表【books】的数据库操作Service实现
* @createDate 2023-11-25 23:11:52
*/
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book>
    implements BookService {

}




