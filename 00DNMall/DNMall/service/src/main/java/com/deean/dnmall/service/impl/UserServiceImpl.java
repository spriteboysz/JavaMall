package com.deean.dnmall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.deean.dnmall.bean.User;
import com.deean.dnmall.mapper.UserMapper;
import com.deean.dnmall.vo.ResultVO;
import com.deean.dnmall.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Deean
 * @description 针对表【user(用户)】的数据库操作Service实现
 * @createDate 2023-11-25 22:16:44
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public ResultVO checkLogin(String name, String password) {
        Map<String, Object> map = new HashMap<>();
        map.put("user_name", name);
        List<User> users = userMapper.selectByMap(map);
        if (users.isEmpty()) {
            return new ResultVO(10001, "用户名不存在", null);
        } else {
            if (users.get(0).getUserPassword().equals(password)) {
                return new ResultVO(10000, "登录成功", users.get(0));
            } else {
                return new ResultVO(10001, "登录失败", null);
            }
        }
    }
}




