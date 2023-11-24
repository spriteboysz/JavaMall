package com.deean.dnmall.mapper;

import com.deean.dnmall.bean.User;

public interface UserDAO {
    User queryUserByName(String name);
}
