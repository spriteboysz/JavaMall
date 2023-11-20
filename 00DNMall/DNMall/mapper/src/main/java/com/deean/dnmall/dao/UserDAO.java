package com.deean.dnmall.dao;

import com.deean.dnmall.bean.User;

public interface UserDAO {
    User queryUserByName(String name);
}
