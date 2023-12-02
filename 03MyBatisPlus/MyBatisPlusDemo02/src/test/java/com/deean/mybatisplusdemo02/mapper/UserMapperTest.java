package com.deean.mybatisplusdemo02.mapper;

import com.deean.mybatisplusdemo02.bean.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void queryTest01() {
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
}