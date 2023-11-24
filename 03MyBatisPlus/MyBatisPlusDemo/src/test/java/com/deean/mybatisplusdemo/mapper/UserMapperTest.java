package com.deean.mybatisplusdemo.mapper;

import com.deean.mybatisplusdemo.bean.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Test
    public void queryTest02() {
        Map<String, Object> map = new HashMap<>();
        map.put("user_name", "Deean");
        List<User> users = userMapper.selectByMap(map);
        users.forEach(System.out::println);
    }

    @Test
    public void queryTest03() {
        Long num = userMapper.selectCount(null);
        System.out.println(num);
    }

}