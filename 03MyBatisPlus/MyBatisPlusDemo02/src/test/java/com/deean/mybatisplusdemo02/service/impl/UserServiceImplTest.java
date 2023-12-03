package com.deean.mybatisplusdemo02.service.impl;

import com.deean.mybatisplusdemo02.bean.User;
import com.deean.mybatisplusdemo02.service.UserService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Map;

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

    @Test
    public void queryTest02() {
        long count = userService.count();
        System.out.println(count);
    }

    @Test
    public void queryTest03(){
        List<Map<String, Object>> maps = userService.listMaps();
        for (Map<String, Object> map : maps) {
            System.out.println(map);
        }
    }
}