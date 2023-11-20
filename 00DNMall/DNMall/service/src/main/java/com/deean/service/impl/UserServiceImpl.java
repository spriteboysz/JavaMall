package com.deean.service.impl;

import com.deean.dnmall.bean.User;
import com.deean.dnmall.dao.UserDAO;
import com.deean.dnmall.vo.ResultVO;
import com.deean.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * Author: Deean
 * Date: 2023-11-20 23:16
 * FileName: service/src/main/java/com/deean/service/impl
 * Description:
 */

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDAO userDAO;

    @Override
    public ResultVO checkLogin(String name, String password) {
        User user = userDAO.queryUserByName(name);
        if (user == null) {
            return new ResultVO(10001, "用户名不存在", null);
        } else {
            if (user.getUserPassword().equals(password)) {
                return new ResultVO(10000, "登录成功", user);
            } else {
                return new ResultVO(10001, "密码不正确", null);
            }
        }
    }
}
