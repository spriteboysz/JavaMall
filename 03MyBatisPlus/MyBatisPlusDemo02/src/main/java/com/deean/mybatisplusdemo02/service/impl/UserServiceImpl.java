package com.deean.mybatisplusdemo02.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.deean.mybatisplusdemo02.bean.User;
import com.deean.mybatisplusdemo02.service.UserService;
import com.deean.mybatisplusdemo02.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author Deean
* @description 针对表【users】的数据库操作Service实现
* @createDate 2023-12-02 22:34:17
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




