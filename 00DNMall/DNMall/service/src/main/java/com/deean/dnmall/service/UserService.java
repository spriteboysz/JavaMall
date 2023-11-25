package com.deean.dnmall.service;

import com.deean.dnmall.bean.User ;
import com.baomidou.mybatisplus.extension.service.IService;
import com.deean.dnmall.vo.ResultVO;

/**
* @author Deean
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2023-11-25 22:16:44
*/
public interface UserService extends IService<User> {

    ResultVO checkLogin(String name, String password);
}
