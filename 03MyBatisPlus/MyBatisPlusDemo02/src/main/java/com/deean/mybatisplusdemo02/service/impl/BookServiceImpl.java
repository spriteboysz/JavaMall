package com.deean.mybatisplusdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.deean.mybatisplusdemo02.bean.Book;
import com.deean.mybatisplusdemo02.service.BookService;
import com.deean.mybatisplusdemo02.mapper.BookMapper;
import org.springframework.stereotype.Service;

/**
* @author Deean
* @description 针对表【books】的数据库操作Service实现
* @createDate 2023-12-02 23:08:19
*/
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book>
    implements BookService{

}




