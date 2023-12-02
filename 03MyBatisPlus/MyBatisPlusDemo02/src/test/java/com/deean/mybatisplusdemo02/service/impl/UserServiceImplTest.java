package com.deean.mybatisplusdemo02.service.impl;

import com.deean.mybatisplusdemo02.bean.User;
import com.deean.mybatisplusdemo02.service.UserService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class UserServiceImplTest {

    @Resource
    private UserService userService;

    @Test
    public void queryTest01() {
        List<User> users = userService.list();
        for (User user : users) {
            System.out.println(user);
        }
    }
}