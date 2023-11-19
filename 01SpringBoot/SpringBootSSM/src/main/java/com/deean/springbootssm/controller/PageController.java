package com.deean.springbootssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: Deean
 * Date: 2023-11-19 20:15
 * FileName: src/main/java/com/deean/springbootssm/controller
 * Description:
 */

// 页面转发类
@Controller
public class PageController {

    @RequestMapping("/book.html")
    public String book(){
        return "book";
    }

    @RequestMapping("/list.html")
    public String list(){
        return "book";
    }
}
