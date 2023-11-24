package com.deean.mybatisplusdemo.mapper;

import com.deean.mybatisplusdemo.bean.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class UserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void queryTest01() {
        List<User> users = userMapper.selectList(null);
        assertNotNull(users);
        users.forEach(System.out::println);
    }

}