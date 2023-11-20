package com.deean.service;

import com.deean.dnmall.vo.ResultVO;

public interface UserService {
    ResultVO checkLogin(String name, String password);
}
